package homework;


public class JetAirplaneTest {

	public static void main(String[] args){
		
		//prompts user for Number in fleet and creates index,
		JetAirplane.createFleet();
		
		//instantiate pilot
		Pilot pilot = new Pilot("New Pilot", 45, 10);
		
		//loops and instantiates all except last one and
		//pops the array
		JetAirplane.popFleet(pilot);
		
		//call method to instantiate and pop last jet
		JetAirplane.createLastOne();
		
		//call print menu method - which also has switch for options
		JetAirplane.printMenu();
		
		
		
	
		
		
		
		
		
		
		
		
		
	
		
		
			
	
		
			 

	}
}