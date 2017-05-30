package arraylists.lecture;

import java.util.ArrayList;

public class MoreTools {

	public static void main(String[] args) {
		ArrayList<String> myThings = buildDemoList();
		System.out.println(myThings);

		// .clear() removes all elements from the list
		myThings.clear();
		System.out.println(myThings);

		// calling demo list method to populate the previously cleared ArrayList
		// "myThings"
		myThings = buildDemoList();
		// set() will replace an existing index with a different value
		myThings.set(1, "foo");
		System.out.println(myThings);

		// add(int index, String element) will insert at that index and shift
		// other values
		// i.e. this method does not overwrite
		myThings.add(2, "bar");
		System.out.println(myThings);

		// remove(int index) and then shift other values down
		myThings.remove(2);
		System.out.println(myThings);

		// remove (the first instance) by value, shifts index down by one
		myThings.remove("foo");
		System.out.println(myThings);

		myThings.add("foo");
		myThings.add("foo");
		System.out.println(myThings);
		// to remove all instances of a value, can utilize a while loop
		while (myThings.contains("foo")) {
			myThings.remove("foo");
		}

		System.out.println(myThings);

	}

	// method signature ArrayList<String> = return type buildDemoList() is the
	// method name - when you call this method, it will build the demo list for
	// whatever ArrayList you specify
	public static ArrayList<String> buildDemoList() {
		ArrayList<String> demoList = new ArrayList<String>();
		demoList.add("this");
		demoList.add("that");
		demoList.add("the other");
		return demoList;
	}
}
