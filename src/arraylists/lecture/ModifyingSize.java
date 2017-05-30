package arraylists.lecture;

import java.util.ArrayList;

public class ModifyingSize {

	public static void main(String[] args) {
		// arrays are a fixed size, difficult to change the size. Example:
		// int[] myArray = {1, 2, 3};
		// int[] oldArray = myArray;
		// myArray = new int[4];
		// for(int index = 0; index < oldArray.length; index++) {
		// myArray[index] = oldArray[index];
		// }
		// myArray[3] = 42;

		// ArrayLists can grow and shrink
		ArrayList<String> giantWords = new ArrayList<String>();
		giantWords.add("fee"); //add() is a method for ArrayList
		giantWords.add("fie");
		giantWords.add("foe");
		System.out.println(giantWords);       //size() is a method for ArrayList
		System.out.println("my list has " + giantWords.size() + " elements");

		giantWords.add("fum");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");


	}

}
