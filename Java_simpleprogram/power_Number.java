package Java_simpleprogram;
/*
Write a program to give power of a number with given inputs.
 
  Condition
    - If either of the input is negative print "Invalid Input."
    - Don't Use Inbuild methord to find Power of a number.

  Input  1 :
    Enter the number
    5
    Enter the digit
    3
  Output  1 :
    125

  Input  2 :
    Enter the number
    18
    Enter the digit
    4
  Output  2 :
    104976
*/
import java.util.Scanner;
public class power_Number {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the number");
        int n1 = SC.nextInt();
        System.out.println("Enter the digit");
        int n2 = SC.nextInt();

        int temp=1;

        if(n1<0 || n2<0){
            System.out.print("Invalid Input.");
        }
        else{
            while(n2!=0){
                temp*=n1;
                --n2;
            }
            System.out.println(temp);
        }
    }
}
