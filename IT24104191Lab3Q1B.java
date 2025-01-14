import java.util.Scanner;

public class IT24104191Lab3Q1B {

public static void main (String[]args) {




 Scanner input = new Scanner(System.in);
	System.out.println();

	System.out.print ("Enter The Price Of 1kg of rice : ");
	double price = input.nextInt();

	System.out.print ("Enter The Number of Kilograms You Want to buy : " );
	double kilos = input.nextInt();

	double total = price * kilos*0.9;
	System.out.println();

		


	System.out.print("The total amount With 10% Discount : " + total );
	System.out.println();

}

}