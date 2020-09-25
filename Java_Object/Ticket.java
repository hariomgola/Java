package Java_Object;
public class Ticket 
{
	private int ticketId;
	private int price;
	private static int availableTicket;
	
	//Creating getter and setter
	public int getTicketid()
	{
		return ticketId;
	}
	public void setTicketId(int _ticketId)
	{
		this.ticketId=_ticketId;
	}
	
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int _price)
	{
		this.price=_price;
	}

	public int getAvailableTicket()
	{
		return availableTicket;
	}
	public void setAvailableTicket(int _availableTicket)
	{
		this.availableTicket=_availableTicket;
	}
	
	public int calculateTicketCost(int nooftickets)
	{
		if(availableTicket>nooftickets)
		{
			int cost=(nooftickets*price);
			availableTicket=availableTicket-nooftickets;
			return cost;
		}
		else
			return -1;
	}
}
