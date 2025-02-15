/*Write a Java program to insert Student IDs of 8 students and store in an array called
 studentsArray. If a negative number or zero is entered, display an error message.
 Then ask user to enter a Student ID from the keyboard and find whether the Student ID
 is available in the array:
 • Display message ‘Student is Available’ if the student is found.
 • Display message ‘Student is Not Available’ if the student is not found.*/


import java.util.Scanner;

public class IT24104191Lab8Q4
{	

	public static void main(String[]args) 
		{

		Scanner input= new Scanner (System.in);
		int newarray []= new int[8];

		int i;
		for(i=0;i<8;i++){

		System.out.println("Enter Student ID for student "  + (i+1) + ":");
		newarray[i]=input.nextInt();


		while (newarray[i]<=0) {
		System.out.println("Error:Please Enter ONLY Postive Number");

	 System.out.println("Enter Student ID for student " +(i + 1) +":");
		newarray[i]=input.nextInt();

		}
	}

		System.out.print("Enter A Student ID To Search : ");
		int id=input.nextInt();


		boolean found = false;

		for(int num=0; num=8; num++){

		if(myarray[i] == id){
		found = true;
		break;
}

}
		System.out.println();
		if(found){
		System.out.println("Student is Available");
}

		else

		System.out.println("Student is Not Available");



}
}

}