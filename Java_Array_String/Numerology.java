package Java_Array_String;
/**
Numerology

Write a program to find the numerological value for a given name.
Note: Store the numerological number and the corresponding character in a 2-D array(2*26). 
Always the given  name should be in capital case ,else the name is not valid. 
Check for the valid name,if the name is invalid print the message "Invalid name".
There should not be any space in the name provided.

For example:
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
1 2 3 4 5 8 3 5 1 1 2 3 4 5 7 8 1 2 3 4 6 6 6 5 1 7

Sample Input 1:
Enter your name:
SUDHA
Sample Output 1:
Your numerology no is:19

Sample Input 2:
Enter your name:
kiran
Sample Output 2:
Invalid name

Sample Input 3:
Enter your name:
ANI34
Sample Output 3:
Invalid name
*/
import java.util.*;
public class Numerology 
{
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		char array [][]= {
				{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},
				{'1','2','3','4','5','8','3','5','1','1','2','3','4','5','7','8','1','2','3','4','6','6','6','5','1','7'}
		};
		
		System.out.println("Enter you name:");
		String str = SC.next();
		
		if(str.matches("^[A-Z]*$"))
		{
			int count=0;
			char [] s=str.toCharArray();
			
			for(int i=0;i<s.length;i++)
			{
				for(int j=0;j<26;j++)
				{
					if(s[i]==array[0][j])
					{
						int temp=array[1][j];
						count += Character.getNumericValue(temp);
					}
				}
			}
			System.out.println("Your numerology no is:"+count);
		}
		else
			System.out.println("Invalid name");
	}

}
