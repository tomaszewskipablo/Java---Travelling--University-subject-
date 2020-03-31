package si.um.opj.Tomaszewski.logic.facility;

import si.um.opj.Tomaszewski.logic.Location;

/**
 * Representation of store
 *
 * @author  Pawel Tomaszewski
 * @since   2020-03-20
 */


public class Store extends BusinessFacilitiy {


    // Constructors

    public Store() {
    }

    public Store(String name, Location location) {
        super(name, location);
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
     *
     * @return information as String about object (with all the fields)
     */
    @Override
    public String toString() {
        return "Store{" +
                super.toString() +
                '}';
    }
}
