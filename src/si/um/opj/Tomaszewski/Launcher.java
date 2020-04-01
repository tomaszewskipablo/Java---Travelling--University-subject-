package si.um.opj.Tomaszewski;

import si.um.opj.Tomaszewski.logic.facility.*;
import si.um.opj.Tomaszewski.logic.*;
import si.um.opj.Tomaszewski.logic.transport.*;

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

        // CREATE FOOD ITEMS
        FoodItem carrot = new FoodItem("carrot",12,0.4,	 java.time.LocalDate.now().plusMonths(1));
        System.out.println(carrot);
        FoodItem orange = new FoodItem("orange",2,10,	 java.time.LocalDate.now());
        System.out.println(orange);

        // ADD items
        auchanWarehouse.addItem(carrot);
        auchanWarehouse.addItem(orange);

        auchanWarehouse.toString();

        // count
        System.out.println("Number of Items: " + auchanWarehouse.returnTheNumberOfFoodItems());

        // VAN
        Vehicle audi = new Van("SW182", 14,90, FoodItemType.FROZEN, 10);
        audi.loadFoodItem(orange);
        audi.loadFoodItem(carrot);

        System.out.println(audi);

        System.out.println("Max audi max volume = " + audi.getVehicleMaxVolume());
        System.out.println("Taken space = " + audi.getTakenSpace() + "%");

        // Unload
        audi.unloadFoodItems();
        System.out.println(audi);
        // TRUCK
        Vehicle scania = new Truck("N1632", 60,40,2,18);
        scania.loadFoodItem(orange);
        scania.loadFoodItem(carrot);

        System.out.println(scania);

        System.out.println("Max scania max volume = " + scania.getVehicleMaxVolume());
        System.out.println("Taken space = " +scania.getTakenSpace() + "%");

        Store bigBang = new Store("bigBang", maribor);
        System.out.println(bigBang);

        Route route = new Route(bigBang, auchanWarehouse, 200);
        System.out.println(route);
    }
}