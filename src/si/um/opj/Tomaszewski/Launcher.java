package si.um.opj.Tomaszewski;

import si.um.opj.Tomaszewski.logic.exceptions.CapacityExceededException;
import si.um.opj.Tomaszewski.logic.facility.*;
import si.um.opj.Tomaszewski.logic.*;
import si.um.opj.Tomaszewski.logic.transport.*;
import si.um.opj.Tomaszewski.UI.*;

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
        Warehouse auchanWarehouse = new Warehouse("AuchanWarehouse", maribor, 20);
        System.out.println(auchanWarehouse.toString());

        // CREATE FOOD ITEMS
        FoodItem carrot = new FoodItem("carrot",12,0.4,	 java.time.LocalDate.now().plusMonths(1), FoodItemType.FRESH);
        System.out.println(carrot);
        FoodItem apple = new FoodItem("apple",4,1.2,	 java.time.LocalDate.now().plusMonths(11), FoodItemType.FRESH);
        System.out.println(apple);
        FoodItem orange = new FoodItem("orange",2,10,	 java.time.LocalDate.now(), FoodItemType.FRESH);
        System.out.println(orange);

        // ADD items
        auchanWarehouse.addItem(carrot);
        auchanWarehouse.addItem(orange);
        auchanWarehouse.addItem(apple);

        System.out.println(auchanWarehouse);


        System.out.println('\n' + "Exception test:");

        // ------------------------ START TRUCK  ---------------------------
        Vehicle scaniaSmallCapacity1 = new Truck("N1632", 80,40,1,18);
        // Exception in CAPACITY werehouse = 20, truck = 18
        double scaniaCapacity1 = scaniaSmallCapacity1.getTakenCapacity() + scaniaSmallCapacity1.getFreeCapacity();
        System.out.println('\n' + "Capacity exception Truck.capacity = " + scaniaCapacity1 + "      " + auchanWarehouse);
        try {
            auchanWarehouse.acceptVehicle(scaniaSmallCapacity1);
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }

        // Exception in VOLUME werehouse = 14, truck = 1
        Vehicle scaniaSmallVolume1 = new Truck("N1632", 1,40,1,30);
        System.out.println('\n' + "Volume exception Van.volume = 1 < warehouse.volume = 14 " + scaniaSmallVolume1 + "      " + auchanWarehouse);
        try {
            auchanWarehouse.acceptVehicle(scaniaSmallVolume1);
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }

        // no exceptions
        Vehicle scaniaBig1 = new Truck("N1632", 80,40,1,30);
        try {
            auchanWarehouse.acceptVehicle(scaniaBig1);
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }

        // ------------------------ END TRUCK  ---------------------------

        System.out.println('\n');

        // ------------------------ START TRUCK  ---------------------------
        Vehicle scaniaSmallCapacity = new Truck("N1632", 80,40,5,18);
    // Exception in CAPACITY werehouse = 20, truck = 18
        double scaniaCapacity = scaniaSmallCapacity.getTakenCapacity() + scaniaSmallCapacity.getFreeCapacity();
        System.out.println('\n' + "Capacity exception Truck.capacity = " + scaniaCapacity + "      " + auchanWarehouse);
        try {
            auchanWarehouse.acceptVehicle(scaniaSmallCapacity);
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }

        // Exception in VOLUME werehouse = 14, truck = 1
        Vehicle scaniaSmallVolume = new Truck("N1632", 1,40,5,30);
        System.out.println('\n' + "Volume exception Van.volume = 1 * 5 < warehouse.volume = 14 " + scaniaSmallVolume + "      " + auchanWarehouse);
        try {
            auchanWarehouse.acceptVehicle(scaniaSmallVolume);
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }

        // no exceptions
        Vehicle scaniaBig = new Truck("N1632", 80,40,5,30);
        try {
            auchanWarehouse.acceptVehicle(scaniaBig);
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }

        // ------------------------ END TRUCK  ---------------------------

        auchanWarehouse.addItem(carrot);
        auchanWarehouse.addItem(orange);
        // ADD items
        auchanWarehouse.addItem(carrot);
        auchanWarehouse.addItem(orange);
        auchanWarehouse.addItem(apple);


        System.out.println('\n');
        // ------------------------ START VAN  ---------------------------

        // Exception in CAPACITY werehouse = 20, Van = 10
        Vehicle audiSmallCapacity = new Van("SW182", 100,90, FoodItemType.FRESH, 1);
        double vanCapacity = audiSmallCapacity.getTakenCapacity() + audiSmallCapacity.getFreeCapacity();
        System.out.println('\n' + "Capacity exception Van.capacity = " + vanCapacity + "      " + auchanWarehouse);
        try {
            auchanWarehouse.acceptVehicle(audiSmallCapacity);
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }




        // Exception in VOLUME werehouse = 14, Van = 1
        Vehicle audiSmallVolume = new Van("SW182", 1,90, FoodItemType.FRESH, 30);
        System.out.println('\n' + "Volume exception Van.volume = 1 < warehouse.volume = 14 " + audiSmallVolume + "      " + auchanWarehouse);
        try {
            auchanWarehouse.acceptVehicle(audiSmallVolume);
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }

        // no exceptions
        Vehicle audiBig = new Van("SW182", 100,90, FoodItemType.FRESH, 30);
        System.out.println('\n' + "No exception " + audiBig + "      " + auchanWarehouse);
        try {
            auchanWarehouse.acceptVehicle(audiBig);
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }


        // Exception in FOODTYPE
        // ADD items
        auchanWarehouse.addItem(carrot);
        auchanWarehouse.addItem(orange);
        auchanWarehouse.addItem(apple);
        FoodItem ice = new FoodItem("ice",5,2,	 java.time.LocalDate.now().plusMonths(3), FoodItemType.FROZEN);
        auchanWarehouse.addItem(ice);
        System.out.println('\n' + "Wrong foodType: only FRESH, and we try to load ICE (FROZEN): " + audiBig + "      " + auchanWarehouse);
        try {
            auchanWarehouse.acceptVehicle(audiBig);
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println('\n');
                // ------------------------ END TRUCK  ---------------------------


    }
}