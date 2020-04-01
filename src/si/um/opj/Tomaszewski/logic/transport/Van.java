package si.um.opj.Tomaszewski.logic.transport;


import si.um.opj.Tomaszewski.logic.FoodItemType;

import java.util.Arrays;

public class Van extends Vehicle {

    private FoodItemType foodItemType;
    public Van() {
    }

    public Van(String registrationNumber, double averageSpeed) {
        super(registrationNumber, averageSpeed);
    }

    public Van(String registrationNumber, double volume, double averageSpeed, int length) {
        super(registrationNumber, volume, averageSpeed, length);
    }


    public Van(String registrationNumber, double averageSpeed, FoodItemType foodItemType,  int length) {
        super(registrationNumber, averageSpeed);
        this.foodItemType = foodItemType;
        this.length = length;
    }

    public Van(String registrationNumber, double volume, double averageSpeed, FoodItemType foodItemType,  int length) {
        super(registrationNumber, volume, averageSpeed, length);
        this.foodItemType = foodItemType;
    }

    public FoodItemType getFoodItemType() {
        return foodItemType;
    }

    public void setFoodItemType(FoodItemType foodItemType) {
        this.foodItemType = foodItemType;
    }

    @Override
    public double getVehicleMaxVolume() {
        return length;
    }

    @Override
    public String toString() {
        return "Van{" +
                super.toString() +
                "foodItemType=" + foodItemType +
                '}';
    }
}
