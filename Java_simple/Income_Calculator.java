package Java_simple;
/*
Income Calulation

In a company named Micky software solution, many part-time employees are working for a pay of Rs. 100 per hour. 
Write a program to calculate the total amount an employee earns in a year by working part time. 
Consider employees should work all day in the year and year has 365 days.
Note : The hour should be a positive value less than or equal to 24, if fails display "Unable to calculate the earnings"

Sample Input 1:
Enter no of hours worked in a day:3
Sample Output 1:
Total income in a year:109500

Sample Input 2:
Enter no of hours worked in a day:0
Sample Output 2:
Total income in a year:0

Sample Input 3:
Enter no of hours worked in a day:-5
Sample Output 3:
Unable to calculate the earnings
*/
import java.util.Scanner;
public class Income_Calculator 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		int a;
		System.out.println("Enter no of hours worked in a day:");
		a=SC.nextInt();
		if(a<0 || a>24)
		{
			System.out.println("Unable to calculate the earnings");
		}
		else
		{
			int b=((a*100)*365);
			System.out.println("Total income in a year:"+b);
		}
		
	}

}
