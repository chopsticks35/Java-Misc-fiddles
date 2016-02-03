package homework;

public class EngineObject {
	//fields
	private int cylinders;
	private String fuelType;
	private String liters;
	
	//constructor
	public EngineObject(int cylinders, String fuelType, String liters){
		this.cylinders = cylinders;
		this.fuelType = fuelType;
		this.liters = liters;
	}

	//methods
	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getLiters() {
		return liters;
	}

	public void setLiters(String liters) {
		this.liters = liters;
	}
	
	//toString
	@Override
	public String toString() {
		return "EngineObject [cylinders=" + cylinders + ", fuelType=" + fuelType + ", liters=" + liters + "]";
	}
	

	
	
	

	
}

