package Java_simple;
/*
Repetition of a Number
Pinky’s mom provides Pinky  with a number  and a key digit.  
She wants Pinky to find out how many times that key digit appears in that number.  
Help Pinky to do that by writing a program.

Sample Input 1:
Enter the number  16466
Enter the key digit   6
Sample Output 1:
6 appears 3 times in 16466

Sample Input 2:
Enter the number  8458
Enter the key digit   6
Sample Output 2:
6 appears 0 times in 8458
*/
import java.util.Scanner;
public class Repitition_number 
{
	public static void main(String[] args) 
	{
		int count=0,num_d=0;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=SC.nextInt();
		int num_c=num;
		System.out.println("Enter the key digit ");
		int rep=SC.nextInt();
		
		if(num<1)
			System.out.println("Invalid Input");
		else
		{
			while(num>0)
			{
				num_d=num%10;
				if(num_d==rep)
					count++;
				num=num/10;
			}
			System.out.println(rep+" appears "+count+" times in "+num_c );
		}
		
	}

}
