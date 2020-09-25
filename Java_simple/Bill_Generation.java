package Java_simple;
/*
Bill Generation

Tom went to a movie with his friends in a multiplex theatre and during  break time 
he bought pizzas, puffs and cool drinks. Consider   the following prices : 

Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Tom has bought.

Sample Input 1:
Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5

Sample Output 1:
Bill Details
No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290
ENJOY THE SHOW!!!
 */
import java.util.Scanner;
public class Bill_Generation 
{
	public static void main(String[] args) 
	{
		int pizza,puffs,drinks,total_Price;
		Scanner SC=new Scanner(System.in);
		
		//Input 
		System.out.println("Enter the no of pizzas bought:");
		pizza = SC.nextInt();
		System.out.println("Enter the no of puffs bought:");
		puffs = SC.nextInt();
		System.out.println("Enter the no of cool drinks bought:");
		drinks = SC.nextInt();
		
		total_Price = (pizza*100) + (puffs*20) +(drinks*10);
		
		//Output
		System.out.println("Bill Details");
		System.out.println("No of pizza:"+pizza);
		System.out.println("No of puffs:"+puffs);
		System.out.println("No of cooldrinks:"+drinks);
		System.out.println("Total price="+total_Price);
		System.out.println("ENJOY THE SHOW!!!");
	
	}

}
