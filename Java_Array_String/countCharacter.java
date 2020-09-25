package Java_Array_String;
/**
Count the number of characters
"The kids need to clear a simple test to secure admission in the nursery class. 
They need to spell their name and they also need to tell the number of letters in their name. Some of the kids had very long names 
and the interview panel members found it time consuming to count the number of letters in the name.

One of the panel members has just started to learn programming and 
he decided to write a Java program to count the number of characters in the name.  Can you help her out in this task?

Note: The input, name can have only alphabets and space. If it holds any other character then it should display "Invalid input".

Sample Input 1: 
Enter your name:
Akshaya

Sample Output 1: 
Akshaya has 7 characters

Sample Input 2: 
Enter your name:
Anitha1

Sample Output 2: 
Invalid input
*/
import java.util.*;
public class countCharacter 
{
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter you name:");
		String name = SC.nextLine();
		
		if(name.matches("^[a-zA-Z ]*$"))
			System.out.println(name+" has "+(name.length())+" characters");
		else
			System.out.println("Invalid input");
	}

}
