import java.util.Scanner;

public class it24104191Lab5Q2 {

public static void main (String[]args) {



/*  A credit card company has a promotion for existing customers to introduce new mem
bers. Prizes are given to the customers depending on the number of new members they
 introduce. For example, if a customer has introduced 3 people, then he/she is entitled to
members and prize
 0-No Prize
 1-Pen
 2-Umbrella
 3-Bag
 4-Travelling Chair
 5 or greater -Headphone

Write a Java program using SWITCH statement to input the number of new members
 a customer has introduced and print the prizes the customer is entitled to. Validate the
 entered number (should be greater than or equal to 0).


*/

	Scanner input = new Scanner(System.in);

	System.out.print("Enter The number of new members introduced: ");


	int num = input.nextInt();

	if ( num <0 ){
	System.out.print("Input must be a number 0 or greater");
	return;

	}
	switch(num){

	case '0': System.out.println("You Have No price");
	break;

	case'1': System.out.print("Your Prize is a pen");
	break;	

	case'2': System.out.print("Your Prize is a bag");
	break;	

	case'3': System.out.print("Your Prize is a umbrealla ");
	break;	

	case'4' : System.out.print("Your Prize is a travelling bag");
	break;	

	default : System.out.print("Your Prize is a headphone");
	break;

	}

}

}


