package week3day2assignments;


import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



public class InputArrayEachOccurrence {

	public static void main(String[] args) {


		int[] nums = {2,3,5,6,3,2,1,4,2,1,6,-1};

		/*	) Create Map -> TreeMap
		 * 2) For loop -> each number -> add to the map
		 * 3) If it is exist -> update it with + 1
		 * 	  Else -> new entry with 1 as value
		 */

		Map<Integer, Integer> numsobj = new TreeMap<Integer, Integer>();

		//get the individual element as key
		//use getordefault to increase the value if it is present twice
		//num[i] is the key and 
		//getordefault  is used to say if key present default it already present increase by 1
		//Tree map is used to print in ascnding order
		for (int i = 0; i < nums.length; i++) {
			numsobj.put(nums[i], numsobj.getOrDefault(nums[i], 0)+1);

		}
		System.out.println(numsobj);	
	}

}
