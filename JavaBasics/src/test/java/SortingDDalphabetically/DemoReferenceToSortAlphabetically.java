package SortingDDalphabetically;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoReferenceToSortAlphabetically 
{

	public static void main(String[] args) throws InterruptedException
	{
		ArrayList<String> olist=new ArrayList<String>();
		olist.add("Vanuatu");
		olist.add("Syria");
		olist.add("Burundi");
		olist.add("Gambia");
		olist.add("Angola");

		Set<String> treeSet=new TreeSet<String>();		

		for (String string : olist) {
			//System.out.println(string);
			treeSet.add(string);
		}

		//		for (String string : treeSet) {
		//			System.out.println(string);
		//		}
		Iterator<String> itr=treeSet.iterator();

		for (int i = 0; i < treeSet.size(); i++) 
		{
			String str=itr.next();
			if(olist.get(i).equals(str))
			{
				System.out.println(olist.get(i)+"   =   "+str);
			}
			else
			{
				System.out.println(olist.get(i)+"   !=   "+str+"   ------   Mismatch found");
			}
		}
	}
}
