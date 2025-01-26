/*A 2D array is used to store the details of the rating of 3 movies given by 4 reviewers. Some sample 
data is shown below. 
 
        Reviewers 
        1 4 6 2 5 
Movies  2 7 9 4 8 
        3 6 9 3 7 
 
 
Write a java program to do the following. 
 
a) Declare an array called ratings to store the details of the rating of 3 movies given by 4 reviewers. 
b) Read the movie ratings from the keyboard and store the data in the array. 
c) Display the array in tabular format. 
d) For each movie, display the movie number and the average rating. 
e) Find and display the movie which received the highest average rating. */

import java.util.Scanner;

public class IpStudyPackQn1Part2 {

	public static void main(String[]args) {


	Scanner input = new Scanner(System.in);

	int ratings[][] = new int[3][4];
	int i,j;
	
	for(i=0;i<=2;i++){
		System.out.println("Review For Movie "+ (i+1));
		for(j=0;j<=3;j++){
		
		System.out.print("Enter The review by reviewer " + (j+1)+" : ");

		ratings[i][j]=input.nextInt();
		

		}
	System.out.println();	
	}


	System.out.print("Ratings \t");
	for(j=0;j<=3;j++){
		System.out.print("Reviewer "+ (j+1)+"  ");

	}

	System.out.println();
	for(i=0;i<=2;i++){
		System.out.print("Movie  "+ (i+1)+" \t ");

		for(j=0;j<=3;j++){
		
		System.out.print (ratings[i][j] +"  \t\t");

		}
	System.out.println();
	}


	

	int sum;
	double avg=0;
	double max=0;
	int hmovie=0;
	

	System.out.println();

	for(i=0;i<=2;i++){
		
		sum=0;
		System.out.print("Average Rating of Movie  "+ (i+1)+" : ");
		

		for(j=0;j<=3;j++){
			
			sum= sum + ratings[i][j];
	
		
		avg=sum/(j+1.0);
		}

			if(avg>max){
			max=avg;

			hmovie=i+1;

			}

	System.out.println(avg);

	System.out.println();

	


	}

System.out.println();
	System.out.println("The Movie "+ hmovie + " has the  highest rating with the rating of "+max);

}

}



	
	


