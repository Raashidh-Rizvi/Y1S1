import java.util.Scanner;

public class IT24104191Lab6Q2B {

	public static void main (String[]args) {

/*Modify your Java program to enter 10 numbers from the keyboard as user input
 and print the result.*/

		Scanner input = new Scanner (System.in);

		int i=0;
		int num[] = new int [10];

		System.out.println("Please Enter 10 numbers /n"); 
		while (i<=9){
			System.out.print("Enter a number "+ (i+1) +" : " );
			num[i]= input.nextInt();

			i++;
		}

		System.out.println ("The numbers You Entered Are :");

		i=0;
		while (i<=9){
	
			System.out.print( num[i] + " " );

			i++;

		}
		System.out.println();




	}	

}

