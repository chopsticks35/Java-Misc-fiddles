package homework;

import java.util.Scanner;

public class JetAirplane {

	// fields
	private String jetModel = null;
	private float topSpeed = 0F;
	private int range = 0;
	// create array of jetAirplanes
	static JetAirplane[] jetArray;
	static int displaySelection = 0;
	// scanner in - static for all use
	static Scanner keyboard = new Scanner(System.in);
	//add pilot field
	private Pilot pilot;

	// constructors:
	// parameterized constructor
	public JetAirplane(String jetModel, float topSpeed, int range) {
		this.jetModel = jetModel;
		this.topSpeed = topSpeed;
		this.range = range;
	}
	
	//for pilot 4 par constructor
	public JetAirplane(String jetModel, float topSpeed, int range, Pilot pilot) {
		this.jetModel = jetModel;
		this.topSpeed = topSpeed;
		this.range = range;
		this.pilot = pilot;
	}

	// noarg constructor
	public JetAirplane() {
	}

	public static void createFleet() {

		// prompt user for fleet size (array index) - then loop to create
		// elements of array
		System.out.println("Please enter the number of jets in the fleet (3 - 5): ");
		int arrayIndex = keyboard.nextInt();
		if (arrayIndex < 3 || arrayIndex >5){
			System.out.println("Invalid fleet number.  Please enter a number between or including 3-5: ");
			arrayIndex = keyboard.nextInt();
		}
		jetArray = new JetAirplane[arrayIndex];
	}

	// for loop to pop array minus 1
	public static void popFleet(Pilot pilot) {
		for (int i = 0; i < (jetArray.length - 1); i++) {
			System.out.println("Please enter the jet model name: ");
			String jetModel = keyboard.next();
			System.out.println("Please enter " + jetModel + "'s top speed (Mach): ");
			int topSpeed = keyboard.nextInt();
			System.out.println("Please enter " + jetModel + "'s range:");
			int range = keyboard.nextInt();

			jetArray[i] = new JetAirplane(jetModel, topSpeed, range, pilot);
		}
	}

	// method for creating and populating final jet
	public static void createLastOne() {
		// instantiates last jet
		JetAirplane lastOne = new JetAirplane();

		// prompts user for data to input
		System.out.println("Please enter the final jet model name: ");
		String jetModel = keyboard.next();
		System.out.println("Please enter " + jetModel + "'s top speed (MPH): ");
		float topSpeed = keyboard.nextInt();
		System.out.println("Please enter " + jetModel + "'s range:");
		int range = keyboard.nextInt();

		// set attributes for last jet
		lastOne.setJetModel(jetModel);
		// expression for MACH
		lastOne.setTopSpeed(Math.round((topSpeed / 760) * 100F) / 100F);
		lastOne.setRange(range);

		jetArray[(jetArray.length - 1)] = lastOne;

		//print test
		//System.out.println(jetArray[(jetArray.length - 1)].toString());

	}

	// printMenu
	public static void printMenu() {
		int q = 0;
		int Q = 0;
		do{
		System.out.println("Please select how to view your fleet");
		System.out.println("1\t Display entire fleet");
		System.out.println("2\t Display fastest jet");
		System.out.println("3\t Display jet with greatest range");
		
		int displaySelection = keyboard.nextInt();
		
		keyboard.close();
		
		
	
		switch (displaySelection) {

		case 1:
			for (int i = 0; i < (jetArray.length); i++) {
				System.out.println(jetArray[i].toString());
			}
			break;
		case 2:
			JetAirplane fastestJet = jetArray[0];
			for (int i = 0; i < (jetArray.length); i++) {
				if (jetArray[i].topSpeed > fastestJet.topSpeed) {
					fastestJet = jetArray[i];
				}
			}
			System.out.println(fastestJet.toString());
			break;

		case 3:
			JetAirplane greatestRange = jetArray[0];
			for (int i = 0; i < (jetArray.length); i++) {
				if (jetArray[i].range > greatestRange.range) {
					greatestRange = jetArray[i];
				}
			}
			System.out.println(greatestRange.toString());
			break;
		}
		}
		while (displaySelection != q || displaySelection != Q);
	}
		

	// get/sets
	public String getJetModel() {
		return jetModel;
	}

	public void setJetModel(String jetModel) {
		this.jetModel = jetModel;
	}

	public float getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(float topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	// toString

	public String toString() {
		return "Jet Model is " + jetModel + 
				" top speed is Mach " + topSpeed +
				" range is " + range +
				" " + pilot;
	}
	//set pilot
	public void setPilot(Pilot pilot){
		this.pilot = pilot;
	}
}
