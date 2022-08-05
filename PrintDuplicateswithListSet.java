package week3day2assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateswithListSet {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();

		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};

		for (int i = 0; i < arr.length; i++) {

			list1.add(arr[i]);
		}


		//convert list to set  Tree Set 
		Set<Integer> set1= new TreeSet<Integer>();

		// iterate all the values of set in list
		for (Integer integer : list1) {

			if(set1.add(integer)==false)
			{
				System.out.println("The number duplicated is " +integer);
			}

		} 
	}

}
