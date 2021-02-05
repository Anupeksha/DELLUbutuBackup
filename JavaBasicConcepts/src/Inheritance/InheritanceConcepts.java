package Inheritance;

public class InheritanceConcepts
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.breed="Doberman";
        d.color="Pearl";
        d.bark();
        d.eat();
        System.out.println("############");

        Cat c= new Cat();
        c.age=23;
        c.color="Golden";
        c.meow();
        //c.eat();


    }
}

class Animal {
    String color;

    public void eat() {
        System.out.println("The Animal is eating");
    }

}

class Dog extends Animal
{
   String breed;
   public void bark()
   {

   }

    @Override
    public void eat() {
       super.eat();
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal
{
    int age;
    {
        super.eat();
    }
    public void meow()
    {

    }

//    @Override
//    public void eat() {
//        super.eat();
//        System.out.println("Cat is eating");
//    }
}