package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Search {
	public static void main(String[] args) {
		
	FileReader fr;
	try {
		fr = new FileReader(args[1]);
		BufferedReader buf = new BufferedReader(fr);
		
		String line;
		while((line = buf.readLine()) != null){
			int managerSighting = line.indexOf(args[0]);
			if (managerSighting > 0){
				System.out.println(line);
			}
		}
		buf.close();
		} catch (IOException e) {
		System.out.println(e.getMessage());
	}
	
	
	
	}
}
