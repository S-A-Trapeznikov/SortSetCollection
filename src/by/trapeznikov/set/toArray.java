package by.trapeznikov.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class toArray {
	
	public static void main(String [] args){
		
		Set<Integer> arr1 = new HashSet<Integer>();
		arr1.add(2);
		arr1.add(3);
		arr1.add(5);
		arr1.add(6);
		arr1.add(1);
		arr1.add(34);
		arr1.add(23);
		arr1.add(2);
		arr1.add(8);
		
		Set<Integer> arr2= new TreeSet<Integer>(arr1);
		 
		System.out.println(arr2.iterator().next());
		
		Set<Integer> arr3= new LinkedHashSet<Integer>();
		
		Integer[] a = new Integer[arr2.size()];
		arr2.toArray(a);
		
		System.out.println(a.length);
		for (int i=a.length-1; i>=0; i--){
			arr3.add(a[i]);	
		}
			
		for (Integer el: arr3)
			System.out.println(el);
	}

}
