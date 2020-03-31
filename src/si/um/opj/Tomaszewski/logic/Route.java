package si.um.opj.Tomaszewski.logic;

import si.um.opj.Tomaszewski.facility.Store;
import si.um.opj.Tomaszewski.facility.Warehouse;

/**
 * Representation of route
 *
 * @author  Pawel Tomaszewski
 * @since   2020-03-20
 */

public class Route {
    private Store store;
    private Warehouse warehouse;
    private double distance;

    // Constructors
    /**
     * Create si.um.opj.Tomaszewski.logic.FoodItem with empty fields
     */
    public Route() {
    }

    /**
     * Create si.um.opj.Tomaszewski.facility.Warehouse with name and location
     * @param store si.um.opj.Tomaszewski.facility.Store on route
     * @param warehouse  si.um.opj.Tomaszewski.facility.Warehouse on route
     * @param distance distance between store and si.um.opj.Tomaszewski.facility.Warehouse
     */
    public Route(Store store, Warehouse warehouse, double distance) {
        this.store = store;
        this.warehouse = warehouse;
        this.distance = distance;
    }
    // Getters/Setters
    /**
     * get store on route
     * @return store on route
     */
    public Store getStore() {
        return store;
    }

    /**
     * set store on route
     * @param store store on route
     */
    public void setStore(Store store) {
        this.store = store;
    }

    /**
     * get warehouse on route
     * @return warehouse on route
     */
    public Warehouse getWarehouse() {
        return warehouse;
    }

    /**
     * set warehouse on route
     * @param warehouse warehouse on route
     */
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * get distance of route
     * @return distance of route
     */
    public double getDistance() {
        return distance;
    }

    /**
     * set distance of route
     * @param distance distance of route
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Return information about object in String
     * @return information as String about object (with all the fields)
     */
    @Override
    public String toString() {
        return "si.um.opj.Tomaszewski.logic.Route{" +
                "store=" + store +
                ", warehouse=" + warehouse +
                ", distance=" + distance +
                '}';
    }
}
