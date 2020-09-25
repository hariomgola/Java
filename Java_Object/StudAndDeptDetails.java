package Java_Object;
/**
 Student and Department Detail
Create a class Department with the following private member variables

int did
String dname
Include appropriate getters and setters method in Department class.

Create a class Student with the following private member variables

int sid
String sname
Department department
Include appropriate getters and setters method in Student class.

Create a TestMain class which has main method.
In addition to main method, create a method 

public static Student createStudent() -  All input as shown in the sameple input should be got in this method.  
Set the values to the Student object and return that object
Note : In main method, invoke the createStudent method and print the details of the object returned by that method.

Sample Input 1:
Enter the Department id:
100
Enter the Department name:
Computerscience

Enter the Student id:
123
Enter the Student name:
sudha
Sample Output 1:

Department id:100
Department name:Computerscience
Student id:123
Student name:sudha
*/
import java.util.Scanner;
public class StudAndDeptDetails 
{
	public static S_tudent createStudent()
	{
		Scanner SC=new Scanner(System.in);
		S_tudent student=new S_tudent();
		Department department = new Department();
		
		System.out.println("Enter the Department id:");
		int did=SC.nextInt();
		System.out.println("Enter the Department name:");
		String dname=SC.next();
		System.out.println("Enter the Student id:");
		int sid=SC.nextInt();
		System.out.println("Enter the Student name:");
		String sname=SC.next();
		
		department.setDid(did);
		department.setDname(dname);
		student.setSid(sid);
		student.setSname(sname);
		student.setDepartment(department);
		
		return student;
	}
	public static void main(String[] args) 
	{
		S_tudent student = new S_tudent();
		Department department = new Department();
		student = createStudent();
		department=student.getDepartment();
		
		System.out.println("Department id:"+department.getDid());
		System.out.println("Department name:"+department.getDname());
		System.out.println("Student id:"+student.getSid());
		System.out.println("Studnet name:"+student.getSname());
	}

}
