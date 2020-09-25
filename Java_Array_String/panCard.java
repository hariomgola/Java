package Java_Array_String;
/**
 program for pan card validation PAN card validation
 */
import java.util.*;
public class panCard 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the PAN no:");
		String pan = SC.next();
		
		//function for pan card validation
		//first 5 letter in pan card is alphabet
		//4 letter are in numeric format
		//last letter are in alphabetic format
		boolean flag = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		
		if(flag)
			System.out.println("Valid PAN number");
		else
			System.out.println("Invalid PAN number");
		
	}
}
