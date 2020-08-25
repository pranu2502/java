package developerB;
import developerA.*;
import java.util.ArrayList;

public class Route {
    private ArrayList<Road> routes = new ArrayList<Road>();
    public Route(ArrayList<Road> routes){
        this.routes = routes;
    }

    public ArrayList<Road> getRoutes(){
        return this.routes;
    }
    public double getLength(){
        ArrayList<Line> lines = new ArrayList<Line>();
        for(Road road:this.routes){
            lines.add(road.getLine());
        }
        return Line.totalLength(lines);
    }

    public double getMaxWidth(){
        double max = 0;
        for(Road road:this.routes)
        {
            if(road.getWidth() > max)
            {
                max = road.getWidth();
            }
        }
        return max;
    }

    public static boolean isConnected(ArrayList<Road> roads){
        for(int i = 0;i<roads.size();i++)
        {
            if(i == 0)
            {
                if(roads.get(i).getEndLocation().getLoacation() != roads.get(i+1).getStartLocation().getLoacation())
                {
                    return false;
                }
            }
            else if(i == roads.size()-1)
            {
                if(roads.get(i).getStartLocation().getLoacation() != roads.get(i-1).getEndLocation().getLoacation())
                {
                    return false;
                }
            }
            else
            {
                if(roads.get(i).getStartLocation().getLoacation() != roads.get(i-1).getEndLocation().getLoacation() || roads.get(i).getEndLocation().getLoacation() != roads.get(i+1).getStartLocation().getLoacation())
                {
                    return false;
                }
            }
        }

        return true;
    }
} 