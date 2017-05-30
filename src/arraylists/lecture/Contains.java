package arraylists.lecture;

import java.util.ArrayList;

public class Contains {

	public static void main(String[] args) {
		// to check for a component in an Array, must create a for loop that
		// iterates over each element
		// for ArrayLists, simply use the contains() method to accomplish the
		// same thing

		ArrayList<String> myTools = new ArrayList<String>();
		myTools.add("hammer");
		myTools.add("shovel");
		myTools.add("wrench");

		if (myTools.contains("hammer")) {
			System.out.println("I have a hammer!");
		}
		
		// improperly calling indexOf() method to accomplish same thing as contains() 
		if(myTools.indexOf("shovel") >= 0) {
			System.out.println("I have a shovel!");
		}

	}

}
