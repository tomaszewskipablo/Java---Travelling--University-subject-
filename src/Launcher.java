public class Launcher {
    public static void main(String[] args) {
        Location store = new Location("katowice", "Poland");
        Store Auchan = new Store("Auchan", store);

        Location wareHouse = new Location("Maribor","Slovenia");
        Warehouse AuchanWarehouse = new Warehouse("AuchanWarehouse", wareHouse);
        Vehicle skoda =  new Vehicle("SW1728", 1.6,90);

        Route route = new Route(Auchan,AuchanWarehouse,650);

        double time = skoda.calculateTravelTime(route);
        System.out.println(time);
    }
}