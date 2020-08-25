package developerB;
import developerA.*;

public class Road {
    private String name;
    private double width;
    private Line line;
    private Location startLocation,endLocation;
    public Road(String name,double width,Line line,String startLocation,String endLocation){
        this.name = name;
        this.width = width;
        this.line = line;
        this.startLocation = new Location(this.line.getPoint1(),startLocation);
        this.endLocation = new Location(this.line.getPoint2(),endLocation);
    }

    public String getName(){
        return this.name;
    }

    public Location getStartLocation(){
        return this.startLocation;
    }

    public Location getEndLocation(){
        return this.endLocation;
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.line.length();
    }

    public Line getLine(){
        return this.line;
    }
}