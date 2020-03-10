public class Location {
    private String City;
    private String Country;

    Location(String City, String Country){
        this.City = City;
        this.Country = Country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }


}
