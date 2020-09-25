package Java_Array_String;
/**
 Program for Average and grade Calculation.
 */
import java.util.*;
public class averageAndGrade 
{
	public static void main(String[] args) 
	{
		Student stud = new Student();
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the id:");
		int id=SC.nextInt();
		System.out.println("Enter the name:");
		String name = SC.next();
		System.out.println("Enter the no of subjects:");
		int length = SC.nextInt();
		
		int [] marks = new int[length];
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the marks for subject "+(i+1)+" :");
			marks[i]=SC.nextInt();
		}
		
		stud.setId(id);
		stud.setName(name);
		stud.setMarks(marks);
		
		stud.calculateAvg();
		stud.findGrade();
		
		System.out.println("Id:"+stud.getId());
		System.out.println("Name:"+stud.getName());
		System.out.println("Average:"+stud.getAverage());
		System.out.println("Grade:"+stud.getGrade());
	}

}
