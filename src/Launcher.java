import java.time.LocalDate;

/**
 * Main class for launching a program
 *
 * @author  Pawel Tomaszewski
 * @since   2020-03-30
 */


public class Launcher {
    public static void main(String[] args) {


        Location maribor = new Location("Maribor","Slovenia");
        System.out.println(maribor.toString());
        Warehouse auchanWarehouse = new Warehouse("AuchanWarehouse", maribor, 1000);
        System.out.println(auchanWarehouse.toString());

        FoodItem onion = new FoodItem("onion",12,10,java.time.LocalDate.now().plusMonths(3));
        System.out.println(onion.toString());

        FoodItem carrot = new FoodItem("carrot",12,0.4,	 java.time.LocalDate.now().plusMonths(1));
        System.out.println(carrot.toString());

        FoodItem cheese = new FoodItem("cheese",2,10,	 java.time.LocalDate.now().plusMonths(10));
        System.out.println(cheese.toString());
        FoodItem bread = new FoodItem("bread", 5,4,	 java.time.LocalDate.now().plusMonths(1));
        System.out.println(bread.toString());

        // ADD items
        auchanWarehouse.addItem(onion);
        auchanWarehouse.addItem(cheese);
        auchanWarehouse.addItem(bread);
        auchanWarehouse.addItem(carrot);

        System.out.println(auchanWarehouse.toString());

        System.out.println("Number of Items: " + auchanWarehouse.returnTheNumberOfFoodItems());


        System.out.println("Remove items: ");

        // REMOVE items
        auchanWarehouse.removeItem(onion);
        auchanWarehouse.removeItem(carrot);

        System.out.println(auchanWarehouse.toString());

        System.out.println("Number of Items: " + auchanWarehouse.returnTheNumberOfFoodItems());

    Vehicle audi = new Vehicle("SW182", 1400,90);
    System.out.println(audi.toString());

    Store bigBang = new Store("bigBang", maribor);
    System.out.println(bigBang.toString());

    Route route = new Route(bigBang, auchanWarehouse, 200);
    System.out.println(route.toString());
    }
}