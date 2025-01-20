import java.util.Scanner;

public class it24lec7 {

public static void main (String[]args){

/* 
Write a Java program to do the following:
 Declare an integer array called counts with 10 elements
 Initialize all elements to -1
 Read and store 10 number seach of which is between 10 to 100
 Find the maximum number from the stored numbers.*/


Scanner input = new Scanner(System.in);

int counts[] =new int [10];




for ( int i=0 ;i<10;i++){

	counts[i] = -1;


	System.out.print("Enter Number " + (i + 1) + " between 10 - 100 :");
	counts[i] = input.nextInt();
	

	// Range Validation
	while (counts[i] < 10 || counts[i] > 100 ) {
		
			System.out.print(" Invalid Input. Enter Number " + (i + 1) + " between 10 - 100 :");
			counts[i] = input.nextInt();
			}
		
}




//to find the max


	int max = 0;


	for(int i=0; i<10; i++){

		if (counts[i] >= max){
		 max=counts[i] ;
		}
	}

	System.out.print("Maximum number is "+ max);
	


}
}