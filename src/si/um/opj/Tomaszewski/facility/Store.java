package si.um.opj.Tomaszewski.facility;

import si.um.opj.Tomaszewski.logic.Location;

/**
 * Representation of store
 *
 * @author  Pawel Tomaszewski
 * @since   2020-03-20
 */


public class Store {
    private String name;
    private Location location;

    // Constructors

    /**
     * Create si.um.opj.Tomaszewski.facility.Store with empty fields
     */
    public Store() {
    }
    /**
     * Create si.um.opj.Tomaszewski.facility.Store with name and location
     * @param name name of warehouse
     * @param location location of warehouse
     */
    public Store(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    // Getters/Setters



    /**
     * get name of store
     * @return name of store
     */
    public String getName() {
        return name;
    }

    /**
     * set name of store
     * @param name name of store
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get location of store
     * @return location of store
     */
    public Location getLocation() {
        return location;
    }

    /**
     * set location of store
     * @param location location of store
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Return information about object in String
     * @return information as String about object (with all the fields)
     */
    @Override
    public String toString() {
        return "si.um.opj.Tomaszewski.facility.Store{" +
                "name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}
