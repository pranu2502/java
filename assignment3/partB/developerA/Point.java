package developerA;
import java.util.ArrayList;
import java.lang.Math;

public class Point {
    private double x,y;
    private ArrayList<Double> list = new ArrayList<Double>();
    public Point(double x,double y){
        this.x = x;
        this.y = y;
        list.add(this.x);
        list.add(this.y);
    }

    public ArrayList<Double> getCoordinates(){
        return list;
    }

    void setCoordinates(double x,double y){
        list.set(0, x);
        list.set(1, y);
    }

    double getDistance(double x, double y)
    {
        return Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2));
    }

}