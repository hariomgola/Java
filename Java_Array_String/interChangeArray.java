package Java_Array_String;
/**
	Interchanging the elements of an array
 */
import java.util.*;
public class interChangeArray 
{
	public static void main(String [] args)
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the number of elements in the first array :");
		int lengtha=SC.nextInt();
		if(lengtha>0)
		{
			int [] a= new int[lengtha];
			System.out.println("Enter the elements in the first array:");
			for(int i=0;i<a.length;i++)
				a[i]=SC.nextInt();
			
			System.out.println("Enter the number of elements in the second array :");
			int lengthb=SC.nextInt();
			if(lengthb>0 && lengthb==lengtha)
			{
				int [] b= new int[lengthb];
				System.out.println("Enter the elements in the second array:");
				for(int i=0;i<b.length;i++)
					b[i]=SC.nextInt();
				
				//Swapping elements of array
				for(int i=0;i<a.length;i++)       
				{
					a[i] = a[i] + b[i];             
					b[i] = a[i] - b[i];
					a[i] = a[i] - b[i];
				}
				/*
				 a=5,b=2;
				 a=5+2=7;     a=7
				 b=7-2=5;     b=5;
				 a=7-5=2;     a=2;
				 */
				//Printing first array 
				System.out.println("The first array after swapping is : ");
				for(int i:a)
					System.out.print(i+" ");
				
				//printing second array
				System.out.println("\nThe second array after swapping is :");
				for(int i:b)
					System.out.print(i+" ");
			}
			else if(lengthb<=0)
				System.out.println("Invalid range");
			else
				System.out.println("Unable to swap size differs");
				
		}
		else
			System.out.println("Invalid Input");
	}
}
