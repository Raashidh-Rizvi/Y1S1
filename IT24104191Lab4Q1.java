import java.util.Scanner;

public class IT24104191Lab4Q1 {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

/*
 Write a Java program to input a number from the keyboard and display whether it is
 Positive or Negative. If user input 0, display number is Zero.
*/

	System.out.print("Enter A number : ");
	int num = input.nextInt();
	String in;

	if (num>0){
		in = ": Postive";
		}
	else if  (num==0) {
		in = " Zero";
		}
	
	else 
		{
		in = ": Negative";
		}

	System.out.print("The Number is" + in );


}

}

	