package Java_simple;
/*
Sum of Cubes
Write a program to display the sum of the cubes of the even numbers between ranges of the given numbers.

Note :

Both the input can be either positive or negative.  If both input are same, display Invalid Input.

Sample input 1:

Enter the first number

2

Enter the last number

8

Sample output 1:

800

Sample input 2:
Enter the first number

1

Enter the last number

1


Sample output 2:

Invalid Input


Sample input 3:
Enter the first number

-5

Enter the last number

2


Sample output 3:

-64
*/
import java.util.Scanner;
public class Sum_Cubes {
    public static void main (String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the first number");
        int fnum = SC.nextInt();
        System.out.println("Enter the last number");
        int snum = SC.nextInt();
        
        if(fnum!=snum){
            int sum=0;
            while(snum>=fnum){
                if(fnum%2==0){
                    sum +=(fnum*fnum*fnum);
                }
                fnum++;
            }
            System.out.println(sum);
        }
        else
            System.out.println("Invalid Input");
    }
}
