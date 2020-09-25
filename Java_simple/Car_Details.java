package Java_simple;
/*
Car Details

Write a program to get the details about a car as specified in the sample input and display it. 
Hint: Store the price in double. Print the price correct to two decimal places.

Sample Input 1:
Enter the car name:
amaze
Enter the car no:
3666
Enter the price:
870000.76

Sample Output 1:
Carname:amaze
Carno:3666
Price:870000.76 rs only
*/
import java.util.Scanner;
public class Car_Details 
{
	public static void main(String[] args) 
	{
		String name;
		int car_no;
		double price;
		Scanner SC= new Scanner(System.in);
		
		//Input 
		System.out.println("Enter the car name:");
		name = SC.nextLine();
		System.out.println("Enter the car no:");
		car_no = SC.nextInt();
		System.out.println("Enter the price:");
		price = SC.nextDouble();
		
		//Output
		System.out.println("Carname:"+name);
		System.out.println("Carno:"+car_no);
		//Important point
		System.out.println("Price:"+String.format("%.2f",price)+" rs only");
		
	}

}
