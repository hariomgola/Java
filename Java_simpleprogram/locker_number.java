package Java_simpleprogram;
/*
Create a program to give locker number from secret number.
If someone forgot the locker number he/she can easily find their locker number 
Because the Secret number is formed by considering each digit’s next odd /even sequence.

For example if the first number is 9278, then the Secret number is 1490.

  NOTE: 
    - If the input is 8888 or a negative number display "Invalid Input".
    - If input is 0053, the output should be 75.
    - If input is 8874, the output should be 96.

  Input
    Enter the first number
    3648
  Output
    The second number is: 5860
*/
import java.util.Scanner;
public class locker_number {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the first number");
        int fnumber = SC.nextInt();

        if(fnumber == 8888 || fnumber<0)
            System.out.println("Invalid Input");
        else{
            int num[] = new int[4];

            // loop for reversing the number
            for(int i=0;i<4;i++){
                num[3-i] = fnumber%10;
                fnumber/=10;
            }

            // loop for Second number
            int temp=0;
            for(int i=0;i<4;i++){
                temp = num[i];
                if(num[i]!=0)
                    temp +=2;
                num[i] = temp;
                if(num[i]>9)
                    num[i] %=10;
            }

            // Printing the second number
            boolean flag = false;
            for(int i=0;i<4;i++){
                if(num[i]>0 && flag ==  false){
                    flag =true;
                    System.out.println("The second number is: ");
                }
                if(flag)
                    System.out.print(num[i]);
            }
        }
    }
}
