package Java_Array_String;
/**
Duplicate an element

Madhu wants to write a Java program to duplicate an element from a set of elements.
Get the array size and elements .Get the position of the element to be replicated at the end of the array.
If the position given is greater than the size of an array 
display the message as "Position is greater than the size of an array".
If the size of the array is zero or lesser then display the message "Invalid array size".
Please help her out for solving the above scenario .


Sample Input 1:
Enter the size of an array:
5
Enter the array elements:
34
56
78
56
90

Enter the position of the element to be replicated:
2

Sample Output 1 :
34
56
78
56
90
78

Sample Input 2:
Enter the size of an array:
0
Sample Output 2:
Invalid array size

Sample Input 3:
Enter the size of an array:
3
Enter the array elements:
12
6
35
Enter the position of the element to be replicated:
9
Sample Output 3:
Position is greater than the size of an array
*/
import java.util.*;
public class DublicateElement 
{
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int len = SC.nextInt();
		
		if(len>0)
		{
			int [] array = new int [len];
			System.out.println("Enter the array elements:");
			for(int i=0;i<array.length;i++)
				array[i]=SC.nextInt();
			
			System.out.println("Enter the position of the elements to be replicated:");
			int len1 = SC.nextInt();
			if(len>len1)
			{
				int [] array1 = Arrays.copyOf(array,(len+1));
				array1[len]=array[len1];
				
				for(int i=0;i<array1.length;i++)
					System.out.println(array1[i]);
			}
			else
				System.out.println("Position is greater than the size of an array");
		}
		else
			System.out.println("Invalid array size.");
	}

}
