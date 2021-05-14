package Java_simple;
/*
Sum of the series
Write a Program to print the sum of the following series.
SUM = -X + X2 - X3 + X4 - X5+ ... n terms
Prompt the user to enter the first number and the nth term.
 Both the input numbers  should be  positive, else  print as “Invalid Input”
Display the result along with the message, “The sum of the series is a positive number” or 
“The sum of the series is a negative number”

[Note: The sign of the alternate number changes.]

Sample input 1
Enter the first number
45
Enter the nth number
8
Sample output 1
-45+46-47+48-49+50-51+52=4
The sum of the series is a positive number

Sample input 2
Enter the first number
-2
Enter the nth number
9
Sample output 2
Invalid Input
*/
import java.util.Scanner;
public class Sum_Series {
    public static void main (String[] args) {
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Enter the first number");
        int number = SC.nextInt();
        System.out.println("Enter the nth number");
        int digit = SC.nextInt();
        if(number<=0 || digit<=0)
            System.out.println("Invalid Input");
        else{
            int count=1,temp=0;
            while(digit!=0){
                if(count%2!=0){
                    System.out.print("-"+number);
                    temp -= number;
                }
                else{
                    System.out.print("+"+number);
                    temp += number;
                }
                ++number;
                --digit;
                ++count;
            }
            System.out.println("="+temp);
            if(temp>0)
                System.out.println("The sum of the series is a positive number");
            else
                System.out.println("The sum of the series is a negative number");
        }
    }
}
