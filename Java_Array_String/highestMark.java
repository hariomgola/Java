package Java_Array_String;
/**
Program to find the highest mark in 6 subject.
 */
import java.util.Scanner;
import java.util.Arrays;
public class highestMark 
{
	public static int highestM()
	{
		Scanner SC= new Scanner(System.in);
		int [] marks = new int[6];
		System.out.println("Enter the marks:");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=SC.nextInt();
			if(marks[i]<0 || marks[i]>100)
				return -1;
		}
		Arrays.sort(marks); //Inbuilt function
		return marks[5];
	}
	public static void main(String[] args) 
	{
		int mark=highestM();
		if(mark>=0)
			System.out.println("Highest mark is "+mark);
		else
			System.out.println("Invalid Mark");
	}

}
