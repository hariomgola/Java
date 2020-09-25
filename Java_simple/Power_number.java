package Java_simple;
/*
Power of a Number
Ram is in the process of learning powers of a number.  He is given a number and a digit.  
He has to find the power of that number to that digit.
Example if the number is 10 and the digit is  5 the output should be 10*5 = 100000. 
If either of the input is negative, the output should be “Invalid Input”.
Help him do this by writing a program in java.  Create a class "Power.java" and 
write the main method in it. Don't use in-built method to find the power.

Sample Input  1 :
Enter the number
5
Enter the digit
3
Sample Output  1 :
125

Sample Input  2 :
Enter the number
18
Enter the digit
4
Sample Output  2 :
104976
*/
import java.util.Scanner;
public class Power_number 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=SC.nextInt();
		System.out.println("Enter the digit");
		int n2=SC.nextInt();
		int temp=1;
		if(n1<0 || n2<0)
			System.out.println("Invalid Input");
		else
		{
			
			while(n2!=0)
			{
				temp*=n1;    //temp=temp*n1;
				--n2;
			}
			System.out.println(temp);
		}
		
	}

}
