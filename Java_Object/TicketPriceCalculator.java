package Java_Object;
/**
Ticket Calculation
Create a class Ticket with the following private variables
int ticketid;
int price;
static int availableTickets;
Include getters and setters methods in the Ticket class.

AvailableTickets should hold only positive value. 
Zero and negative values are not allowed.(This logic should be checked inside the corresponding setter method)

Write the following method in the Ticket class:
public int calculateTicketCost(int nooftickets) —this method should check the ticket availability, 
If the tickets are available, reduce the nooftickets from availableTickets and calculate the total amount as nooftickets*price  
and return the total amount.  If the tickets are not available, this method should return -1.

Write a main method in the Main class to test the application.

Sample input and output
Enter no of bookings:
2
Enter the available tickets:
25
Enter the ticketid:
123
Enter the price:
100
Enter the no of tickets:
5

Available tickets: 25
Total amount:500
Available ticket after booking:20

Enter the ticketid:
124
Enter the price:
100
Enter the no of tickets:
2
Available tickets: 20
Total amount:200
Available ticket after booking:18
*/
import java.util.Scanner;
public class TicketPriceCalculator 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		Ticket ticket=new Ticket();
		System.out.println("Enter no of bookings:");
		int booking=SC.nextInt();
		System.out.println("Enter the available tickets:");
		int availableTicket=SC.nextInt();
		
		ticket.setAvailableTicket(availableTicket);
		
		while(booking>0)
		{
			System.out.println("Enter the ticketid:");
			int ticketId=SC.nextInt();
			System.out.println("Enter the price:");
			int price=SC.nextInt();
			System.out.println("Enter the no of tickets:");
			int nooftickets=SC.nextInt();
			
			ticket.setTicketId(ticketId);
			ticket.setPrice(price);
			
			System.out.println("Available tickets:"+ticket.getAvailableTicket());
			int Amount=ticket.calculateTicketCost(nooftickets);
			System.out.println("Total Amount:"+Amount);
			System.out.println("Available tickets after booking:"+ticket.getAvailableTicket());
			booking--;
		}
		
	}

}
