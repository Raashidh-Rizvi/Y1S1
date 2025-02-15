The ‘Quadratic Equation’ is given 
​
 
Let me know if you need it in another format!
 Write a Java program to input any three values for a, b, c and to calculate the x value.
 Hint: Use pow() and sqrt() methods in Java Math class.


import java.util.Scanner;

public class IT24104191Lab9Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Value a: ");

        double a = input.nextDouble();

        System.out.print("Enter Value b: ");

        double b = input.nextDouble();

        System.out.print("Enter Value c: ");

        double c = input.nextDouble();

        double x = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        double y = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        System.out.println();

        System.out.println("Roots Are real and Different : ");

        System.out.println("root 1 = " + x);
        System.out.println("root 2 = " + y);

    }
}
