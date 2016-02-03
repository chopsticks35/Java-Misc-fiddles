package homework;

public class TransmissionObject {
	//fields
	private int gears;
	private String type;
	
	//constructor
	public TransmissionObject(int gears, String type){
		this.gears = gears;
		this.type = type;
	}
	
	//methods
	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	//toString
	@Override
	public String toString() {
		return "TransmissionObject [gears=" + gears + ", type=" + type + "]";
	}
	

	
	

}
