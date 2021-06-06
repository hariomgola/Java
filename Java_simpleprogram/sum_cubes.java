package Java_simpleprogram;
/*
Create a  program to display the sum of the cubes of the even numbers between ranges of the given numbers.
All Iput taken from user can be positive or negative.if both input is same then print "Invalid Input."

  Input 1:
    Enter the first number
    2
    Enter the last number
    8
  Output 1:
    800

  Input 2:
    Enter the first number
    1
    Enter the last number
    1
  Output 2:
    Invalid Input

  Input 3:
    Enter the first number
    -5
    Enter the last number
    2
  Output 3:
    -64
*/
import java.util.Scanner;
public class sum_cubes {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the first number");
        int fnum = SC.nextInt();
        System.out.println("Enter the last number");
        int snum = SC.nextInt();

        if(fnum!=snum){
            int sum=0;
            while(snum>=fnum){
                if(fnum%2==0)
                    sum += (fnum*fnum*fnum);
                fnum++;
            }
            System.out.println(sum);
        }
        else
            System.out.println("Invalid Input");
    } 
}
