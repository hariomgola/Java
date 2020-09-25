package Java_simple;
/*
Movie Ticket Calculation

In a multiplex theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets
when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card 
is submitted. Develop a program to find the total cost as per the scheme. The cost of the king class ticket is Rs.75 
and queen class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.

Hint: k-king and q-queen and You have to book minimum of 5 tickets and maximum of 40 at a time. 
If fails display "Minimum of 5 and Maximum of 40 Tickets".  
If circle is given a value other than 'k' or 'q' the output should be "Invalid Input".

The ticket cost should be printed exactly to two decimal places.

Sample Input 1:
Enter the no of ticket:35
Do you want refreshment:y
Do you have coupon code:y
Enter the circle:k

Sample Output 1:
Ticket cost:4065.25

Sample Input 2:
Enter the no of ticket:1
Sample Output 2:
Minimum of 5 and Maximum of 40 Tickets
*/
import java.util.Scanner;
public class Movie_Ticket_Calculation 
{
	public static void main(String[] args) 
	{
		double total_cost=0,r_cost=0,Final_price=0;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the no of tickets");
		int ticket=SC.nextInt();
		if(ticket<5 || ticket>40)
		{
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		}
		else
		{
			System.out.println("Do you want refreshment:");
			char r_f=SC.next().charAt(0);
			System.out.println("Do you have coupon code:");
			char coupon=SC.next().charAt(0);
			System.out.println("Enter the circle");
			char circle=SC.next().charAt(0);
			
			if(circle!='k' && circle!='q')
			{
				System.out.println("Invalid Input");
			}
			else
			{
				if(circle=='k')
				{
					total_cost=ticket*75;
				}
				if(circle=='q')
				{
					total_cost=ticket*150;
				}
				if(r_f=='y')
				{
					r_cost=ticket*50;
				}
				//Discount 
				if(ticket>20)
				{
					total_cost=total_cost-(total_cost*0.1);
				}
				if(coupon=='y')
				{
					total_cost=total_cost-(total_cost*0.02);
				}
				//Discount finish
				Final_price=total_cost+r_cost;
				
				//Total cost printing
				System.out.println("Ticket cost:"+String.format("%.2f",Final_price));
				
			}
			
		}
		

	}

}
