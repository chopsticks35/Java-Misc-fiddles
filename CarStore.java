package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CarStore {

	private ArrayList<Car> carInventory = new ArrayList<>();

	// method for read, parse, instantiate into ArrayList
	private void readParseCreateCars() {
		try {
			FileReader fr = new FileReader("CarSpecs.txt");
			BufferedReader br = new BufferedReader(fr);

			int i = 0;
			String line;
			while ((line = br.readLine()) != null) {
				String[] carParts = line.split(", ");
				String make = carParts[0];
				String model = carParts[1].trim();
				try {
					int year = Integer.parseInt(carParts[2].trim());

					int cylinders = Integer.parseInt(carParts[3].trim());

					String fuelType = carParts[4].trim();

					String liters = carParts[5].trim();

					int gears = Integer.parseInt(carParts[6].trim());

					String type = carParts[7].trim();

					Car assembledCar = new Car(make, model, year, (new EngineObject(cylinders, fuelType, liters)),
							(new TransmissionObject(gears, type)));

					carInventory.add(assembledCar);

				} catch (NumberFormatException e) {
					System.out.println(e.getMessage());

				}
			}
			br.close();
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}
	}

	// method for menu
	private void displayMenuSelect() {
		int q = 0;
		int Q = 0;
		int selection = 0;
		
		do {
		System.out.println("Welcome to the Car Store!");
		System.out.println("Please select your search query:");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Press 1 to view our full inventory.");
		System.out.println("Press 2 to search by model.");
		System.out.println("Press 3 to search by make.");
		System.out.println("Press 4 to QUIT.");
		
			try {
				selection = Integer.parseInt(br.readLine());
				switch (selection) {
				case 1:
					searchAllCars(carInventory);
					break;

				case 2:
					System.out.println("Please enter the make:");
					String makeSelection = br.readLine();
					searchMake(makeSelection);
					break;

				case 3:
					System.out.println("Please enter the model:");
					String modelSelection = br.readLine();
					searchModel(modelSelection);
					break;
				
				case 4:
					System.out.println("Thank you - goodbye.");
					break;
				}

			} catch (NumberFormatException e) {
				e.getMessage();
			} catch (IOException e) {
				e.getMessage();
			}
		} while (selection != 4);

	}

	// method for no results
	private void returnNotFound() {
		System.out.println("Selection not found.");
	}

	// method for all cars
	private void searchAllCars(ArrayList a) {
		for (Object car : a) {
			System.out.println(car);
		}
	}

	// method for search make
	private void searchMake(String makeSelection) {
		ArrayList<Car> carMake = new ArrayList<>();
		for (Car c : carInventory) {
			if (makeSelection.equals(c.getMake())) {
				carMake.add(c);
			}
		}
		if (carMake.size() == 0) {
			returnNotFound();
		} else {
			for (Car c : carMake) {
				System.out.println(c);

			}
		}
	}

	// method search model
	private void searchModel(String modelSelection) {
		ArrayList<Car> carModel = new ArrayList<>();
		for (Car c : carInventory) {
			if (modelSelection.equals(c.getModel())) {
				carModel.add(c);
			}
		}
		if (carModel.size() == 0) {
			returnNotFound();
		} else {
			for (Car c : carModel) {
				System.out.println(c);

			}
		}
	}

	public static void main(String[] args) {

		CarStore c = new CarStore();

		c.readParseCreateCars();
		c.displayMenuSelect();

	}
}