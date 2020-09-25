package Java_Array_String;
/**
InitCap

Write a program to convert the first character of each word in a sentence to uppercase.

Condition - If the first character of each word in the given sentence is already in upper case, 
            then print "First character of each word is already in uppercase".

Sample Input 1: 
Enter the String:
Work hard to get what you like

Sample Output 1:
Work Hard To Get What You Like

Sample Input 2:
Enter the String:
Work Hard To Get What You Like
Sample Output 2:
First character of each word is already in uppercase
 */
import java.util.*;
public class initCap 
{
	public static int sCheck(String str)
	{
		String [] s = str.split(" ");  //work hard to
		int count =0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].charAt(0)>='a' && s[i].charAt(0)<='z')
				count++;
		}
		return count;
	}
	public static String [] sUpper(String str)
	{
		String [] s=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			String temp = s[i].substring(0,1).toUpperCase()+s[i].substring(1);
			s[i]=temp;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = SC.nextLine();
		
		if(sCheck(str)>0)
		{
			String [] _string=sUpper(str);
			for(int i=0;i<_string.length;i++)
				System.out.print(_string[i]+" ");
		}
		else
			System.out.println("First Character of each word is already in uppercase");
		
	}

}
