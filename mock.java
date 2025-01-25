/*Write a java program to do the following: 
• The program requests users to enter a small integer below 20. The program adds all the 
numbers from 1 to 20, except the number that the user has selected and its multiples 
between 1 to 20. 
• The program will allow users to enter numbers until the user enters -99.  
• If the sum is greater than or equal to 150, the program should print two patterns of 
charactersas shown in the sample output given below. 
a
Enter A Number Between 1 to 20 :3
Sum is 147
Enter A Number Between 1 to 20 :5
Sum is 160
***
**
**
*
*
@
@
@@
@@
@@@
Enter A Number Between 1 to 20 :6
Sum is 174
***
***
**
**
*
*
@
@
@@
@@
@@@
@@@
 */



import java.util.Scanner;

public class mock {

public static void main(String[]args) {

Scanner input = new Scanner (System.in);

;
int loop = 1;
int sum ;
int num=0; 	


do{

	System.out.print("Enter A Number Between 1 to 20 :") ;
	num = input.nextInt();
	if (num==-99){

		break;
		

	}
	sum = 0;

	for(int i=1;i<=20;i++){

		if (i==num || i%num==0){

		continue;
		
	}
	sum = sum + i;
	


	
	}

	System.out.println("Sum is "+ sum);


	if(sum>=150){


		for (int col=1;col<=num;col++){

			for (int row=num;row>=col;row--){
			
			
			System.out.print("*");

			row-=1;
			}
		System.out.println();

		}		
		

		for (int col=1;col<=num;col++){

			for (int row=1;row<=col;row++){
			System.out.print("@");
			row+=1;


			}
		System.out.println();



		}





	
	}



	}while(num != -99);








}

}
	

	