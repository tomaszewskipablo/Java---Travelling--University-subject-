package si.um.opj.Tomaszewski.logic;

import java.time.LocalDate;


/**
 * Representation of foodItem
 *
 * @author  Pawel Tomaszewski
 * @since   2020-03-20
 */



public class FoodItem {
    private String label;
    private double volume;
    private double weight;
    private java.time.LocalDate expirationDate;
    private FoodItemType foodItemType;


    // Constructors

    /**
     * Create si.um.opj.Tomaszewski.logic.FoodItem with empty fields
     */
    public FoodItem() {
    }

    /**
     * Create si.um.opj.Tomaszewski.logic.FoodItem with label
     * @param label label of foodItem
     */
    public FoodItem(String label) {
        this.label = label;
    }

    /**
     * Create si.um.opj.Tomaszewski.logic.FoodItem with label,volume, weight and expirationDate
     * @param label label of foodItem
     *@param volume volume of foodItem
     *@param weight weight of foodItem
     *@param expirationDate expirationDate of foodItem
     */
    public FoodItem(String label, double volume, double weight, java.time.LocalDate expirationDate) {
        this(label);
        this.volume = volume;
        this.weight = weight;
        this.expirationDate = expirationDate;
    }

    public FoodItem(String label, double volume, double weight, java.time.LocalDate expirationDate, FoodItemType foodItemType) {
        this(label, volume, weight, expirationDate);
        this.foodItemType = foodItemType;
    }


    // Getters/Setters

    /**
     * set label of foodItem
     * @param label label of foodItem
     */
    public void setLabel(String label) {
        this.label = label;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * get name of warehouse
     * @return name of warehouse
     */
    public String getLabel() {
        return label;
    }

    /**
     * Return information about object in String
     * @return information as String about object (with all the fields)
     */

    @Override
    public String toString() {
        return "FoodItem{" +
                "label='" + label + '\'' +
                ", volume=" + volume +
                ", weight=" + weight +
                ", expirationDate=" + expirationDate +
                ", foodItemType=" + foodItemType +
                '}';
    }
}
