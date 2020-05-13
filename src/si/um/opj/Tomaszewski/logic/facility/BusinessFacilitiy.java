package si.um.opj.Tomaszewski.logic.facility;

import si.um.opj.Tomaszewski.logic.Location;

abstract public class BusinessFacilitiy {
    protected String name;
    protected Location location;

    public BusinessFacilitiy(){}

    public BusinessFacilitiy(String name, Location location) {
        this.name = name;
        this.location = location;
    }


    @Override
    public String toString() {
        return "BusinessFacilitiy{" +
                "name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}
