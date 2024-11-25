package pe.edu.i202222714.domain;
import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {
    @EmbeddedId
    private LanguagePk LanguagePk;
    private String IsOfficial;
    private Double Percentage;

    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    @MapsId("CountryCode")
    private Country country;

    public CountryLanguage() {
    }

    public CountryLanguage(pe.edu.i202222714.domain.LanguagePk languagePk) {
        LanguagePk = languagePk;
    }

    public CountryLanguage(pe.edu.i202222714.domain.LanguagePk languagePk, String isOfficial, Double percentage, Country country) {
        LanguagePk = languagePk;
        IsOfficial = isOfficial;
        Percentage = percentage;
        this.country = country;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "LanguagePk=" + LanguagePk +
                ", IsOfficial='" + IsOfficial + '\'' +
                ", Percentage=" + Percentage +
                ", country=" + country +
                '}';
    }

    public pe.edu.i202222714.domain.LanguagePk getLanguagePk() {
        return LanguagePk;
    }

    public void setLanguagePk(pe.edu.i202222714.domain.LanguagePk languagePk) {
        LanguagePk = languagePk;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        IsOfficial = isOfficial;
    }

    public Double getPercentage() {
        return Percentage;
    }

    public void setPercentage(Double percentage) {
        Percentage = percentage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
