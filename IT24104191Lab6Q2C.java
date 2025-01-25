import java.util.Scanner;

public class IT24104191Lab6Q2C {

	public static void main (String[]args) {

/*Modify the program again to display the Sum and Average of the numbers entered.*/

		Scanner input = new Scanner (System.in);

		int i=0;
		int num[] = new int [10];
		int sum=0;
		double avg=0;

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
		
		
		
	
				sum = sum + num[i];
				avg = sum/(i+1);
				i++;	
		}
		System.out.println();
		System.out.println("Sum of the numbers : "+sum);
		
		System.out.println("Average of the numbers : "+avg );
		
		
		System.out.println();
	}	

}

