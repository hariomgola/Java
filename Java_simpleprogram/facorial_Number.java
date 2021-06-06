package Java_simpleprogram;
/*
Write a program to give factorial of a given Number.

  Condition
    - if number is not exactly a factorial display "Sorry. The given number is not a perfect factorial."
    - If number is Zero or negative print "Invalid Input"

    - 5!=5*4*3*2*1=120

  Input 1 :
    5040
  Output 1 :
    7  

  Input 2 :
    0
  Output 2 :
    Invalid Input

  Input 3 :
    700
  Output 3 :
    Sorry. The given number is not a perfect factorial
*/
import java.util.Scanner;
public class facorial_Number {
    public static int factorial(int number){
        int sum=1;
        for(int i=1;sum<=number;i++){
            sum*=i;
            if(sum==number){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();

        if(num<=0){
            System.out.println("Invalid Input.");
        }
        else{
            int numf = factorial(num);
            if(numf!=0){
                System.out.println(numf);
            }
            else{
                System.out.println("Sorry. The given number is not a perfect factorial.");
            }
        }
    }    
}
