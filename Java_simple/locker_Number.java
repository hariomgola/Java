package Java_simple;
/*
Daisy’s Locker Number
Daisy has a Locker which contains a combination number lock. It needs a pair of numbers to open the lock. As a measure of safety, Daisy uses to change the key numbers once in a month. At the same time she is also afraid of forgetting it, and hence she writes the first number alone in a paper and keeps it secretly. From the first number she can easily find the second number because the second number is formed by considering each digit’s next odd /even sequence.

For example if the first number is 9278, then the second number is 1490.

Write a program that gets the first number from the user and gives the second number.

NOTE: If the input is 8888 or a negative number display "Invalid Input".

If input is 0053, the output should be 75.

If input is 8874, the output should be 96.

Sample input
Enter the first number

3648

Sample output

The second number is: 5860
*/
import java.util.Scanner;
public class locker_Number {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the first number");
        int fnumber = SC.nextInt();

        if (fnumber == 8888 || fnumber < 0)
            System.out.println("Invalid Input");
        else {
            int num[] = new int[4];
            
            // loop for reversing the number
            for(int i=0;i<4;i++){
                num[3-i] = fnumber%10;
                fnumber/=10;
            }
            // loop for Second number
            int temp = 0;
            for(int i=0;i<4;i++){
                temp = num[i];
                if(num[i]!=0)
                    temp +=2;
                num[i] = temp;
                if(num[i]>9)
                    num[i] %= 10;
            }
            //printing the second number
            boolean flag = false;
            for(int i=0;i<4;i++){
                if(num[i]>0 && flag==false){
                    flag = true;
                    System.out.print("The second number is: ");
                }
                if(flag)
                    System.out.print(num[i]);       
            }
        }
    }
}
