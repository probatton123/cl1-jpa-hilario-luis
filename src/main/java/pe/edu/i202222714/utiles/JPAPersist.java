package pe.edu.i202222714.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;
import pe.edu.i202222714.domain.City;
import pe.edu.i202222714.domain.Country;
import pe.edu.i202222714.domain.CountryLanguage;
import pe.edu.i202222714.domain.LanguagePk;

import java.util.Arrays;

public class JPAPersist {

    @Transactional
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("examen");
        EntityManager em = emf.createEntityManager();

        Country country = new Country("AAA","Narnia","South America","South America",25000.00,1889,60000,65.5,750.0,584.0,"Narnia","Republic","Luis Hilario",4080,"AA",null,null);

        City city1 = new City(4080,"Narnio","Ciudad1",55000,country);
        City city2 = new City(4081,"Narnio2","Ciudad2",46000,country);
        City city3 = new City(4082,"Narnio3","Ciudad3",8000,country);

        // Creamos las 2 lenguas para el país imaginario
        LanguagePk langPk1 = new LanguagePk("French", "AAA");
        LanguagePk langPk2 = new LanguagePk("Portuguese", "AAA");

        CountryLanguage language1 = new CountryLanguage(langPk1,"T",77.0,country);
        CountryLanguage language2 = new CountryLanguage(langPk2,"T",65.0,country);

        //Referenciamos ciudades en paises
        country.setCiudades(Arrays.asList(city1,city2,city3));

        //Referenciamos lenguajes en paises
        country.setIdiomas(Arrays.asList(language1,language2));

        em.getTransaction().begin();
        em.persist(country);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
