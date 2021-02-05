package Interfaces;

public class interfaceConcepts
{
    public static void main(String[] args)
    {
        //new Animal();     Interface cannot be instantiated
        Animal a1;
        Animal a2=new Dog();
        a2.eat();
        a2.run();


    }
}

interface Animal
{
    void run(); //by default methods in an interface are public abstract
    void eat();
    float pi=3.14F;  //by default variables in an interface are public static final
}

class Dog implements Animal
{
    //pi=90.31F;
    @Override
    public void run()
    {
        System.out.println("Dog is running");
    }

    @Override
    public void eat()
    {
        System.out.println("Dog is eating");
    }
}

class Cat extends Dog
{

}
