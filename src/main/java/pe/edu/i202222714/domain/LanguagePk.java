package pe.edu.i202222714.domain;
import jakarta.persistence.Embeddable;

@Embeddable
public class LanguagePk {
    private String Language;
    private String CountryCode;

    public LanguagePk() {
    }

    public LanguagePk(String language, String countryCode) {
        Language = language;
        CountryCode = countryCode;
    }

    @Override
    public String toString() {
        return "LanguagePk{" +
                "Language='" + Language + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                '}';
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }
}
