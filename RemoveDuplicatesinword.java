package week3day2assignments;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesinword {

	public static void main(String[] args) {
	// Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";	
		//String[] str= text.split(" ");
		
		//As Set doesnt haave duplicates we use set
		Set<Character> data = new TreeSet<Character>();
		
		for (int i = 0; i < text.length(); i++) {
			data.add(text.charAt(i));
			
			
		}
		
		for (Character c : data) {
		System.out.print(c.toString());
		}		
	}

}
