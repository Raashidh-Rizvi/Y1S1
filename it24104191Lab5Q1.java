import java.util.Scanner;

public class it24104191Lab5Q1 {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

String place[] =  {"first", "second", "third"};
int num[] = new int [3];

	for(int i=0; i<=2; i++ ){
	System.out.print("Enter The " + place[i] + " interger :" );
	num[i] = input.nextInt();
   
	

	}

	System.out.println();

	System.out.print("User Entered numbers are : " );

	for(int i=0; i<=2; i++ ){
	System.out.print( num[i] + " " );
	}

	System.out.println();




	int max = num[0];
	int min = num[0];
	
	System.out.print("The Largest number is : ");

	for(int i=0; i<=2; i++ ){
	
	
	if (num[i]>max){
	max=num[i];

	}
	}	
	System.out.print(max);
	

	System.out.println();





	System.out.print ("The Smallest number is : ");

	
	for(int i=0; i<=2; i++ ){
	
	
	if (num[i]<min){
	min=num[i];

	}
	
	}
	System.out.print(min);

	

	





}

}