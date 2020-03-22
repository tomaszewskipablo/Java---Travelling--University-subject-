/**
 * Represenation of location
 *
 * @author  Pawel Tomaszewski
 * @since   2020-03-20
 */

public class Location {
    private String City;
    private String Country;

    // Constructors
    /**
     * Create Location with city and country
     * @param City city of Location
     * @param Country Country of Location
     */
    Location(String City, String Country){
        this.City = City;
        this.Country = Country;
    }

    // Getters/Setters
    /**
     * get city of Location
     * @return city of Location
     */
    public String getCity() {
        return City;
    }

    /**
     * set city Location
     * @param city city of Location
     */
    public void setCity(String city) {
        City = city;
    }

    /**
     * get country of Location
     * @return Country country of Location
     */
    public String getCountry() {
        return Country;
    }

    /**
     * set country of Location
     * @param country country of Location
     */
    public void setCountry(String country) {
        Country = country;
    }

    // Methods
    /**
     * Return information about object in String
     * @return information as String about object (with all the fields)
     */
    public String toString() {
        return "City: '" + this.City + "', Country: '" + this.Country+"'";
    }
}
