package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hopper {
	public static void main(String args[]){
		//hopper collection of balls
		List <PingPongBall> hopper = new ArrayList<>(1000);
		
		//balls into hopper
		//could make a method to add each time 
		for (int i = 0; i< 250; i++){
		hopper.add(new PingPongBall("Timberwolves"));
		}
		
		for (int i = 0; i < 199; i++){
			hopper.add(new PingPongBall("Lakers"));	
		}
		for (int i = 0; i < 156; i++){
			hopper.add(new PingPongBall("Sixers"));	
		}
		for (int i = 0; i < 119; i++){
			hopper.add(new PingPongBall("Knicks"));	
		}
		for (int i = 0; i < 88; i++){
			hopper.add(new PingPongBall("Magic"));	
		}
		for (int i = 0; i < 63; i++){
			hopper.add(new PingPongBall("Kings"));	
		}
		for (int i = 0; i < 43 ; i++){
			hopper.add(new PingPongBall("Kings"));	
		}
		for (int i = 0; i < 28 ; i++){
			hopper.add(new PingPongBall("Pistons"));	
		}
		for (int i = 0; i < 17; i++){
			hopper.add(new PingPongBall("Hornets"));
		}
		for (int i = 0; i < 11; i++){
			hopper.add(new PingPongBall("Heat"));
		}
		for (int i = 0; i < 8; i++){
			hopper.add(new PingPongBall("Pacetsrs"));
		}
		for (int i = 0; i < 7; i++){
			hopper.add(new PingPongBall("Jazz"));
		}
		for (int i = 0; i < 6; i++){
			hopper.add(new PingPongBall("Suns"));
		}
		for (int i = 0; i < 5; i++){
			hopper.add(new PingPongBall("Thunder"));
		}
		
		for(int i = 0; i< 100; i++ ){
			//shuffle and first pick (top of line is winner)
			Collections.shuffle(hopper);
			System.out.println("The first draft goes to: " + hopper.get(0));
			//need to remove hopper.get(0) from hopper 
			hopper.remove(0);
			
		}
		
		
		
	}

}
