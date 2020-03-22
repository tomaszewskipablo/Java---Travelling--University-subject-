/**
 * Represenation of vehicle
 *
 * @author  Pawel Tomaszewski
 * @since   2020-03-30
 */

public class Vehicle {
    private String registrationNumber;
    private double volume;
    private double averageSpeed;

    // Constructors
    /**
     * Create Vehicle with registrationNumber and averageSpeed
     * @param registrationNumber registrationNumber of Vehicle
     * @param averageSpeed averageSpeed of Vehicle
     */
    public Vehicle(String registrationNumber, double averageSpeed) {
        this.registrationNumber = registrationNumber;
        this.averageSpeed = averageSpeed;
    }

    /**
     * Create Vehicle with registrationNumber, volume and averageSpeed
     * @param registrationNumber registrationNumber of Vehicle
     * @param volume volume of Vehicle
     * @param averageSpeed averageSpeed of Vehicle
     */
    public Vehicle(String registrationNumber, double volume, double averageSpeed) {
        this(registrationNumber,averageSpeed);
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

    /**
     * Return information about object in String
     * @return information as String about object (with all the fields)
     */
    public String toString() {
        return "registrationNumber: '" + this.registrationNumber + "', volume: '" + this.volume + "averageSpeed: '" + this.averageSpeed + "'";
    }
}
