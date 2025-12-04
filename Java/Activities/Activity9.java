package Examples;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		 myList.add("One");
	     myList.add("Two");
	     myList.add("Three");
	     myList.add(3, "Four");
	     myList.add(1, "Five");
	     for(String x:myList) {
	    	 System.out.println(x);
	     }
	     System.out.println("3rd element is: " +myList.get(2));
	     if(myList.contains("One")) {
	    	 System.out.println("The list contains the object given");
	     }
	     System.out.println(myList.size());
		myList.remove(2);
		System.out.println(myList);
	}

}
