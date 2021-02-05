package Acces_Modifier.Package1;

import Access_Modifier.Package2.package2PublicClass;
import Access_Modifier.Package2.*;


public class AccessModifier_MainClass
{
    public static void main(String[] args)
    {
        package1DefaultClass p1dc=new package1DefaultClass();
        package1PublicClass p1pc=new package1PublicClass();
        package2PublicClass p2pc=new package2PublicClass();

//        package2DefaultClass p2dc =new package2DefaultClass();
//        --------------- Classes -------------------
//        1. Default class can be accessed within the package
//        2. Default class can not be accessed outside the package

        p1pc.package1DefaultMethod();
        p1pc.package1ProtectedMethod();
        p1pc.package1PublicMethod();
//        p1dc.package1PrivateMethod();
//        --------------- Methods -------------------
//        1. Protected method can be accessed within the class
//        2. Protected method cannot be accessed outside the class


    }
}
