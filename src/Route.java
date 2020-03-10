public class Route {
    private Store store;
    private Warehouse warehouse;
    private double distance;

    public Route(Store store, Warehouse warehouse, double distance) {
        this.store = store;
        this.warehouse = warehouse;
        this.distance = distance;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
