package si.um.opj.Tomaszewski.logic.transport;

public class Truck extends Vehicle {

    private int numberOfTrailers;

    public Truck(int length, int numberOFTrailers)
    {
        super(length);
        this.numberOfTrailers = numberOfTrailers;
    }

    public Truck(String registrationNumber, double averageSpeed, int numberOfTrailers, int length) {
        super(registrationNumber, averageSpeed, length);
        this.numberOfTrailers = numberOfTrailers;
    }

    public Truck(String registrationNumber, double volume, double averageSpeed, int numberOfTrailers, int length) {
        super(registrationNumber, volume, averageSpeed, length);
        this.numberOfTrailers = numberOfTrailers;
    }

    public int getNumberOFTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOFTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }
    public void setVolume(double volume){
        setVolume(volume);
    }
    public void setAverageSpeed(double speed){
        setAverageSpeed(speed);
    }

    @Override
    public void setRegistrationNumber(String registrationNumber) {
        super.setRegistrationNumber(registrationNumber);
    }

    @Override
    public double getFreeVolume(){
        return getVehicleMaxVolume() - super.getTakenVolume();
    }

    @Override
    public double getVehicleMaxVolume() {
        return super.volume * numberOfTrailers;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "numberOFTrailers=" + numberOfTrailers +
                '}';
    }
}
