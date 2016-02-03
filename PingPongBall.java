package homework;

public class PingPongBall {
	
	//field
	private String TeamName; //this is also SeedNumber
	
	//constructor
	public PingPongBall(String teamName) {
		TeamName = teamName;
	}

	
	//methods
	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	//toString
	@Override
	public String toString() {
		return "PingPongBall [TeamName=" + TeamName + "]";
	}
	
	
	
	

}
