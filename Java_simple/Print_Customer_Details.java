package Java_simple;
/*
Print Customer Details

Help Mr.Ben who is a programmer, in developing a registration form on console. 
Customers will not just input data, but also view the details once he/she finishes the registration. 
Sample Input 1:

Enter your name:Manoj
Enter age:25
Enter gender:male
Hailing from:Delhi

Sample Output 1:
Welcome, Manoj!
Age:25
Gender:male
City:Delhi
 */
import java.util.Scanner;
public class Print_Customer_Details 
{
	public static void main(String[] args) 
	{
		String name,gender,city;
		int age;
		Scanner SC= new Scanner(System.in);
		
		//Input
		System.out.println("Enter your name:");
		name = SC.nextLine();
		System.out.println("Enter age:");
		age = SC.nextInt();
		SC.nextLine();
		System.out.println("Enter gender:");
		gender = SC.nextLine();
		System.out.println("Hailing from:");
		city = SC.nextLine();
		
		//Output
		System.out.println("Wecome "+name+"!");
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("City:"+city);
	}

}
