package Java_Object;
public class Movie 
{
	private String movieName;
	private String movieCategory;
	private int ticketCost;
	
	public String getMovieName()
	{
		return movieName;
	}
	public void setMovieName(String _movieName)
	{
		this.movieName=_movieName;
	}
	
	public String getMovieCategory()
	{
		return movieCategory;
	}
	public void setMovieCategory(String _movieCategory)
	{
		this.movieCategory=_movieCategory;
	}
	
	public int getTicketCost()
	{
		return ticketCost;
	}
	public void setTicketCost(int _ticketCost)
	{
		this.ticketCost=_ticketCost;
	}
	
	public int calculateTicketCost(String circle)
	{
		if(circle.equalsIgnoreCase("gold"))
		{
			if(movieCategory.equalsIgnoreCase("2D"))
			{
				ticketCost=300;
				return 0;
			}
			if(movieCategory.equalsIgnoreCase("3D"))
			{
				ticketCost=450;
				return -1;
			}
			
		}
		if(circle.equalsIgnoreCase("silver"))
		{
			if(movieCategory.equalsIgnoreCase("2D"))
			{
				ticketCost=250;
				return 0;
			}
			if(movieCategory.equalsIgnoreCase("3D"))
			{
				ticketCost=450;
				return 0;
			}
		}
		if(!movieCategory.equalsIgnoreCase("2D") && !movieCategory.equalsIgnoreCase("3D") && !circle.equalsIgnoreCase("gold") && !circle.equalsIgnoreCase("silver"))
			return -3;
		if(!movieCategory.equalsIgnoreCase("2D") && !movieCategory.equalsIgnoreCase("3D"))
			return -1;
		if(!circle.equalsIgnoreCase("gold") && !circle.equalsIgnoreCase("silver"))
			return -2;
		return 1;
	}

}
