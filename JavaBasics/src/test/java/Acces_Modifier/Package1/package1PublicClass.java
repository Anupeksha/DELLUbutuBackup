package Acces_Modifier.Package1;

public class package1PublicClass
{
    privateClass pc =new privateClass() ;
    protectedClass prc=new protectedClass();

    protected class protectedClass
    {

    }

    private class privateClass
    {

    }

    void package1DefaultMethod()
    {

        System.out.println("Inside package1DefaultMethod");
    }

    private void package1PrivateMethod()
    {

        System.out.println("Inside package1PrivateMethod");
    }

    protected void package1ProtectedMethod()
    {

        System.out.println("Inside package1ProtectedMethod");
    }

    public void package1PublicMethod()
    {

        System.out.println("Inside package1PublicMethod");
    }
}
