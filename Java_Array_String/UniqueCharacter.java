package Java_Array_String;
/**
 Program to print unique character in the given sentence
 condition 1- sentence only contain alphabets if another character is present print "Invalid Sentence"
 condition 2- if no unique character is found print "No Unique character"
 Condition 3- if Unique character found print it in same format with heading "Unique character"
 */
import java.util.*;
public class UniqueCharacter 
{
	//for checking only string have characters 
	public static boolean onlyString(String str)
	{
		if(str.matches("^[a-zA-Z_ ]*$"))
			return true;
		return false;
	}
	//for return char array of Unique element
	public static char [] Unique(String str)
	{
		char [] arr = str.toCharArray();
		char [] array = new char[arr.length];
		int arraycount=0;
		for(int i=0;i<arr.length;i++)
		{
			int count = 0;
			for(int j=0;j<arr.length;j++)
				if(arr[i]==arr[j])
					count++;
			if(count==1)
				array[arraycount++]=arr[i];
		}
		
		char [] returnarray = Arrays.copyOf(array, arraycount);
		return returnarray;
	}
	//Checking the return array have white space(optional)
	public static int alength(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			if(str.indexOf(a)!=str.lastIndexOf(a))
				count++;
		}
		if(count == str.length())
			return 0;
		else
			return 1;
	}
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String str = SC.nextLine();
		if(!onlyString(str))
			System.out.println("Invalid sentence");
		else
		{
			char [] array = Unique(str);
			int length=alength(str);
			if(length>0)
			{
				System.out.println("Unique characters:");
				for(char c:array)
					System.out.println(c);
			}
			else
				System.out.println("No Unique characters");
				
		}
	}
}
