package Java_simple;
/*
Bonus Points - Bike Race
There is an app for  bike race which provides bonus points for the  player.  In this app the player has to play the race and on 
completion, the total kilometers traveled by the player is calculated. Based on this distance traveled, the product of digits 
in the odd position and also product of digits in the even position is calculated.  Whichever is highest, that is the bonus 
points given to the user.   
If the product of odd and even position digits are same, then the player should receive double the product as bonus.

Example : If the distance traveled  is 5632 
Product of digits in odd position = 5 * 3 = 15
Product of digits in even  position = 6 * 2 = 12
As 15 > 12, the bonus points the player gets is 15.
Write a program  to do this operation.

Note : Input should be the distance traveled and the output is the bonus points.  
If the input is less than zero, the output should be “Invalid Input”.  

Sample Input 1 :
Enter the distance traveled
8694
Sample Output 1 :
Your bonus points is 72

Sample Input 2 :
Enter the distance traveled
263
Sample Output 2 :
Your bonus points is 12
*/
import java.util.Scanner;
public class Bike_Race 
{
	public static void main(String[] args) 
	{
		int even=1,odd=1,dis;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the distance traveled");
		dis=SC.nextInt();
		
		if(dis>0)
		{
			while(dis>0)
			{
				odd=odd*(dis%10);
				dis=dis/10;
				if(dis>0)
				{
					even=even*(dis%10);
					dis=dis/10;
				}
			}
			if(even==odd)
				System.out.println("Your bonus points is "+(2*even));
			if(even>odd)
				System.out.println("Your bonus points is "+even);
			if(odd>even)
				System.out.println("Your bonus points is "+odd);
		}
		else
		{
			if(dis==0)
				System.out.println("Your bonus points is 0");
			else
				System.out.println("Invalid Input");
		}

	}

}
