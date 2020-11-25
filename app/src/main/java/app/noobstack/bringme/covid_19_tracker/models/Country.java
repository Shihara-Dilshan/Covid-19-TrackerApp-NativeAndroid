package app.noobstack.bringme.covid_19_tracker.models;

public class Country {
    private final String country;
    private final String countryCode;

    public Country(String country, String countryCode) {
        this.country = country;
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
