/*
Question (03) 

Smart meter reading is an electronic device that records consumption of electric energy in intervals  of an hour 
or less and communicates that information at least daily back to the utility system for   monitoring and billing. 
Write a java program to store the daily electricity usage of a month (assume that one month has 28 days and 
exactly 4 weeks) and generate a summary report. 
a) Use a two-dimensional array (2D Array) to store the electricity usages. One row in the array should store the 
usage of a week. 
Following are the electricity usage of a house in Victoria in the month of November. Store 
these data in the array. 
1.2,  2.1,  0.8,  0.0,  1.0,  1.3,  4.0,  1.5,  3.2,  1.0,  1.3,  4.0,  1.5,  3.2,  2.3, 
0.4,  1.2,  2.1,  0.8,  0.0,  2.6,  2.1,  1.7,  7.0,  1.2,  2.1,  0.8,  0.0 
 
b) Generate the summary report as below based on the values stored in the array. 
 
Day of the Month with maximum usage: 
Maximum Usage in units: 
Day of the Month with minimum usage: 
Minimum Usage in units: 
Average usage for the Month: 
Total usage for the Month: 


*/


import java.util.Scanner;

public class IpStudyPackQn3 {
public static void main (String[]args) {


Scanner input = new Scanner(System.in);

double usage[][] =	{ {1.2, 2.1, 0.8, 0.0, 1.0 ,1.3, 4.0 },
			  {1.5, 3.2, 1.0, 1.3, 4.0, 1.5, 3.2 },
			  {2.3, 0.4, 1.2, 2.1, 0.8, 0.0, 2.6 },
			  {2.1, 1.7, 7.0, 1.2, 2.1, 0.8, 0.0 } };


double maxUsage=0;
double minUsage=0;
double avg=0;
double sum=0;
int maxDay=0;
int minDay=0;
int day=0;

	for(int w=0; w<4; w++){
		for(int d=0; d<7; d++){
			day++;

			if ( usage[w][d] >= maxUsage) {

				maxUsage = usage[w][d];
				maxDay=	day;	
			}
			

			if ( usage[w][d] <=  minUsage  ) {

				minUsage = usage[w][d];
				minDay=	day ;
						
			}
			 
			sum+=usage[w][d];
			
			avg=sum/28;
			

 

		}


	}


	System.out.println("Day of the Month with maximum usage: " + maxDay);

	System.out.println("Maximum Usage in units : " + maxUsage);

	System.out.println("Day of the Month with minimum usage: " + minDay);

	System.out.println("Minimum Usage in units : " + minUsage);
			
	System.out.println("Average usage for the Month: " + avg);

	System.out.println("Total usage for the Month: " + sum);

}

}



 