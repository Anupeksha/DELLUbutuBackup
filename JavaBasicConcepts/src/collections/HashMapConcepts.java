package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts
{
    public static void main(String[] args)
    {
        //Hashmap is a class implements Map Interface
        //extends AbstractMap
        //holds only unique elements
        //stores the value  - key-value pair
        //it may have one null key and multiple null values
        //it maintains no order(Unordered)

        HashMap<Integer,String> hm=new HashMap<Integer,String>();

        hm.put(1,"Aradhi");
        hm.put(2,"Viya");
        hm.put(3,"Vishu");
        hm.put(4,"Akshay");

        System.out.println(hm.get(4));
        System.out.println("_________");
        System.out.println(hm);

        hm.remove(3);
        System.out.println("_________");
        System.out.println(hm);

        System.out.println("_________");
        for (Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+"   "+m.getValue());
        }
        System.out.println("_________");
        System.out.println(hm.get(5));


        System.out.println("############################");
        HashMap<Integer,Employee> hmEmp=new HashMap<Integer,Employee>();

        Employee e1=new Employee("Aradhi",3,"Udam");
        Employee e2=new Employee("Viya",4,"Binnu");
        Employee e3=new Employee("Vishu",11,"Gunnu");

        hmEmp.put(1,e1);
        hmEmp.put(2,e2);
        hmEmp.put(3,e3);

        for (Map.Entry<Integer,Employee> ent:hmEmp.entrySet())
        {
            int key = ent.getKey();
            Employee ee=ent.getValue();
            System.out.print(key+"  "+"Info : ");
            System.out.print(ee.name+"/"+ee.age+"/"+ee.dept);
            System.out.println();
        }
    }


}
