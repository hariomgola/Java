package Java_simple;
/*
Convert Numbers into Months
Ram is very weak in converting the numbers into months. But his friends often tease him by asking him to do that. 
To solve his problem a close friend of him, suggested to meet IIT students, who were very good at programming. 
Help ram to resolve his problem.

Sample Input 1:
2
Sample Output 1:
February

Sample Input 2:
15
Sample Output 2:
No month for the number 15
*/
import java.util.Scanner;
public class Convert_Month 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		int a=SC.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		default:
			System.out.println("No month for the number "+a);
			break;
		}
	}

}
