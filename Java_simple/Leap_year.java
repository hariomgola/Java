package Java_simple;
/*
Check for Leap Year
Given a year, check if the year is leap year or not. If yes, the output should be “Leap Year”.  
Else output should be “Not a Leap Year”.  The input should be a positive four digit number.  
Else,  the output should be “Invalid Year”.

Sample Input  1 :
Enter the Year
2016
Sample Output  1 :
Leap Year

Sample Input  2 :
Enter the Year
2001
Sample Output  2 :
Not a Leap Year
*/

import java.util.Scanner;
public class Leap_year 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=SC.nextInt();
		if(year<1000 || year>9999)
			System.out.println("Invalid year");
		else
		{
			if(year%4==0 || year%100==0)
			{
				if(year%4==0 || year%100!=0)
					System.out.println("Leap Year");
				else
				{
					if(year%400==0)
						System.out.println("Leap Year");
					else
						System.out.println("Not a Leap year");
				}
			}
			else
				System.out.println("Not a Leap Year");
		}
	}

}
