package pe.edu.i202222714.domain;
import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {
    @Id
    private Integer ID;
    private String Name;
    private String District;
    private Integer Population;

    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country pais;

    public City() {
    }

    public City(Integer ID) {
        this.ID = ID;
    }

    public City(Integer ID, String name, String district, Integer population, Country pais) {
        this.ID = ID;
        Name = name;
        District = district;
        Population = population;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "City{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                ", pais=" + pais +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public Integer getPopulation() {
        return Population;
    }

    public void setPopulation(Integer population) {
        Population = population;
    }

    public Country getPais() {
        return pais;
    }

    public void setPais(Country pais) {
        this.pais = pais;
    }
}
