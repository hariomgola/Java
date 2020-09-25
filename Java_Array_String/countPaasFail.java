package Java_Array_String;
/**
write a program to count no of subject the student passed and failed.
 */
import java.util.*;
public class countPaasFail 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		int paas=0,fail=0;
		System.out.println("Enter the no of subject:");
		int length = SC.nextInt();
		if(length>0)
		{
			int [] marks = new int[length];
			System.out.println("Enter the marks in subject:");
			for(int i=0;i<marks.length;i++)
			{
				marks[i]=SC.nextInt();
				if(marks[i]>=50)
					paas += 1;
				else
					fail += 1;
			}
			if(paas==length)
				System.out.println("Student passed in all subjects");
			if(fail==length)
				System.out.println("Student failed in all subjects");
			if(fail!=0 && paas!=0)
				System.out.println("Student passed in "+paas+" subjects and failed in "+fail+" subjects");
		}
		else
			System.out.println("Invalid input range");
		
	}
}
