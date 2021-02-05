package Constructors;

public class defaultConstructorConcept
{
    public static void main(String[] args)
    {
        cuboid c1=new cuboid();
        System.out.println("Length : "+c1.length);
        System.out.println("Breadth : "+c1.breadth);
        System.out.println("Height : "+c1.height);
        System.out.println("Depth : "+c1.depth);
        System.out.println("Name : "+c1.name);
        System.out.println("Employee : "+c1.e);
        System.out.println("#########################################");

        EmployeeDetails emp1=new EmployeeDetails("Tommy",26,"Testing-QA");
        long a= 90L;
        cuboid c2= new cuboid(34,56.6d,87.9F,90L,"MyCuboid",emp1);
        System.out.println("Length : "+c2.length);
        System.out.println("Breadth : "+c2.breadth);
        System.out.println("Height : "+c2.height);
        System.out.println("Depth : "+c2.depth);
        System.out.println("Name : "+c2.name);
        System.out.println("Employee : "+c2.e.name+" "+c2.e.age+ "  "+c2.e.dept);
    }
}
