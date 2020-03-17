import java.util.Date;

public class FoodItem {
    private String label;
    private double volume;
    private double weight;
    private Date expirationDate;

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public FoodItem(String label) {
        this.label = label;
    }

    public FoodItem() {
    }

}
