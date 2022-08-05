package week3day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		//put the int array in a list
		List<Integer> list1 =new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			list1.add(arr[i]);
		}
		
		//sort the array in ascending order
		Collections.sort(list1);
		//get size of the lsit
		int size = list1.size();
		
		System.out.println("The sec largest number" + list1.get(size-2));	
			
		
		
		}

}
