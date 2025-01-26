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