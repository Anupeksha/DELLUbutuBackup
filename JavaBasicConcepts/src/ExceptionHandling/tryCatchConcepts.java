package ExceptionHandling;

import Operators.AirthmeticOperators;

import java.util.Scanner;

public class tryCatchConcepts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Commencement of the Program");
        int i;
        System.out.println("Please enter the value of x : ");
        int x = sc.nextInt();
        try {
            i = x / 89;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally Block will always be executed");
        }

        System.out.println("Completion of the Program");


    }
}
