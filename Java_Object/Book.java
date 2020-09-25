package Java_Object;
public class Book 
{
	private String bookName;
	private int bookPrice;
	private String authorName;
	
	//creating getter and setter
	public String getBookName()
	{
		return bookName;
	}
	public void setBookName(String _bookName)
	{
		this.bookName=_bookName;
	}
	
	public int getBookPrice()
	{
		return bookPrice;
	}
	public void setBookPrice(int _bookPrice)
	{
		this.bookPrice=_bookPrice;
	}
	
	public String getAuthorName()
	{
		return authorName;
	}
	public void setAuthorName(String _authorName)
	{
		this.authorName=_authorName;
	}
}
