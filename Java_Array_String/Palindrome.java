package Java_Array_String;
/**
Palindrome
Astrologist believes that having a palindromic name is very auspicious . 
As we all know, a palindrome is a word that can be read the same way in either direction.

condition1 - There should not be a space or any special character in the word entered. 
condition2 - If yes, display "Invalid Input". Write a Java program to determine whether a given word is a palindrome or not.

Sample Input 1:
Enter the word : 
Malayalam
Sample Output 1: 
Malayalam is a Palindrome

Sample Input 2:
Enter the word : 
Apple
Sample Output 2: 
Apple is not a Palindrome

Sample Input 3:
Enter the word :
no on
Sample Output 3: 
Invalid Input

Sample Input 4:
Enter the word :
@nnn
Sample Output 4: 
Invalid Input
*/
import java.util.*;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the word:");
		String str = SC.nextLine();
		
		if(str.matches("^[a-zA-Z]*$"))
		{
			StringBuffer sb = new StringBuffer(str);
			sb.reverse();
			String r =sb.toString();
			
			if(r.equalsIgnoreCase(str))
				System.out.println(str+" is a Palindrome");
			else
				System.out.println(str+" is not a Palindrome");
		}
		else
			System.out.println("Invalid Input");
	}

}
