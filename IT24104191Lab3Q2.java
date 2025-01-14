import java.util.Scanner;

public class IT24104191Lab3Q2 {

public static void main (String[]args) {

/*
An employee is paid an additional amount to his monthly salary as OT amount.
 Write a Java program to input the monthly salary, number of OT hours and OT hourly
 rate from the keyboard to find the total salary.

*/



	Scanner input = new Scanner(System.in);

	
	System.out.print ("Enter the monthly salary : ");
	double salary = input.nextInt();

	System.out.print ("Enter The Number Of OT hours : ");
	double ot = input.nextInt();
	
	System.out.print ("Enter The OT hourly rate : ");
	double rate = input.nextInt();


	Double otAmount = ot * rate;
	Double total = salary + otAmount;
	

	System.out.println();
	
	System.out.print ("This total Salary including OT is : " + total);

}

}








