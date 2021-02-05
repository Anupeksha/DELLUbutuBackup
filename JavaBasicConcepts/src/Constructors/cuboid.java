package Constructors;

import collections.Employee;

public class cuboid
{
    int length;
    double breadth;
    float height;
    long depth;
    String name;
    EmployeeDetails e;

    public cuboid()
    {

    }

    public cuboid(int len, double br, float ht, long dp, String name, EmployeeDetails e)
    {
       this.length=len;
       this.breadth=br;
       this.height=ht;
       this.depth=dp;
       this.name=name;
       this.e=e;
    }


}
