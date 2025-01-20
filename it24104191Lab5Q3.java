import java.util.Scanner;

public class it24104191Lab5Q3 {

private static final int rate = 48000;


public static void main (String[]args){

Scanner input = new Scanner(System.in);

/*
Ransiri Resort offers discount for full board reservations during the month of December
 as shown below. Discount is given only for the reservations done for more than 3 days.
 Room charges per day is Rs 48,000.00.

 No of Days : Reserved Discount Rate (%) respectively
 < 3 days-No discount
 3– 4 days -10 %
 5 or more- 20%
 Write a Java program to enter the start date (day) and end date (day) of the reservetion and find out the number of days reserved and the total amount to be paid. Use
 CONSTANTS to declare fixed values.
 After the start date and end dates are entered, validate the below conditions. If the
 conditions fail ,display error messages  and exit from the program.

 Validation 1– Start date and end date cannot be less than 1 or greater than 31
 Validation 2– Start date should be less than the end date*/


	System.out.print("Enter Start Date ( 1-31 ) : ");
	int startDay = input.nextInt();

	while (startDay <1 || startDay>31) {
	System.out.print("Error: days must be betwveen 1 And 31.");
 	return;

	}
	
	System.out.print("Enter End Date ( 1-31 ) : ");
	int endDay = input.nextInt();
	
	while (endDay<1 || endDay>31){
	System.out.print("Error: days must be between 1 And 31. ");

	return;

	
	
	}
	while (startDay > endDay){
	System.out.print("Error:  Start date should be less than the end date. ");
	
	return;
	}
	

	int daysRented = endDay - startDay;

	double amountToPay;

	if (daysRented<3){
	 amountToPay = 48000*daysRented;

	}


	 else if (daysRented<=4)
	{
	amountToPay = 48000*daysRented * 0.9;

	}

	else 	amountToPay = 48000*daysRented * 0.8;
	
	
	System.out.print("Total Amount to be Paid : " + amountToPay);

	


}

}



