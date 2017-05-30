package arraylists.exercises;

import java.util.ArrayList;

public class BooleanMessage {

	public static void main(String[] args) {
		ArrayList<Boolean> weather = new ArrayList<Boolean>();
		
		weather.add(true);
		weather.add(false);
		weather.add(true);
		weather.add(false);
		weather.add(true);
		weather.add(false);
		
		for (Boolean weatherReturn : weather) {
			if (weatherReturn) { //why does this work?
				System.out.println("Better bring an umbrella today!");
			} else {
				System.out.println("No rain today, enjoy the sun");
			}
		}

	}

}
