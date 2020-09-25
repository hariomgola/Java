package Java_simple;
/*
Celsius to Farenheit Conversion
Write a program to convert  Celsius to Farenheit.  Display the result correct to 1 decimal.
Hint : 5 * (F – 32) = 9 * C, F-Farenheit , C-Celsius

Sample Input  1 :
80
Sample Output  1 :
176.0

Sample Input  2 :
88
Sample Output  2 :
190.4
*/
import java.util.Scanner;
public class Celcius_farenheit 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		int c=SC.nextInt();
		//Calculation
		double f=(((9*c)/5)+32);
		System.out.println(String.format("%.1f",f));
	}
	
}
