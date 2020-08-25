package developerA;
import java.util.ArrayList;
import java.lang.Math;

public class Line {
    private Point point1,point2;
    public Line(Point point1,Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    public double length(){
        return Math.sqrt(Math.pow((this.point1.getCoordinates().get(0) - this.point2.getCoordinates().get(0)),2) + Math.pow((this.point1.getCoordinates().get(1) -this.point2.getCoordinates().get(1)),2));
    }

	public static double totalLength(ArrayList<Line> lines){
        double total = 0;
        for(Line line:lines){
            total += line.length();
        }

        return total;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }
}