package arraylists.lecture;

import java.util.ArrayList;

public class Autoboxing {

	public static void main(String[] args) {
		// ArrayList that holds Integers (must use class version)
		// Then you create a primitive - but you can add the primitive to the
		// Java will autobox - i.e. automatically convert from a primitive to an
		// object
		// Why not always use the object version? Null (autovalue) can create
		// major issues i.e. how would you handle a null Integer?
		ArrayList<Integer> answers = new ArrayList<Integer>();
		int ultimateAnswer = 42;
		answers.add(ultimateAnswer);
		answers.add(86);

		System.out.println("The answers are: " + answers);

		Integer asIntegerObject = ultimateAnswer;
		System.out.println("The ultimate answer is " + asIntegerObject);
	}
}
