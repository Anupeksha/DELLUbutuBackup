package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) 
	{
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Red");
		arr1.add("Blue");
		arr1.add("Green");

		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("Muskmelon");
		arr2.add("Lemon");
		arr2.add("Blueberry");

		for (int i = 0; i < arr1.size(); i++) 
		{
			System.out.println(arr1.get(i));	
		}
		System.out.println("--------------------------------");
		Iterator<String> itr=arr2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------");
		
		arr1.addAll(arr2);
		for (int i = 0; i < arr1.size(); i++) 
		{
			System.out.println(arr1.get(i));	
		}
		System.out.println("--------------------------------");
		
		arr1.removeAll(arr2);
		for (int i = 0; i < arr1.size(); i++) 
		{
			System.out.println(arr1.get(i));	
		}
		System.out.println("--------------------------------");
		
		arr1.add(3, "Phillipines");
		arr1.addAll(2, arr2);
		boolean yes = arr1.containsAll(arr2);
		System.out.println(yes);
		
		for (int i = 0; i < arr1.size(); i++) 
		{
			System.out.println(arr1.get(i));	
		}
		System.out.println("--------------------------------");
		//arr1.sort((Comparator<? super String>) arr2);
	}

}
