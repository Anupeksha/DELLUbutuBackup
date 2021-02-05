package CallByValueOrRef;

public class callByValOrRef
{
    public static void main(String[] args)
    {

        //Call by value

        double d=879.879D;
        modify(d);
        System.out.println(d);

        System.out.println("############################");

        //Call by Reference
        Rectangle r1=new Rectangle(447,897d);
        modify(r1);
        System.out.println(r1.len+"   "+r1.bred);

    }

    private static void modify(Rectangle refRectangle)
    {
        System.out.println("Before modification = " +refRectangle.len+"  "+refRectangle.bred);
        refRectangle.len+=100;
        refRectangle.bred*=5;
        System.out.println("Before modification = " +refRectangle.len+"  "+refRectangle.bred);
    }

    private static void modify(double dub)
    {
        System.out.println("Before modification = " +dub);
        dub+=876.90d;
        System.out.println("After modification = " +dub);
    }
}
