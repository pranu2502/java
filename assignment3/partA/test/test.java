import Package.myAirline;
package test;
import myAirline.*;
public class test {
    public static void main(String args[])
    {
        Airline indigo = new Airline();
        FLight flight1 = new flight("Hyd","Blr",130,4500);
        FLight flight2 = new flight("Hyd","Del",150,4700);
        FLight flight3 = new flight("Hyd","Bom",140,1500);
        FLight flight4 = new flight("Hyd","Mad",100,9500);
        FLight flight5 = new flight("Hyd","Kol",180,6500);
        indigo.addFlight(flight1);
        indigo.addFlight(flight2);
        indigo.addFlight(flight3);
        indigo.addFlight(flight4);
        indigo.addFlight(flight5);
        System.out.println(indigo.lowestFlightTicket());
    }
}