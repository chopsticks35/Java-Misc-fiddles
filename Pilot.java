package homework;

public class Pilot {
	private String name = "";
	private int age = 0;
	private int yearsExperience = 0;
	
	//constructor
	public Pilot(String name, int age, int yearsExperience) {
		this.name = name;
		this.age = age;
		this.yearsExperience = yearsExperience;
	}

	public String toString(){
			return "Pilot name is " + name +
					" age is " + age +
					"years of expereince " + yearsExperience;
	}
}
