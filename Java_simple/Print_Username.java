package Java_simple;
/*
Print Username

Manoj, who is going to complete the higher education in this year needs to create a simple application 
which accept the name of a person and welcome them with a message along with their name. 
She wants to read the data using the class "Scanner". Implement this scenario using Java.

Sample Input 1: 
Enter the name:
Manoj
Sample Output 1:
Welcome Manoj.

Sample Input 2: 
Enter the name:
Manoj sharma

Sample Output 2:
Welcome Manoj sharma.
*/
import java.util.Scanner;
public class Print_Username 
{
	public static void main(String[] args) 
	{
		String name;
		Scanner SC=new Scanner(System.in);
		
		//input
		System.out.println("Enter the name:");
		name=SC.nextLine();
		//Output
		System.out.println("Welcome "+name+".");
	}

}
