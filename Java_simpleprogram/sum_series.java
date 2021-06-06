package Java_simpleprogram;
/*
Create a program to print series in given format. (x1*x2*x3)+(x2* x3* x4)+(x3*x4*x5)+ . . .
if the input from user is zero or negative output should be 0.

  Input
    Enter the first number:
    5
    Enter the number of terms:
    4
  Output
    1770

  Input 2
    Enter the first number:
    -3
    Enter the number of terms:
    6
  Output 2
    24

  Input 3
    Enter the first number:
    5
    Enter the number of terms:
    -3
  Output 3
    0
*/
import java.util.Scanner;
public class sum_series {
    public static void main(String[] args){
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
