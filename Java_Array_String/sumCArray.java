package Java_Array_String;
/**
Sum of the corresponding elements in 2 arrays
Madhu wants to write a Java program to find the sum of the corresponding elements in 2 arrays.
If the size of the first array is larger then the third array size should be size of first array 
otherwise the third array size is the second array size , then add all the elements  
store it in third array and print the array.If the size is 0 or less print "Invalid array size".

Sample Input 1:
Enter the size of first array:
5
Enter elements for first array:
1
2
4
5
8

Enter the size of second array:
5

Enter elements for second array:
4
9
6
7
3

Sample Output 1:
5
11
10
12
11

Sample Input 2:
Enter the size of first array:
-3

Sample Output 2:
Invalid array size

Sample Input 3:
Enter the size of first array:
3
Enter elements for first array:
2
4
6
Enter the size of second array:
5
Enter elements for second array:
5
4
3
2
1

Sample Output 3:
7
8
9
2
1
*/
import java.util.*;
public class sumCArray 
{
	public static int [] sumArr(int [] array1 , int [] array2 , int max)
	{
		int [] array = new int[max];      //  |0|0|0|0|0|0|
		
		if(array1.length>=array2.length)  //  |1|2|3|4|5|6|   // |4|5|6|
		{
			for(int i=0;i<array2.length;i++)
				array[i]=array2[i];			// |4|5|6|0|0|0|
			
			for(int i=0;i<array.length;i++)
				array[i] +=array1[i];     //  |5|7|9|4|5|6|
		}
		else
		{
			for(int i=0;i<array1.length;i++)
				array[i]=array1[i];
			
			for(int i=0;i<array.length;i++)
				array[i] += array2[i];
		}
		return array;
	}
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the size of first array:");
		int l1 = SC.nextInt();
		
		if(l1>0)
		{
			int [] array1 = new int[l1];
			System.out.println("Enter elements for first array:");
			for(int i=0;i<array1.length;i++)
				array1[i]=SC.nextInt();
			
			System.out.println("Enter the size of second array:");
			int l2 = SC.nextInt();
			
			if(l2>0)
			{
				int [] array2 = new int [l2];
				System.out.println("Enter elements for second array:");
				for(int i=0;i<array2.length;i++)
					array2[i]=SC.nextInt();
				
				int len=0;
				if(l1>=l2)
					len=l1;
				else
					len=l2;
				
				int [] max = sumArr(array1,array2,len);
				
				for(int i=0;i<max.length;i++)
					System.out.println(max[i]);
				
			}
			else
				System.out.println("Invalid array size");
		}
		else
			System.out.println("Invalid array size");
	}

}
