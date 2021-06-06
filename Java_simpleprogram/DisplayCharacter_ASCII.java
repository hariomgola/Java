package Java_simpleprogram;
/*
I want Code which print ASCII character value of input number on console.
[Assume the inputs should be always 5 ]

Input 1:
  Enter the digits:
    65
    66
    67
    68
    69

Output 1:
    65-A
    66-B
    67-C
    68-D
    69-E

Input 2: 
  Enter the digits:
    112
    113
    114
    115
    116

  Sample Output 2:
    112-p
    113-q
    114-r
    115-s
    116-t 
*/
import java.util.Scanner;
public class DisplayCharacter_ASCII{
    public static void main(String[] args){
        // Scanner
        Scanner SC = new Scanner(System.in);

        //Variable
        int x1,x2,x3,x4,x5;
        char a1,a2,a3,a4,a5;

        // Inputs
        System.out.println("Enter the digits:");
        x1 = SC.nextInt();
        x2 = SC.nextInt();
        x3 = SC.nextInt();
        x4 = SC.nextInt();
        x5 = SC.nextInt();

        // Converting Int data type int Character datatype
        a1 = (char)x1;
        a2 = (char)x2;
        a3 = (char)x3;
        a4 = (char)x4;
        a5 = (char)x5;

        // Output
        System.out.println(x1+"-"+a1);
        System.out.println(x2+"-"+a2);
        System.out.println(x3+"-"+a3);
        System.out.println(x4+"-"+a4);
        System.out.println(x5+"-"+a5);
    }
} 
