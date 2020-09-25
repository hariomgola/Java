package Java_simple;
/*
Triangle Validation

Tom  is given an assignment by this teacher.  He provides him the length of the sides of a triangle and  
asks if they form the sides of the triangle.
If yes, the output should be , “Sides form a Triangle”.  If not, the output should be “Sides does not form a Triangle”.  
All the sides should be greater than zero.  If any side is less than or equal to zero the output should be “Invalid Input”. 

Note :  The rule for a triangle is sum of the length of any two sides [taken in any manner] of a triangle should be greater
than the length of the third side. 

Sample Input 1:
Enter the value for side1  
6
Enter the value for side2   
4
Enter the value for side3   
5
Sample Output 1
Sides form a Triangle

Sample Input 2:
Enter the value for side1   
6
Enter the value for side2   
12
Enter the value for side3   
5
Sample Output 2:
Sides does not form a Triangle
 */
import java.util.Scanner;
public class Traingle_Validation 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the value for side1");
		int s1=SC.nextInt();
		System.out.println("Enter the value for side2");
		int s2=SC.nextInt();
		System.out.println("Enter the value for side3");
		int s3=SC.nextInt();
		
		if(s1<1 || s2<1 || s3<1)
			System.out.println("Invalid Input");
		else
		{
			if((s1+s2)>s3 && (s2+s3)>s1 && (s3+s1)>s2)
				System.out.println("Sides form a Traingle");
			else
				System.out.println("Sides does not form a Traingle");
		}
	}

}
