package arraylists.exercises;

import java.util.ArrayList;

public class NumberList {

	public static void main(String[] args) {
		ArrayList<Integer> numberExercise = new ArrayList<Integer>();

		numberExercise.add(1); // 0
		numberExercise.add(23); // 1
		numberExercise.add(9); // 2
		numberExercise.add(77); // 3
		numberExercise.add(922); // 4
		numberExercise.add(6); // 5
		numberExercise.add(32); // 6
		numberExercise.add(63); // 7
		numberExercise.add(14); // 8
		numberExercise.add(5); // 9

		containsNumbers();

		numberExercise.remove(3); // removes 77
		numberExercise.remove(3); // removes 922
		numberExercise.remove(4); // removes 32
		numberExercise.remove(3); // removes 6
		System.out.println(numberExercise);
		containsNumbers();

	}

	public static void containsNumbers() {
		ArrayList<Integer> numberExercise = new ArrayList<Integer>();
		if (numberExercise.contains(23)) {
			System.out.println("The list contains 23.");
		} else {
			System.out.println("The list does not contain 23.");
		}
		if (numberExercise.contains(77)) {
			System.out.println("The list contains 77.");
		} else {
			System.out.println("The list does not contain 77.");
		}
		if (numberExercise.contains(15)) {
			System.out.println("The list contains 15.");
		} else {
			System.out.println("The list does not contain 15.");
		}
	}

}
