package week3day2assignments;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



public class MostRepeatingAlphabet {

	public static void main(String[] args) {
		/*Assignment3:Find the most duplicate number -> First most duplicate
		 * input: abbaba
		 * output: b*/

		String input = "abbaba";
		char[] inputarray = input.toCharArray();
		Map<Character, Integer> mapobj = new HashMap<Character, Integer>();
		//initiate occurence for mapobj
		//initaite max occ char as 0
		//use get or defaiult to 
		for (int i = 0; i < inputarray.length; i++) {
			mapobj.put(inputarray[i],mapobj.getOrDefault(inputarray[i], 0)+1);	
		}


		int maxoccurence =0;
		char maxOccChar =0;
		for (Entry<Character, Integer> entryvalue : mapobj.entrySet())
		{


			if(entryvalue.getValue()>maxoccurence) {
				maxoccurence=entryvalue.getValue();
				maxOccChar=entryvalue.getKey();

			}
			
		
			
			
		}
		System.out.println("Max Occuring is "+ maxOccChar + " and by number of occurances as: "+maxoccurence);


	}

}
