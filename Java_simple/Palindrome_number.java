package Java_simple;
/*
Number Palindrome
George and  Tintin plays  by  telling numbers.  George says a number to Tintin.  
Tintin should first reverse the number and check if it is same as the original.  
If yes,  Tintin should say “Palindrome”.  If not, he should say “Not a Palindrome”.  
If the number is negative, print “Invalid Input”.  Help Tintin by writing a program.

Sample Input 1 :
21212
Sample Output 1 :
Palindrome

Sample Input 2 :
6186
Sample Output 2 :
Not a Palindrome
*/
import java.util.Scanner;
public class Palindrome_number 
{
	public static void main(String[] args) 
	{
		int num,num_c=0,res=0;
		Scanner SC=new Scanner(System.in);
		num=SC.nextInt();
		num_c=num;
		if(num<0)
			System.out.println("Invalid Input");
		else
		{
			while(num>0)
			{
				res=res*10;
			    res=(num%10)+res;
			    num=num/10;
			}
			
			if(res==num_c)
				System.out.println("Palindrome");
			else
				System.out.println("Not a Palindrome");
		}
		
	}
}
