import  developerB.*;
import developerA.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        ArrayList<Location> locationList = new ArrayList<Location>();
        ArrayList<Road> roadList = new ArrayList<Road>();
        ArrayList<Route> routeList = new ArrayList<Route>();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        for(int i = 0;i<n1;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            String name = sc.nextLine();
            Point point = new Point(x,y);
            Location location = new Location(point,name);
            locationList.add(location);

        }
        int n2 = sc.nextInt();
        for(int i = 0;i<n2;i++)
        {
            
            int idxStartLocation = sc.nextInt();
            int idxEndLocation = sc.nextInt();
            String [] help = sc.nextLine().split(" ");
            String nameOfRoad = help[1];
            float widthOfRoad = Float.parseFloat(help[2]);
            Line line = new Line(locationList.get(idxStartLocation).getLoacation(), locationList.get(idxEndLocation).getLoacation());
            Road road = new Road(nameOfRoad,widthOfRoad,line,locationList.get(idxStartLocation).getLocationName(),locationList.get(idxEndLocation).getLocationName());
            roadList.add(road);
        }
        int n3 = sc.nextInt();
        for(int i = 0;i<n3;i++)
        {
            ArrayList<Road> routeListHelper = new ArrayList<Road>();
            // System.out.println(routeListHelper.size()); 
            int numberOfRoads = sc.nextInt();
            for(int j = 0;j<numberOfRoads;j++)
            {
                int indiceOfroad = sc.nextInt();
                routeListHelper.add(roadList.get(indiceOfroad));
                
            }
            Route temp=new Route(routeListHelper);
            routeList.add(temp);
        }
        sc.close();

        for(int i = 0;i<routeList.size();i++)
        {
            ArrayList<Road> currentRouteRoads = routeList.get(i).getRoutes();
            Route currentRoute = routeList.get(i);
            if(Route.isConnected(currentRouteRoads))
            {
                System.out.print("Route " + (i+1)+": "+"Length " + String.format("%.2f",currentRoute.getLength())+", max width " + currentRoute.getMaxWidth()+": " + 
                "Start at"+ currentRouteRoads.get(0).getStartLocation().getLocationName() + ". ");
                for(int a = 0;a<currentRouteRoads.size();a++)
                {
                    System.out.print("Follow " + currentRouteRoads.get(a).getName() + " to" + currentRouteRoads.get(a).getEndLocation().getLocationName() + ". ");
                }
            }
            else
            {
                System.out.println("Route " + (i+1)+": Invalid route");
            }
            if(i !=routeList.size()-1)
            {
                System.out.println("");
            }
        }

    }
}

