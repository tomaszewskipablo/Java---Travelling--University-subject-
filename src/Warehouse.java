

/**
 * Represenation of warehouse
 *
 * @author  Pawel Tomaszewski
 * @since   2020-03-30
 */

public class Warehouse {
    private String name;
    private Location location;
    private double capacity=2;
    private FoodItem[] foodItems;
    private int FoodItemSize=0;

    // Constructors

    /**
     * Create Warehouse with empty fields
     */
    private Warehouse() {
    }

    /**
     * Create Warehouse with name and location
     * @param name name of warehouse
     * @param location location of warehouse
     */
    private Warehouse(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    // Constructors
    /**
     * Create Warehouse with name, location and capacity
     * @param name name of warehouse
     * @param location location of warehouse
     * @param capacity max size of foodItems array
     */
    public Warehouse(String name, Location location, double capacity) {
        this(name, location);
        this.capacity = capacity;
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
        if(FoodItemSize<capacity) {
            FoodItem[] temp = foodItems;
            foodItems = new FoodItem[FoodItemSize + 1];

            for (int i = 0; i < FoodItemSize; i++) {
                foodItems[i] = temp[i];
            }

            foodItems[FoodItemSize] = foodItem;
            FoodItemSize++;
        }
    }
    /**
     * Removes food item from the warehouse's array
     * @param foodItem food item that we want to remove from the warehouse's array
     * @since 2020-03-20
     */
    public void removeItem(FoodItem foodItem){
        int indexToRemove = indexOfFoodToRemove(foodItem);
        if(indexToRemove>=0){
            FoodItem[] temp = foodItems;
            FoodItemSize--;
            foodItems = new FoodItem[FoodItemSize];

            int j = 0;
            for(int i=0;i<FoodItemSize;i++){
                    if(j==indexToRemove) {
                        j++;
                    }
                    foodItems[i]=temp[j];
                    j++;
                }
            }
    }

    /**
     * Gets index of item to be removed
     * @param foodItem food item that we want to remove from the warehouse's array
     * @return index of to be deleted item in the foodItems array
     * @since 2020-03-20
     */
    private int indexOfFoodToRemove(FoodItem foodItem){
        for(int i=0;i<FoodItemSize;i++) {
            if(foodItems[i].getLabel() == foodItem.getLabel()){
                return i;
            }
        }
        return -1;
    }

    /**
     * returns how many food items are kept in FoodItems array
     * @return number of items in foodItems array
     * @since 2020-03-20
     */
    public int returnTheNumberOfFoodItems(){
        return FoodItemSize;
    }


    /**
     * Checks if there is food item in foodItems array by label
     * @param label is label that we will find food item by
     * @return true/false if function found food item or not
     * @since 2020-03-20
     */
   public boolean foodItemExists(String label) {
       for(int i=0;i<FoodItemSize;i++) {
           if(foodItems[i].getLabel() == label){
               return true;
           }
       }
       return false;
   }

    /**
     * Display foodItem array
     */
    public void showItems(){
        for(int i=0;i<FoodItemSize;i++) {
            System.out.println(i+1 +"." + foodItems[i].getLabel());
        }
    }

    /**
     * Return information about object in String
     * @return information as String about object (with all the fields)
     */
    public String toString() {
        return "Name: '" + this.name + "', Location: '" + this.getLocation().toString() + "Capacity: '" + this.capacity + "'";
    }
}
