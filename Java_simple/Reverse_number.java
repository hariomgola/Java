package Java_simple;
/*
Reverse The Number
Write a program to reverse a given number. Say for example, If the given number is 35(thrity five), 
it should be reversed as 53(fifty three)].  If the input given is zero display Output is:0. 
If the input is less than zero then display "Number should be positive"
Refer the sample input and output.

Sample Input 1 :
Enter The Number:
478
Sample Output  1:
Output is:874

Sample Input  2:
Enter The Number:
-470
Sample Output  2:
Number should be positive

Sample Input  3:
Enter The Number:
34
Sample Output  3:
Output is:43
 */
import java.util.Scanner;
public class Reverse_number 
{
	public static void main(String[] args) 
	{
		int rev=0;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=SC.nextInt();
		if(num<0)
		{
			System.out.println("Number should be positive");
		}
		else
		{
			while(num!=0)
			{
				rev=rev*10;
				rev=rev+num%10;
				num=num/10;
			}
			System.out.println("Output is:"+rev);
		}
	}
}
