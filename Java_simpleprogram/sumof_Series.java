package Java_simpleprogram;
/*
Write a program to print a series
sum = -x + x2 - x3 + x4 - x5+ ... n terms
Ask User to input first number and the nth term.
Both the input number should be positive,else print “Invalid Input”
Display the output as shown below on based of sum is positive or negative.

  Input 1
    Enter the first number
    45
    Enter the nth number
    8
  Output 1
    -45+46-47+48-49+50-51+52=4
    The sum of the series is a positive number

  Input 2
    Enter the first number
    -2
    Enter the nth number
    9
  Output 2
    Invalid Input
*/
import java.util.Scanner;
public class sumof_Series {
    public static void main(String[] args){
        Scanner SC= new Scanner(System.in);

        System.out.println("Enter the first number");
        int number = SC.nextInt();
        System.out.println("Enter the nth number");
        int digit = SC.nextInt();
        if(number<=0 || digit<=0){
            System.out.println("Invalid Input");
        }
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
