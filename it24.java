import java.util.Scanner;

public class it24 {

public static void main (String[]args){


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