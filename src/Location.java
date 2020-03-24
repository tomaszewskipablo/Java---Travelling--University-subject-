/**
 * Representation of location
 *
 * @author  Pawel Tomaszewski
 * @since   2020-03-20
 */

public class Location {
    private String city;
    private String country;

    // Constructors
    /**
     * Create Location with empty fields
     */
    public Location() {
    }

    /**
     * Create Location with city and country
     * @param city city of Location
     * @param country Country of Location
     */
    Location(String city, String country){
        this.city = city;
        this.country = country;
    }


    // Getters/Setters
    /**
     * get city of Location
     * @return city of Location
     */
    public String getCity() {
        return city;
    }

    /**
     * set city Location
     * @param city city of Location
     */
    public void setCity(String city) {
        city = city;
    }

    /**
     * get country of Location
     * @return country country of Location
     */
    public String getCountry() {
        return country;
    }

    /**
     * set country of Location
     * @param country country of Location
     */
    public void setCountry(String country) {
        country = country;
    }

    // Methods
    /**
     * Return information about object in String
     * @return information as String about object (with all the fields)
     */
    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
