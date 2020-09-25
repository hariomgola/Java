package Java_simple;
/*
Highest Placement

ABC college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year.
The departments that have participated in the recruitment drive are CSE,ECE, MECH. 
Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

Note : If any input is negative, the output should be "Input is Invalid".  
If all department has equal number of placements, the output should be "None of the department has got the highest placement".

Sample Input 1:
Enter the no of students placed in CSE:90
Enter the no of students placed in ECE:45
Enter the no of students placed in MECH:70
Sample Output 1:
Highest placement
CSE

Sample Input 2:
Enter the no of students placed in CSE:55
Enter the no of students placed in ECE:85
Enter the no of students placed in MECH:85
Sample Output 2:
Highest placement
ECE
MECH

Sample Input 3:
Enter the no of students placed in CSE:0
Enter the no of students placed in ECE:0
Enter the no of students placed in MECH:0
Sample Output 3:
None of the department has got the highest placement

Sample Input 4:
Enter the no of students placed in CSE:10
Enter the no of students placed in ECE:-50
Enter the no of students placed in MECH:40
Sample Output 3:
Input is Invalid 
*/
import java.util.Scanner;
public class Highest_Placement 
{
	public static void main(String[] args) 
	{
		Scanner SC= new Scanner(System.in);
		int a,b,c;
		
		//Input
		System.out.println("Enter the no of students placed in CSE:");
		a=SC.nextInt();
		System.out.println("Enter the no of students placed in ECE");
		b=SC.nextInt();
		System.out.println("Enter the no of students placed in MECH");
		c=SC.nextInt();
		
		//Calculation
		if(a>b &&a>0 && b>0 && c>0)
		{
			if(a>c)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
			}
			else if(a==c)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
				System.out.println("MECH");
			}
			else
			{
				System.out.println("Highest placement");
				System.out.println("MECH");
			}
		}
		
		else if(a<b && a>0 && b>0 && c>0)
		{
			if(b>c)
			{
				System.out.println("Highest placement");
				System.out.println("ECE");
			}
			else if(b==c)
			{
				System.out.println("Highest placement");
				System.out.println("ECE");
				System.out.println("MECH");
			}
			else
			{
				System.out.println("Highest placement");
				System.out.println("MECH");
			}
			
		}
		
		else if (a==b && a==c && c==b && a>0 &&b>0 && c>0 ||a==0 && b==0 && c==0 )
		{
			System.out.println("None of the department has got the highest placement");
		}
		else if (a==0 && b==0 &&c!=0)
		{
			System.out.println("Highest placement");
			System.out.println("MECH");
		}
		else if (a==0 && b!=0 &&c==0)
		{
			System.out.println("Highest placement");
			System.out.println("ECE");
		}
		else if (a!=0 && b==0 &&c==0)
		{
			System.out.println("Highest placement");
			System.out.println("CSE");
		}
		else
		{
			System.out.println("Input is Invalid");
		}
	}

}
