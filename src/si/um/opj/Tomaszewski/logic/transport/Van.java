package si.um.opj.Tomaszewski.logic.transport;


import si.um.opj.Tomaszewski.logic.FoodItemType;

import java.util.Arrays;

public class Van extends Vehicle {

    private FoodItemType foodItemType;
    public Van(int length) {
        super(length);
    }

    public Van(String registrationNumber, double averageSpeed, int length) {
        super(registrationNumber, averageSpeed, length);
    }

    public Van(String registrationNumber, double volume, double averageSpeed, int length) {
        super(registrationNumber, volume, averageSpeed, length);
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
    public double getFreeVolume(){
            return getVehicleMaxVolume() - super.getTakenVolume();
    }

    @Override
    public double getVehicleMaxVolume() {
        return super.volume;
    }

    @Override
    public String toString() {
        return "Van{" +
                super.toString() +
                "foodItemType=" + foodItemType +
                '}';
    }
}
