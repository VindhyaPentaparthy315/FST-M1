package Examples;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		 hs.add("H");
	     hs.add("E");
	     hs.add("L");
	     hs.add("L");
	     hs.add("O");
	     hs.add("!");
	     System.out.println("Actual HashSet is: " +hs);
	     System.out.println("Set size is :" +hs.size());
	     hs.remove("H");
	     if(hs.remove("S")) {
	        	System.out.println("S is removed from the Set");
	        } else {
	        	System.out.println("S is not present in the Set");
	        }
	     if(hs.contains("L")) {
	     System.out.println("Set has the element given");
	     }else {
	    	 
	    	 System.out.println("Given element is not present in Set");
	     }
	     System.out.println("Final Updated Set :" +hs);
	     
	}

}
