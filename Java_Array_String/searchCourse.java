package Java_Array_String;
/**
   program for search a particular element in array
 */
import java.util.*;
public class searchCourse 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the no of cources:");
		int length = SC.nextInt();
		boolean flag=false;
		if(length>0)
		{
			String [] course = new String[length];
			System.out.println("Enter course names:");
			for(int i=0;i<course.length;i++)
				course[i]=SC.next();
			
			System.out.println("Enter the course to be searched:");
			String search=SC.next();
			for(int i=0;i<course.length;i++)
				if(search.equalsIgnoreCase(course[i]))
					flag=true;
			
			if(flag)
				System.out.println(search+" course is availble");
			else
				System.out.println(search+" course is not available");
					
		}
		else
			System.out.println("Invalid Range");
	}
}
