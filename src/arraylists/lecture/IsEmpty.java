package arraylists.lecture;

import java.util.ArrayList;

public class IsEmpty {

	public static void main(String[] args) {
		ArrayList<Integer> answers = new ArrayList<Integer>();
		System.out.println("Are you out of answers? " + answers.isEmpty());
		// isEmpty() method same as the following, but much cleaner:
		System.out.println("Are you out of answers? " + (answers.size() == 0));

		answers.add(42);
		System.out.println("Are you out of answers? " + answers.isEmpty());
	}

}
