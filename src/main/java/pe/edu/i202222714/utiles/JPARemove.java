package pe.edu.i202222714.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;
import pe.edu.i202222714.domain.Country;

public class JPARemove {
    @Transactional
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("examen");
        EntityManager em = emf.createEntityManager();

        Country country = em.find(Country.class, "AAA");

        em.getTransaction().begin();
        em.remove(country);
        em.getTransaction().commit();
    }
}
