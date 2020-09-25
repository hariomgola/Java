package Java_Array_String;
/**
Retail Shop
A Retail shop wants to maintain the product availability in their shop.
Create a private attributes shopName, shopAddress, products(string array). 
Include Constructor to initialize value for this attributes and appropriate getter and setter method if needed. 

Write the following method in the class:
public boolean checkProductAvailability(String productname) - this method should take the product name as argument 
and check whether that product is available in the shop or not (Product name to be searched is case insensitive). 
If the product is available, function should return true, else return false.

Write the main method to test the application.
Note: Always number of products should be greater than zero. 

Sample Input 1:
Enter the shopname:
TMD

Enter the address:
Chennai

Enter number of products:
4
Laptop
Camera
Pendrive
Mobile

Enter the product to be searched:
Camera

Sample Output 1:
Product is available at TMD, Chennai.


Sample Input 2:
Enter the shopname:
TMD
Enter the address:
Chennai
Enter no of products:
4
Laptop
Camera
Pendrive
Mobile
Enter the product to be searched:
Telephone

Sample Output 2:
Product is not available at TMD, Chennai.
*/
import java.util.*;
public class RetailShop 
{
	private String shopName;
	private String shopAddress;
	private String [] products;
	
	public RetailShop(String _shopName,String _shopAddress,String [] _products)
	{
		this.shopName=_shopName;
		this.shopAddress=_shopAddress;
		this.products=_products;
	}
	
	public String getShopName()
	{
		return shopName;
	}
	public String getShopAddress()
	{
		return shopAddress;
	}
	public String [] getProducts()
	{
		return products;
	}
	
	public boolean checkProductAvailability(String productname)
	{
		for(String p:products)
			if(productname.equalsIgnoreCase(p))
				return true;
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the shopname:");
		String _shopname = SC.next();
		System.out.println("Enter the address:");
		String _shopAddress= SC.next();
		System.out.println("Enter number of products:");
		int length = SC.nextInt();
		
		if(length>0)
		{
			String [] prod = new String[length];
			for(int i=0;i<prod.length;i++)
				prod[i]=SC.next();
			
			RetailShop shop = new RetailShop(_shopname,_shopAddress,prod);
			System.out.println("Enter the product to be searched:");
			String sp = SC.next();
			
			boolean flag =shop.checkProductAvailability(sp);
			
			if(flag)
				System.out.println("Product is available at "+(shop.getShopName())+", "+shop.getShopAddress());
			else
				System.out.println("Product is not available at "+(shop.getShopName())+", "+shop.getShopAddress());
			
		}
		
	}

}
