/*Question (02) 
Write a java program to find out the amount you earn after investing money on a trust fund for a given period. 
a) Write a method called calcAnnualInterest() to calculate the interest amount the customer gets at 
the end of the year when the annual interest rate and the amount is passed as parameters. If the amount is 
above  
Rs. 1,000,000.00, an additional 0.5% is added to the interest rate. 
float calcAnnualInterest(float interestRate, float amount); 
interest = amount * interest rate /100 
 
b) Write a method called findTotalAmount() to return the total amount saved at the end of the year. 
float findTotalAmount(float interestRate, float amount); 
Hint: Total amount = interest + amount 
Use calcAnnualInterest function to find out the interest earned. 
 
c) Write a method called testTotalAmount() which contains two assert statements to check the 
function implemented in section b) above. 
void testTotalAmount(); 
d) In your main method, 
i) Call testTotalAmount() method 
ii) Input the amount to be invested and the annual interest rate from the keyboard. 
iii) Customer is planning to invest the amount compounded yearly at the given interest rate for five years. 
i.e. (Amount + interest) is invested for the next year. 
Display the total amount earned at the end of each year using the above methods. 
 
Sample output given below  
Enter Initial Amount to be invested : 10000.00 
Enter Annual interest Rate(in percentage) : 10 
Amount after year 1 : 11000.00 
Amount after year 2 : 12100.00  
Amount after year 3 : 13310.00 
*/


import java.util.Scanner;

public class IpStudyPackQn2 {

public static float calAnnualInterest(float interestRate,float amount){
	if (amount > 1000000){
		interestRate += 0.5f;
	}
	
	return  amount * interestRate / 100;
}



public static float findTotalAmount(float calAnnualInterest,float amount){
	return calAnnualInterest +  amount;
}

public static void testTotalAmount() {

	float testAmount1 = 10000;
	float testInterestRate1 = 10;
	float expectedTotal1 = 11000;

	float annualInterest1 = calAnnualInterest(testInterestRate1, testAmount1);
	assert Math.abs(findTotalAmount(annualInterest1,testAmount1)-expectedTotal1 ) < 0.01 :"Test Case 1 Failed" ;



	float testAmount2 = 2000000;
	float testInterestRate2 = 5;
	float expectedTotal2 = 2110000;
	
	float annualInterest2 = calAnnualInterest(testInterestRate2, testAmount2);
	assert Math.abs(findTotalAmount(annualInterest2,testAmount2)-expectedTotal2) < 0.01 :"Test Case 2 Failed" ;
	
		
	System.out.println("All test cases passed! ");



}





	public static void main (String[]args) {
		testTotalAmount();
		Scanner input = new Scanner (System.in);
		

		System.out.print("Enter Initial Amount to be invested : ");
		float amount = input.nextFloat();

		System.out.print("Enter Annual interest Rate ( in %) : ");
		float interestRate = input.nextFloat();
	

		
	


		
		for(int year=1;year<=5;year++){
			float annualInterest = calAnnualInterest( interestRate,amount);

    			amount = findTotalAmount( annualInterest, amount);

    			System.out.println("Amount after year "+ year +" : "+amount);

		}
		

	}



}