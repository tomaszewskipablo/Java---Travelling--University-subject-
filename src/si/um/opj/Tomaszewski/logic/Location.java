package si.um.opj.Tomaszewski.logic;

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
     * Create si.um.opj.Tomaszewski.logic.Location with empty fields
     */
    public Location() {
    }

    /**
     * Create si.um.opj.Tomaszewski.logic.Location with city and country
     * @param city city of si.um.opj.Tomaszewski.logic.Location
     * @param country Country of si.um.opj.Tomaszewski.logic.Location
     */
    public Location(String city, String country){
        this.city = city;
        this.country = country;
    }


    // Getters/Setters
    /**
     * get city of si.um.opj.Tomaszewski.logic.Location
     * @return city of si.um.opj.Tomaszewski.logic.Location
     */
    public String getCity() {
        return city;
    }

    /**
     * set city si.um.opj.Tomaszewski.logic.Location
     * @param city city of si.um.opj.Tomaszewski.logic.Location
     */
    public void setCity(String city) {
        city = city;
    }

    /**
     * get country of si.um.opj.Tomaszewski.logic.Location
     * @return country country of si.um.opj.Tomaszewski.logic.Location
     */
    public String getCountry() {
        return country;
    }

    /**
     * set country of si.um.opj.Tomaszewski.logic.Location
     * @param country country of si.um.opj.Tomaszewski.logic.Location
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
        return "si.um.opj.Tomaszewski.logic.Location{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
