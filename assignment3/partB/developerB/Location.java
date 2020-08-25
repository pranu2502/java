package developerB;
import developerA.*;

public class Location {
    public Point location;
    public String locationName;
    public Location(Point location, String locationName){
        this.location = location;
        this.locationName = locationName;
    }

    public Point getLoacation(){
        return this.location;
    }

    public String getLocationName(){
        return this.locationName;
    }
}