package Java_Array_String;
/**
Sort the first and second half of an array
Ajit likes to play mathematical tricky games .She gets n numbers for an array. 
Help Ajit to write a Java program to sort the first half of the array in ascending order and 
the second half of the array in descending order. 

Condition - If the size of the array is 0 or lesser then display the message as "Array size should be greater than 0".

Sample Input 1:
Enter the size of an array:
5
Enter the elements:
89
23
56
12
99
Sample Output 1:
23
56
89
99
12

Sample Input 2:
Enter the size of an array:
0
Sample Output 2:
Array size should be greater than 0
*/
import java.util.*;
public class sortFirstandSecond 
{
	public static int halflength(int length)
	{
		if(length%2==0)
			return length/2;
		else
			return (length+1)/2;
	}
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int length = SC.nextInt();
		
		if(length>0)
		{
			int [] array = new int[length];
			System.out.println("Enter the elements");
			for(int i=0;i<array.length;i++)
				array[i]=SC.nextInt();
			
			int half=halflength(length);
			
			//declaring first half of array and sorting in asc order
			int []a=Arrays.copyOf(array, half);
			Arrays.sort(a);
			
			//declaring second half of array and sorting in desc order
			int [] b =Arrays.copyOfRange(array, half, length);
			Arrays.sort(b);
			
			int [] temp = new int[b.length];
			int nlength = (length-half)-1;
			//for loop for filling value in temp in desc order
			for(int i=nlength;i>=0;i--)
				temp[i]=b[nlength-i];
			
			for(int i:a)
				System.out.println(i);
			for(int i:temp)
				System.out.println(i);
			
			
		}
		else
			System.out.println("Array size should be greater than 0");
			
	}

}
