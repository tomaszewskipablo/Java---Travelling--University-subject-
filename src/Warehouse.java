public class Warehouse {
    private String name;
    private Location location;
    private double capacity;
    private FoodItem[] foodItems;
    private int FoodItemSize=0;

    private Warehouse() {
    }

    private Warehouse(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public Warehouse(String name, Location location, double capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void addItem(FoodItem foodItem) {
        FoodItem[] temp = foodItems;
        foodItems = new FoodItem[FoodItemSize+1];

        for(int i=0;i<FoodItemSize;i++){
            foodItems[i]=temp[i];
        }

        foodItems[FoodItemSize]=foodItem;
        FoodItemSize++;
    }

    public void removeItem(FoodItem foodItem){
        int indexToRemove = removeItemIndex(foodItem);
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

    private int removeItemIndex(FoodItem foodItem){
        for(int i=0;i<FoodItemSize;i++) {
            if(foodItems[i].getLabel() == foodItem.getLabel()){
                return i;
            }
        }
        return -1;
    }
    public int returnTheNumberOfFoodItems(){
        return FoodItemSize;
    }

   public boolean foodItemExists(String label) {
       for(int i=0;i<FoodItemSize;i++) {
           if(foodItems[i].getLabel() == label){
               return true;
           }
       }
       return false;
   }

    public void showItems(){
        for(int i=0;i<FoodItemSize;i++) {
            System.out.println(i+1 +"." + foodItems[i].getLabel());
        }
    }
}
