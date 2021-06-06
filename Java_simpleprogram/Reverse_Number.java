package Java_simpleprogram;
/*
Create a Program to Reverse a Number
  Condition
    - If the input given is zero display Output is:0. 
    - If the input is less than zero then display "Number should be positive"

  Input 1 :
    Enter The Number:
    478
  Output  1:
    Output is:874

  Input  2:
    Enter The Number:
    -470
  Output  2:
    Number should be positive

  Input  3:
    Enter The Number:
    34
  Output  3:
    Output is:43
*/
import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int rev = 0;

        System.out.println("Enter The Number:");
        int num = SC.nextInt();

        if(num<0){
            System.out.println("Number Should be positive");
        }
        else{
            while(num!=0){
                rev = rev*10;
                rev = rev+num%10;
                num = num/10;
            }
            System.out.println("Output is:"+rev);
        }
    }    
}
