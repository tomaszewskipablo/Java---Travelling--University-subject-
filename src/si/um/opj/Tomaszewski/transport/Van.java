package si.um.opj.Tomaszewski.transport;

public class Van extends Vehicle {
    public Van() {
    }

    public Van(String registrationNumber, double averageSpeed) {
        super(registrationNumber, averageSpeed);
    }

    public Van(String registrationNumber, double volume, double averageSpeed) {
        super(registrationNumber, volume, averageSpeed);
    }

    @Override
    double getVehicleMaxVolume() {
        return length;
    }
}
