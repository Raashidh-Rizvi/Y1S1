import java.util.Scanner;

public class IT24104191Lab6Q1 {

public static void main (String[]args) {


/* Write a Java program to display the square and square-root of any number, input by the
 user */



Scanner input = new Scanner(System.in);

	System.out.print("Enter A number: ");
	double num=input.nextDouble();

	double squr=Math.pow(num,2);

	double sqrt=Math.sqrt(num);

	System.out.println("The Square of "+ num + " is : " +squr);

	System.out.println("The Square root of "+ num + " is : " +sqrt);
 
}

}


	