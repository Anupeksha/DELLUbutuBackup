package collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist 
{
	public static void main(String[] args) 
	{
		LinkedList<String> linkl =new LinkedList<String>();
		linkl.add("Red");
		linkl.add("Green");
		linkl.add("Purple");

		System.out.println(linkl);

		linkl.addFirst("Yellow");
		System.out.println(linkl);

		linkl.addLast("Yellow");
		System.out.println(linkl);

		linkl.set(2, "Black");
		System.out.println(linkl.get(4));

		linkl.removeFirstOccurrence("Yellow");
		System.out.println(linkl);

		linkl.removeFirst();
		System.out.println(linkl);

		linkl.add("Magenta");
		linkl.add("brown");

		System.out.println("--------------------------------");

		//For loop
		for (int i = 0; i < linkl.size(); i++) 
		{
			System.out.println(linkl.get(i));	
		}
		System.out.println("--------------------------------");

		//Advanced for loop
		for (String string : linkl) 
		{
			System.out.println(string);	
		}
		System.out.println("--------------------------------");

		//Iterator
		Iterator< String> itr=linkl.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------");

		//While loop
		System.out.println("While loop");
		int num=0;
		while(num< linkl.size())
		{
			System.out.println(linkl.get(num));
			num++;
		}

	}

}
