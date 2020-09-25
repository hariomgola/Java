package Java_Array_String;
/**
  program to Make a number from array
  condition 1- number is make with the help of single digit number which is divided by 2 in array
  condition 2- if size of array should be less than or equal to zero print "Invalid array size"
  condition 3- if in array no single digit number which is divisible by 2 not found 
  				print "Single digit even number is not found in the array"
  				
  example  array {2,34,6,56,8} the number should be 268.
 */
import java.util.*;
public class makeNumber 
{
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner (System.in);
		System.out.println("Enter the size of an array:");
		int length = SC.nextInt();
		if(length>0)
		{
			int count=0;
			int [] array = new int[length];
			System.out.println("Enter the array elements");
			for(int i=0;i<array.length;i++)
			{
				array[i]=SC.nextInt();
				if(array[i]>0 && array[i]<=9 && array[i]%2==0)
					count = (count*10)+array[i];
			}
			if(count>0)
				System.out.println(count);
			else
				System.out.println("Single digit even number is not found in the array");
		}
		else
			System.out.println("Invalid array size");
	}

}
