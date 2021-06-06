package Java_simpleprogram;
/*
Write a program to Check Wheather a number is palindrome or not.

  Condition
    - If number is negative print "Only positive Number Allowed."

  Input 1 :
    21212
  Output 1 :
    Palindrome

  Input 2 :
    6186
  Output 2 :
    Not a Palindrome
*/
import java.util.Scanner;
public class Palindrome_number{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);

        int num,num_c=0,res=0;
        num = SC.nextInt();

        num_c = num;
        if(num<0){
            System.out.println("Only positive Number Allowed.");
        }
        else{
            while(num>0){
                res = res*10;
                res = (num%10) + res;
                num = num/10;
            }

            if(res == num_c){
                System.out.println("Palindrome.");
            }
            else{
                System.out.println("Not a Palindrome.");
            }
        }
    }
}
