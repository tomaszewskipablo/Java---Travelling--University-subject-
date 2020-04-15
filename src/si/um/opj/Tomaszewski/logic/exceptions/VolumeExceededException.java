package si.um.opj.Tomaszewski.logic.exceptions;

public class VolumeExceededException extends Exception {
    public  VolumeExceededException()
    {
        super("Exception: not enough volume in the vehicle");
    }
}