package Java_simple;
/*
Sum of series II
Find the sum of the nth term for the following series

(x1*x2*x3)+(x2* x3* x4)+(x3*x4*x5)+ . . .

Write a program that gets the first number and the nth term from the user and displays the result .

Note :

If the  number of terms is 0 or a negative number, the output should be 0.

Sample input

Enter the first number:

5

Enter the number of terms:

4

Sample output

1770

Sample input 2

Enter the first number:

-3

Enter the number of terms:

6

Sample output 2

24

Sample input 3

Enter the first number:

5

Enter the number of terms:

-3

Sample output 3

0
*/
import java.util.Scanner;
public class sum_series2 {
    public static void main (String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number = SC.nextInt();
        System.out.println("Enter the number of terms:");
        int term = SC.nextInt();
        int sum=0;
        
        if(term>0){
         for(int i=0;i<term;i++){
             sum += (number*(number+1)*(number+2));
             number++;
         }   
        }
        System.out.println(sum);
    }
}
