package arraylists.lecture;

import java.util.ArrayList;

public class IndexOf {

	public static void main(String[] args) {
		// for an Array, this would have to be accomplished using a for loop
		// you can use indexOf() method to accomplish the same thing for
		// ArrayLists (reduces "conditional complexity")

		ArrayList<String> myTools = new ArrayList<String>();
		myTools.add("hammer");
		myTools.add("shovel");
		myTools.add("wrench");

		System.out.println("Shovel is element " + myTools.indexOf("shovel"));

	}

}
