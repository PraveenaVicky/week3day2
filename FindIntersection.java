package week3day2assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* s Pseudo Code as per arracy
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 *find intersection
	 */
	
		List<Integer>  list1 = new ArrayList<Integer>() ;
		
		List<Integer>  list2 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		//list1 retaina all the common elements in the list2
		list1.retainAll(list2);
		System.out.println(list1);
		
		
		
	}

}
