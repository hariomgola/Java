package Java_simple;
/*
Registration Details

 Manoj is currently working in a job portal. His mode of work is,
 store the registration details like name, qualification, age, phone number, email id 
 and no of years of experience if any of a job seeker. 
 The system will register all the details given and save it in the portal. 
 Implement the scenario and display the output as shown in the sample.

Sample Input 1:
Enter your name:Manoj
Enter your age:24
Enter your phoneno:9876542100
Enter your qualification:MBA
Enter your email id[Please provide valid id, after registering your registration id will be
mailed]:Manoj@gmail.com
Enter your noofexperience[if any]:1.5

Sample Output 1:
Dear Manoj, Thanks for registering in our portal, registration id will be mailed to Manoj@gmail.com within 2 working days
*/
import java.util.Scanner;
public class Registration_Details 
{
	public static void main(String[] args) 
	{
		String name,qua,email;
		int age;
		double phone,exp;
		Scanner SC = new Scanner (System.in);
		
		//Input 
		System.out.println("Enter your name:");
		name = SC.nextLine();
		System.out.println("Enter your age:");
		age=SC.nextInt();
		System.out.println("Enter your phoneno:");
		phone = SC.nextDouble();
		SC.nextLine();
		System.out.println("Enter you qualification:");
		qua = SC.nextLine();
		System.out.println("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
		email = SC.nextLine();
		System.out.println("Enter you noofexperience");
		exp=SC.nextDouble();
		
		//Output
		System.out.println("Dear "+name+", Thanks for registering in our portal, registration id will be mailed to "+email+" within 2 working days");
	}

}
