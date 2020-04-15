package si.um.opj.Tomaszewski.logic.facility;

import si.um.opj.Tomaszewski.logic.FoodItem;
import si.um.opj.Tomaszewski.logic.Location;
import si.um.opj.Tomaszewski.logic.transport.Transportable;
import si.um.opj.Tomaszewski.logic.transport.Truck;
import si.um.opj.Tomaszewski.logic.transport.Van;
import si.um.opj.Tomaszewski.logic.transport.Vehicle;
import si.um.opj.Tomaszewski.logic.exceptions.CapacityExceededException;
import si.um.opj.Tomaszewski.logic.exceptions.FoodItemTypeException;
import si.um.opj.Tomaszewski.logic.exceptions.VolumeExceededException;

import java.util.Arrays;

/**
 * Representation of warehouse
 *
 * @author  Pawel Tomaszewski
 * @since   2020-03-30
 */

public class Warehouse extends BusinessFacilitiy implements Transportable {


    private FoodItem[] foodItems;

    // Constructors


    public Warehouse(String name, Location location) {
        super(name, location);
    }

    public Warehouse(String name, Location location, int capacity) throws java.lang.IllegalArgumentException{
        super(name, location);
        if(capacity<0)
        {
            throw new java.lang.IllegalArgumentException();
        }
        this.foodItems = new FoodItem[capacity];
    }


// Getters/Setters
    /**
     * get name of warehouse
     * @return name of warehouse
     */
    public String getName() {
        return name;
    }

    /**
     * set name of warehouse
     * @param name name of warehouse
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get location of warehouse
     * @return location of warehouse
     */
    public Location getLocation() {
        return location;
    }

    /**
     * set location of warehouse
     * @param location location of warehouse
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    // Methods

    /**
     * Adds food item to the warehouse's array
     * @param foodItem food item that we want to add to the warehouse's array
     * @since 2020-03-20
     */
    public void addItem(FoodItem foodItem) {

        if (stillValid(foodItem)==true)
            for (int i = 0; i < foodItems.length; i++)
            {
                if (foodItems[i] == null)
                {
                    foodItems[i] = foodItem;
                    break;
                }
            }
    }
    /**
     * Removes food item from the warehouse's array
     * @param foodItem food item that we want to remove from the warehouse's array
     * @since 2020-03-20
     */
    public void removeItem(FoodItem foodItem){
        for (int i = 0; i < foodItems.length; i++)
        {
            if (foodItems[i] == foodItem)
            {
                foodItems[i] = null;
                break;
            }
        }
    }


    /**
     * returns how many food items are kept in FoodItems array
     * @return number of items in foodItems array
     * @since 2020-03-20
     */
    public int returnTheNumberOfFoodItems(){
        int numberOfFoodItems = 0;

        for (int i = 0; i < foodItems.length; i++)
        {
            if (foodItems[i] != null)
            {
                numberOfFoodItems++;
            }
        }
        return numberOfFoodItems;
    }


    /**
     * Checks if there is food item in foodItems array by label
     * @param label is label that we will find food item by
     * @return true/false if function found food item or not
     * @since 2020-03-20
     */
    public boolean foodItemExists(String label)
    {
        for (int i = 0; i < foodItems.length; i++)
        {
            if(foodItems[i] !=null) {
                if (foodItems[i].getLabel() == label) {
                    return true;
                }
            }
        }
        return false;
    }

   private Boolean stillValid(FoodItem foodItem){
      if(foodItem.getExpirationDate().compareTo(java.time.LocalDate.now().plusDays(3)) > 0) {
          return true;
      }
      return false;
   }
    private double getVolumeOfAllItems(){
        double takenVolume=0;
        for (int i = 0; i < foodItems.length; i++)
        {
            if (foodItems[i]!=null)
            {
                takenVolume = takenVolume + foodItems[i].getVolume();
            }
        }
        return takenVolume;
    }

    @Override
    public void acceptVehicle(Vehicle vehicle)  throws CapacityExceededException, VolumeExceededException, FoodItemTypeException{
        if(vehicle instanceof Truck) {
            // ---------- Check all errors ----------
            // CAPACITY exceeded
            if(foodItems.length > vehicle.getFreeCapacity())
            {
                vehicle.unloadFoodItems();
                throw new CapacityExceededException();
            }
            // VOLUME exceeded
            if(getVolumeOfAllItems()>vehicle.getFreeVolume())
            {
                vehicle.unloadFoodItems();
                throw new VolumeExceededException();
            }
            // ---------- Check all errors ----------

            // ----------- Everything is all right -------
            // load them on vehicle
            vehicle.loadFoodItem(this.foodItems);
            // set all warehouse items to null
            for(int i=0;i<this.foodItems.length;i++) {
                this.foodItems[i] = null;
            }
            // ----------- Everything is all right -------
        }

        if(vehicle instanceof Van) {
            Boolean successVolume = true;
            Boolean successType = true;
            for(int i=0;i<this.foodItems.length;i++)
            {
                if(foodItems[i]!=null) {
                    // ---------- Check all errors ----------
                    // CAPACITY exceeded

                    if (vehicle.getFreeCapacity() <= 0) {
                        throw new CapacityExceededException();
                    }
                    // VOLUME exceeded
                    if (vehicle.getFreeVolume() < foodItems[i].getVolume()) {
                        successVolume = false;
                    }
                    //TYPE WRONG

                    else if (foodItems[i].getFoodItemType() != ((Van) vehicle).getFoodItemType()) {
                        successType = false;
                    }

                    // ---------- Check all errors ----------

                    // ----------- Everything is all right -------

                    else {
                        vehicle.loadFoodItem(this.foodItems[i]);
                        this.foodItems[i] = null;
                    }

                    // ----------- Everything is all right -------
                }
            }
            // Throw exceptions for volume and foodType
            // VOLUME exceeded
            if(successVolume == false)
            {
                throw new VolumeExceededException();
            }
            //TYPE WRONG
            if(successType == false)
            {
                throw new FoodItemTypeException();
            }
        }
    }

    /**
     * Return information about object in String
     *
     * @return information as String about object (with all the fields)
     */
    @Override
    public String toString() {
        return "Warehouse{" +
                "foodItems=" + Arrays.toString(foodItems) +
                super.toString() +
                '}';
    }

}
