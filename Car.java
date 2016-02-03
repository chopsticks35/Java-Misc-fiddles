package homework;

public class Car {
	//fields
	private String make;
	private String model;
	private int year;
	private EngineObject engine;
	private TransmissionObject transmission;
	
	//constructor
	public Car(String make, String model, int year, EngineObject engine, TransmissionObject transmission) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.engine = engine;
		this.transmission = transmission;
	}

	//methods
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public EngineObject getEngine() {
		return engine;
	}

	public void setEngine(EngineObject engine) {
		this.engine = engine;
	}

	public TransmissionObject getTransmission() {
		return transmission;
	}

	public void setTransmission(TransmissionObject transmission) {
		this.transmission = transmission;
	}
	
	//toString
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", engine=" + engine + ", transmission="
				+ transmission + "]";
	}
	

	

	
	


}
