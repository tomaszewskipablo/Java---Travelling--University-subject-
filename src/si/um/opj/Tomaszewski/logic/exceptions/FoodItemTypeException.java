package si.um.opj.Tomaszewski.logic.exceptions;

public class FoodItemTypeException extends Exception {
    public  FoodItemTypeException()
    {
        super("Exception: food item type is not acceptable for that vehicle");
    }
}