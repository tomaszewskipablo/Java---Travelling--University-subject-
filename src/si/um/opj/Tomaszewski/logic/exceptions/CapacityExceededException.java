package si.um.opj.Tomaszewski.logic.exceptions;


public class CapacityExceededException extends Exception {
    public  CapacityExceededException()
    {
        super("Exception: not enough capacity in the vehicle");
    }
}