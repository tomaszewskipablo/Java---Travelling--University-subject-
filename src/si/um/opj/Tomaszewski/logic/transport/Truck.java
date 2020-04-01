package si.um.opj.Tomaszewski.logic.transport;

public class Truck extends Vehicle {

    private int numberOFTrailers;

    public Truck(int numberOFTrailers) {
        this.numberOFTrailers = numberOFTrailers;
    }

    public Truck(String registrationNumber, double averageSpeed, int numberOFTrailers) {
        super(registrationNumber, averageSpeed);
        this.numberOFTrailers = numberOFTrailers;
    }

    public Truck(String registrationNumber, double volume, double averageSpeed, int numberOFTrailers, int length) {
        super(registrationNumber, volume, averageSpeed, length);
        this.numberOFTrailers = numberOFTrailers;
    }

    public int getNumberOFTrailers() {
        return numberOFTrailers;
    }

    public void setNumberOFTrailers(int numberOFTrailers) {
        this.numberOFTrailers = numberOFTrailers;
    }



    @Override
    public double getVehicleMaxVolume() {
        return length * numberOFTrailers;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "numberOFTrailers=" + numberOFTrailers +
                '}';
    }
}
