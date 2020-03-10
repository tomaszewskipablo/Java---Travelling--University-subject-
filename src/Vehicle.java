public class Vehicle {
    private String registrationNumber;
    private double volume;
    private double averageSpeed;

    public Vehicle(String registrationNumber, double volume, double averageSpeed) {
        this.registrationNumber = registrationNumber;
        this.volume = volume;
        this.averageSpeed = averageSpeed;
    }

    public double calculateTravelTime(Route route)
    {
        double travelHours = route.getDistance()/this.averageSpeed;
        //return travelHours;
          return      Math.ceil(travelHours/24);
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
}