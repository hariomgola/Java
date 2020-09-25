package Java_simple;
/*
List of prime numbers
To speed up his composition of generating unpredictable rhythms, 
A.R.Rahman wants the list of prime numbers available in a range of numbers.Can you help him out?
Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).

Note
Input 1 should be lesser than Input 2. Both the inputs should be positive. 
Range must always be greater than zero.
If any of the condition mentioned above fails, then display "Provide valid input"
Use a minimum of one for loop and one while loop

Sample Input 1:
2
15
Sample Output 1:
2 3 5 7 11 13

Sample Input 2:
8
5
Sample Output 2:
Provide valid input
 */
import java.util.Scanner;
public class Prime_number 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		int num1=SC.nextInt();
		int num2=SC.nextInt();
		
		if(num1>num2 ||num1<0 ||num2<0)
			System.out.println("Provide valid input");
		else
		{
			if(num1==1)
				num1=num1+1;
			while(num1<=num2)
			{
				boolean flag=false;
				for(int i=2;i<=num1/2;i++)
				{
					if(num1%i==0)
					{
						flag=true;
						break;
					}
				}
				if(!flag)
					System.out.print(num1+" ");
				num1++;
			}
			
		}
		
	}

}
