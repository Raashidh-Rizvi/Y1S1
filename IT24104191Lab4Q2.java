import java.util.Scanner;

public class IT24104191Lab4Q2 {

	public static void main (String[]args) {

/* Final mark of a module is calculated by considering two components, exam marks and
 lab submission marks. The percentages taken from each component as the final mark.

 Write a Java program to:

 • Input the exam marks (given out of 100) and the lab submission marks (given out
 of 100) from the keyboard

 • Validate the entered marks (should be greater than or equal to 0 and less than or
 equal to 100)

 • Input the percentage taken from the exam mark and the lab submission mark from
 the keyboard

 • Validate the values (entered percentages should add to 100)

 • Calculate the final exam marks*/


		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the exam marks (out of 100): ");
		double mark = input.nextDouble();

		if(100 < mark || mark < 0 ){
		System.out.println("Invalid input for Exam marks.Terminating Program");	
		return;
		}



	

		System.out.print("Please enter the lab submission (out of 100): ");
		double lab = input.nextDouble();

		if(100 < mark || mark < 0 ){
		System.out.println("Invalid input for Exam marks.Terminating Program");	
		return;
		}


		

		System.out.print("Please Enter The percentage given for the Exam : ");
		double examper = input.nextDouble();

		System.out.print("Please Enter The percentage given for the lab submission : ");
		double labper = input.nextDouble();
	

		double per = examper + labper;
	
		if(per != 100){
		System.out.print("The percentage must add up to 100.Termianting Program.");
		return;
		}

			
		double finalMark = mark*examper/100 + lab*labper/100 ;

		System.out.println();
		System.out.print("Final Exam mark is : " + finalMark );

			

		
	

	}

}