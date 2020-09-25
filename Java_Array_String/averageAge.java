package Java_Array_String;
/**
Find Average Age
One of the least Insurance agencies recruited employees for their collection department. 
Now the HR needs a report as the average age of all the employees working in that department. 
Write a code to calculate the average age.

Implement a method "calculateAverage(int[] age)" to calculate the average age and return the result to the caller function. 

Note : 
Age limit should be minimum of 28 years and maximum of 40 years. 
Minimum of 2 employees is mandatory to calculate average age, if fails, the output should be "Please enter a valid employee count"
If any of the age is invalid, terminate the process and display "Invalid age encountered!"
Refer the sample given for read and display the output.

Sample Input 1:
Enter total no.of employees:
3
Enter the age for 3 employees:
30
31
32

Sample Output 1:
The average age is 31.00

Sample Input 2:
Enter total no.of employees:
2
Enter the age for 2 employees:
29
36

Sample Output 2:
The average age is 32.50

Sample Input 3:
Enter total no.of employees:
1
Sample Output 3:
Please enter a valid employee count
*/
import java.util.*;
public class averageAge 
{
	public static double calculate(int [] age)
	{
		double count=0;
		for(int i=0;i<age.length;i++)
			count += age[i];
		count /= age.length;
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter total no.of employees:");
		int len = SC.nextInt();
		
		if(len>1)
		{
			int [] array = new int[len];
			System.out.println("Enter the age for "+len+" employees:");
			boolean flag=true;
			
			for(int i=0;i<array.length;i++)
			{
				array[i]=SC.nextInt();
				if(array[i]<28 || array[i]>40 || array[i]<=0)
				{
					System.out.println("Invalid age encounted");
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println("The average age is "+String.format("%.2f", calculate(array)));
		}
		else
			System.out.println("Please enter a valid employee count");
	}

}
