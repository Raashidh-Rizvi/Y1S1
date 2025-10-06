import java.util.Scanner;

public class IT24104191Lab3Q1A {

public static void main (String[]args) {

/* Enter the price of 1kg of rice and the number of kilograms you want to buy from the
 keyboard. Write a Java program to find the amount you have to pay. */


 Scanner input = new Scanner(System.in);
	System.out.println();

	System.out.print ("Enter The Price Of 1kg of rice : ");
	double price = input.nextDouble();

	System.out.print ("Enter The Number of Kilograms You Want to buy : " );
	double kilos = input.nextDouble();

	double total = price * kilos;
	System.out.println();

	System.out.print("The total amount is : " + total );
	System.out.println();

}

}
	
	

	



