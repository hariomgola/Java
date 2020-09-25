package Java_Array_String;
/**
 Program to replace the a character from the string
 */
import java.util.*;
public class FirstOccurence 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = SC.nextLine();
		
		System.out.println("Enter the character to be searched:");
		char a=SC.next().charAt(0);
		String str1 = Character.toString(a);
		
		System.out.println("Enter the character to replace:");
		char b=SC.next().charAt(0);
		String str2 = Character.toString(b);
		
		if(str.indexOf(str1)== -1)
			System.out.println("character not found");
		else
			System.out.println(str.replaceFirst(str1, str2));
	}

}
