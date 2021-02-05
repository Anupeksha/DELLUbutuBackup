package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept
{
	public static void main(String[] args)
	{
		Set<String> s=new HashSet<String>();
		s.add("Fruity");
		s.add("Mountain Dew");
		s.add("Limca");
		s.add("Coca cola");
		s.add(null);

		System.out.println(s);
		System.out.println("**********************");
		System.out.println(s.contains("xyu"));
		System.out.println("**********************");
		for (String val:s)
		{
            System.out.println(val);
		}

		s.remove(null);
        System.out.println(s);
        System.out.println("**********************");

        Iterator<String> itr=s.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        Set<Integer> s1=new HashSet<Integer>();
        s1.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,8,9,10}));

        Set<Integer> s2=new HashSet<Integer>();
        s2.addAll(Arrays.asList(new Integer[] {1,2,3,5,6,7,9}));
        //get the union
        System.out.println("**********************");
        Set<Integer> union=new HashSet<Integer>(s1);
        union.addAll(s2);
        System.out.println(union);

        //get the intersection
        System.out.println("**********************");
        Set<Integer> intersection=new HashSet<Integer>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);

        //get the difference
        System.out.println("**********************");
        Set<Integer> difference=new HashSet<Integer>(s1);
        difference.removeAll(s2);
        System.out.println(difference);


	}

}
