package si.um.opj.Tomaszewski.logic.transport;

import si.um.opj.Tomaszewski.logic.exceptions.CapacityExceededException;
import si.um.opj.Tomaszewski.logic.exceptions.FoodItemTypeException;
import si.um.opj.Tomaszewski.logic.exceptions.VolumeExceededException;

public interface Transportable {
    public void acceptVehicle(Vehicle vehicle) throws CapacityExceededException, VolumeExceededException, FoodItemTypeException;

}
