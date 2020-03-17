public class Launcher {
    public static void main(String[] args) {


        Location wareHouse = new Location("Maribor","Slovenia");
        System.out.println(wareHouse.toString());
        Warehouse AuchanWarehouse = new Warehouse("AuchanWarehouse", wareHouse, 1000);



        FoodItem onion = new FoodItem("onion");
        System.out.println(onion.toString());

        FoodItem carot = new FoodItem("carot");
        FoodItem cheese = new FoodItem("cheese");
        FoodItem bread = new FoodItem("bread");
        AuchanWarehouse.addItem(onion);
        AuchanWarehouse.addItem(cheese);
        AuchanWarehouse.addItem(bread);
        AuchanWarehouse.addItem(carot);
        AuchanWarehouse.showItems();
        System.out.println("Remove items: ");
        AuchanWarehouse.removeItem(onion);
        AuchanWarehouse.removeItem(carot);
        AuchanWarehouse.showItems();

        System.out.println(AuchanWarehouse.toString());


    }
}