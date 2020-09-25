package Java_Object;
public class BusTicket 
{
	private int ticketNo;
	private float ticketPrice;
	private float totalAmount;
	private Person person;
	
	public int getTicketNo()
	{
		return ticketNo;
	}
	public void setTicketNo(int _ticketNo)
	{
		this.ticketNo=_ticketNo;
	}
	
	public float getTicketPrice()
	{
		return ticketPrice;
	}
	public void setTicketPrice(float _ticketPrice)
	{
		this.ticketPrice=_ticketPrice;
	}
	
	public float getTotalAmount()
	{
		return totalAmount;
	}
	public void setTotalAmount(float _totalAmount)
	{
		this.totalAmount=_totalAmount;
	}
	
	public Person getPerson()
	{
		return person;
	}
	public void setPerson(Person _person)
	{
		this.person=_person;
	}
	
	public void calculateTotal()
	{
		int age=person.getAge();
		char gender=person.getGender();
		if(age<16 || age>=60)
		{
			if(age<16)
				this.totalAmount=ticketPrice-(ticketPrice/2);
			else
				this.totalAmount=ticketPrice-(ticketPrice/4);
		}
		else
		{
			if(gender=='f' || gender=='F')
				this.totalAmount=ticketPrice-(ticketPrice/10);
			else
				this.totalAmount=ticketPrice;
		}
	}
}
