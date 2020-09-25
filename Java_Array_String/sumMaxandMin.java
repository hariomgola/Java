package Java_Array_String;
/**
Sum of the maximum and the minimum element
Madhu gets n numbers in an array. Write a Java program to print the sum of the maximum and the minimum element in the array.
If the size of an array is 0 or less print "Invalid Array Size".

Sample Input 1:
Enter the size of an array:
5
Enter the elements:
45
23
48
90
89

Sample Output 1:
113

Sample Input 2:
Enter the size of an array:
0

Sample Output 2:
Invalid Array Size
*/
import java.util.*;
public class sumMaxandMin 
{
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int len = SC.nextInt();
		
		if(len>0)
		{
			int [] array = new int [len];
			System.out.println("Enter the elements:");
			for(int i=0;i<array.length;i++)
				array[i]=SC.nextInt();
			
			Arrays.sort(array);
			int sum = array[0]+array[len-1];
			System.out.println(sum);
		}
		else
			System.out.println("Invalid Array Size");
	}

}
