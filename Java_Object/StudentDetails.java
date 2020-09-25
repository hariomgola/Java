package Java_Object;
/**
 Student Details - Constructor
Create a class Student with the private attributes

int studentId
String studentName
studentAddress
collegeName. 

Include appropriate getter methods.
Write 2 constructors for the Student class based on the below assumptions. 
Assume most of the students are from “NIT” college. So user has to give input whether the student is from NIT or not. 

If student belongs to NIT, give input as 'yes/YES' and  skip input for the attribute collegeName  and 
create student object with 3-argument constructor to initilze the values for studentId, studentName and 
studentAddress and  collegeName as “NIT”.

If student belongs to other college, give input as 'no/NO' and get college name from the user and 
create student object with 4-argument constructor to initialize all the values. 

Instead of Yes / No, if user enters different input then display 'Wrong Input' and get the input again.
Based on the above assumptions write the necessary constructors in the Student class.

Write a class StudentMain with the main method and test the application. 
Get all the input needed from the main method. 

Sample Input 1:
Enter Student's Id:
12
Enter Student's Name:
John
Enter Student's address:
Chennai
Whether the student is from NIT(Yes/No):
NO
Enter the college name:
SVS

Sample Output 1:
Student id:12
Student name:John
Address:Chennai
College name:SVS

Sample Input 2:
Enter Student's Id:
43
Enter Student's Name:
Tom
Enter Student's address:
Coimbatore
Whether the student is from NIT(Yes/No):
y
Wrong Input
Whether the student is from NIT(Yes/No):
yes

Sample Output 2:
Student id:43
Student name:Tom
Address:Coimbatore
College name:NIT
*/
import java.util.Scanner;
public class StudentDetails 
{
	public static void main(String[] args) 
	{
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter Student's Id:");
		int studentId=SC.nextInt();
		SC.nextLine();
		System.out.println("Enter Student's Name:");
		String studentName=SC.nextLine();
		System.out.println("Enter Student's Address:");
		String studentAddress=SC.nextLine();
		boolean flag=true;
		
		while(flag)
		{
			System.out.println("Wheather the student is from NIT(Yes/No):");
			String collegeName=SC.nextLine();
			if(!collegeName.equalsIgnoreCase("Yes") && !collegeName.equalsIgnoreCase("No"))
				System.out.println("Wrong Input");
			if(collegeName.equalsIgnoreCase("Yes"))
			{
				Student student = new Student(studentId,studentName,studentAddress);
				System.out.println("Student id:"+student.getStudentId());
				System.out.println("Student Name:"+student.getStudentName());
				System.out.println("Address:"+student.getStudentAddress());
				System.out.println("College name:"+student.getCollegeName());
				flag=false;
			}
			if(collegeName.equalsIgnoreCase("No"))
			{
				System.out.println("Enter the college name:");
				String cName=SC.nextLine();
				Student student = new Student(studentId,studentName,studentAddress,cName);
				System.out.println("Student id:"+student.getStudentId());
				System.out.println("Student Name:"+student.getStudentName());
				System.out.println("Address:"+student.getStudentAddress());
				System.out.println("College name:"+student.getCollegeName());
				flag=false;
			}
		}
		
	}

}
