package si.um.opj.Tomaszewski.logic.transport;

import si.um.opj.Tomaszewski.logic.FoodItem;
import si.um.opj.Tomaszewski.logic.Route;

import java.util.Arrays;

/**
 * Representation of vehicle
 *
 * @author  Pawel Tomaszewski
 * @since   2020-03-30
 */

abstract public class Vehicle {
    protected String registrationNumber;
    protected double volume;
    protected double averageSpeed;
    protected FoodItem[] cargo;


    // Constructors
    /**
     * Create si.um.opj.Tomaszewski.logic.transport.Vehicle with empty fields
     */
    public Vehicle(int length) {
        this.cargo= new FoodItem[length];
    }

    /**
     * Create si.um.opj.Tomaszewski.logic.transport.Vehicle with registrationNumber and averageSpeed
     * @param registrationNumber registrationNumber of si.um.opj.Tomaszewski.logic.transport.Vehicle
     * @param averageSpeed averageSpeed of si.um.opj.Tomaszewski.logic.transport.Vehicle
     */
    public Vehicle(String registrationNumber, double averageSpeed, int length) {
        this(length);
        this.registrationNumber = registrationNumber;
        this.averageSpeed = averageSpeed;
    }

    /**
     * Create si.um.opj.Tomaszewski.logic.transport.Vehicle with registrationNumber, volume and averageSpeed
     * @param registrationNumber registrationNumber of si.um.opj.Tomaszewski.logic.transport.Vehicle
     * @param volume volume of si.um.opj.Tomaszewski.logic.transport.Vehicle
     * @param averageSpeed averageSpeed of si.um.opj.Tomaszewski.logic.transport.Vehicle
     */
    public Vehicle(String registrationNumber, double volume, double averageSpeed, int length) {
        this(registrationNumber,averageSpeed, length);
        this.volume = volume;
    }



    // Getters/Setters
    /**
     * get registrationNumber of vehicle
     * @return registrationNumber of vehicle
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * set registrationNumber of vehicle
     * @param registrationNumber label of vehicle
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * get volume of vehicle
     * @return volume of vehicle
     */
    public double getVolume() {
        return volume;
    }

    /**
     * set volume of vehicle
     * @param volume volume of vehicle
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * get averageSpeed of vehicle
     * @return averageSpeed of vehicle
     */
    public double getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * set averageSpeed of vehicle
     * @param averageSpeed averageSpeed of vehicle
     */
    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    // Methods

    /**
     * Calculate how many days travel takes
     * @param route route to travellby vehicle
     * @return days need to drive road by vehicle
     * @since 2020-03-20
     */
    public double calculateTravelTime(Route route) {
        double travelHours = route.getDistance()/this.averageSpeed;
        return      Math.ceil(travelHours/24);
    }

    // add product when empty
    public void loadFoodItem(FoodItem foodItem)
    {
        for (int i = 0; i < cargo.length; i++)
        {
            if (cargo[i] == null)
            {
                cargo[i] = foodItem;
                break;
            }
        }
    }


    public void unloadFoodItems()
    {
        for (int i = 0; i < cargo.length; i++)
        {
            cargo[i] = null;
        }
    }
    public double getTakenSpace(){

        double takenSpace=0;
        for (int i = 0; i < cargo.length; i++)
        {
            if (cargo[i]!=null)
            {
                takenSpace+= cargo[i].getVolume();
            }
        }

        double takenPercentage = takenSpace / this.getVehicleMaxVolume() * 100;
        return takenPercentage;

    }


    abstract public double getVehicleMaxVolume();

    /**
     * Return information about object in String
     * @return information as String about object (with all the fields)
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", volume=" + volume +
                ", averageSpeed=" + averageSpeed +
                ", cargo=" + Arrays.toString(cargo) +
                '}';
    }
}
