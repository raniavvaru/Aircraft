package differentAircrafts;

public class AircraftTest {


	public static void main(String[] args) {
		
		aircraft cessna127 = new aircraft();
		
       aircraft pipersaratoga= new aircraft();
       
       
	cessna127.passengers= 4;
	cessna127.cruisespeed= 140;
	cessna127.fuelspeed= 35.6;
	cessna127.fuelburnrate =9.3;
	
	System.out.println("cessna127 passengers: " + cessna127.passengers);
	System.out.println("cessna127 fuelburnrate: " + cessna127.fuelburnrate + "gph");
	
	pipersaratoga.passengers= 6;
	pipersaratoga.cruisespeed= 150;
	pipersaratoga.fuelspeed= 45.5;
	pipersaratoga.fuelburnrate= 6.5;
	 System.out.println("pipersaratoga passengers: " + pipersaratoga.passengers);
	 System.out.println("\n pipersaratoga cruise speed: " + pipersaratoga.cruisespeed + "mph");
		
}
}
 class aircraft {
	 
	 int passengers;
	 int cruisespeed;
	double fuelspeed;
	double fuelburnrate;
	
 }