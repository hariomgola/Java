package Java_simple;
/*
Lucky Number
William planned to choose a four digit lucky number for his car. His lucky numbers are 3,5 and 7. 
Help him find the number, whose sum is divisible by  3 or 5 or 7.
Provide a valid car number, Fails to provide a valid input then display that number is not a valid car number. 
Note : The input other than 4 digit positive number[includes negative and 0] is considered as invalid.
Refer the samples, to read and display the data.

Sample Input 1:
Enter the car no:1234
Sample Output 1:
Lucky Number


Sample Input 2:
Enter the car no:1214
Sample Output 2:
Sorry its not my lucky number

Sample Input 3:
Enter the car no:14
Sample Output 3:
14 is not a valid car number
*/
import java.util.Scanner;
public class Lucky_number 
{
	public static void main(String[] args) 
	{
		int num,rem,sum=0;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the car no:");
		num=SC.nextInt();
		if(num<1000 || num>9999)
		{
			System.out.println(num+" is not a valid car number");
		}
		else
		{
			while(num!=0)
			{
			    rem=num%10;    //takimg remainder
			    sum=sum+rem;   //Adding remainder
			    num=num/10;    //Decreasing number
			}
			if(sum%7==0 || sum%5==0 || sum%3==0 )
			{
				System.out.println("Lucky Number");
			}
			else
			{
				System.out.println("Sorry its not my lucky number");
			}
		}

	}

}
