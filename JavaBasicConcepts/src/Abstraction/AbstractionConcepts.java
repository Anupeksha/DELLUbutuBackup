package Abstraction;

public class AbstractionConcepts {
    public static void main(String[] args) {
        //new Animal(); --Not allowed, cannot create objects of abstract class
        Animal a1;  // Allowed. can create reference of absract class
        Animal a2 = new Dog(); //parent class reference --Child class object
        a2.run();
        a2.eat();

    }
}

    abstract class Animal
    {
        abstract public void eat();
        public void run()
        {
            System.out.println("------running-----");
        }
    }

    class Dog extends Animal
    {
        @Override
        public void eat()
        {
            System.out.println("Dog is eating");
        }
    }

    class Cat extends Dog
    {

    }
