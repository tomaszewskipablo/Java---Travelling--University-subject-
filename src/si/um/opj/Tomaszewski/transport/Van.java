package si.um.opj.Tomaszewski.transport;

enum FoodItemType {
    FROZEN,
    FRESH,
}

public class Van extends Vehicle {

    private FoodItemType foodItemType;
    public Van() {
    }

    public Van(String registrationNumber, double averageSpeed) {
        super(registrationNumber, averageSpeed);
    }

    public Van(String registrationNumber, double volume, double averageSpeed) {
        super(registrationNumber, volume, averageSpeed);
    }


    public Van(String registrationNumber, double averageSpeed, FoodItemType foodItemType) {
        super(registrationNumber, averageSpeed);
        this.foodItemType = foodItemType;
    }

    public Van(String registrationNumber, double volume, double averageSpeed, FoodItemType foodItemType) {
        super(registrationNumber, volume, averageSpeed);
        this.foodItemType = foodItemType;
    }

    public FoodItemType getFoodItemType() {
        return foodItemType;
    }

    public void setFoodItemType(FoodItemType foodItemType) {
        this.foodItemType = foodItemType;
    }

    @Override
    double getVehicleMaxVolume() {
        return length;
    }
}
