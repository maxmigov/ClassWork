package main;

import java.util.ArrayList;
import java.util.List;

public class Example1App {

	public static void main(String[] args) {
		///////////////PRODUCER (SOURCE)//////////////////
		List<String> names = new ArrayList<>();
					 names.add("Marry");
					 names.add("Oscar");
					 names.add("Olga");
					 names.add("Oleg");
					 names.add("Johny");
					 names.add("Zoia");
					 names.add("Poppins");
		///////////////STREAM - TEMPORARY/////////////////
					 names.stream()
					 	  .skip(2)
					 	  .filter(Example1App::select)
					 	  .forEach(Example1App::show); // convert to stream
		///////////////CONSUMER///////////////////////////
		//show()			 
					 
	}
	public static void show(String v) {
		System.out.println(v);
	}
	
	public static boolean select(String v) {
		return v.startsWith("O");

	}
}
