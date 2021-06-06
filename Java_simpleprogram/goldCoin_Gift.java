package Java_simpleprogram;
/*
Create a program to count no of coins on nth birthday.

 Condition
    - On her 1st birthday Aman got one coin from them, 
    - 2nd birthday 8 coins,
    - 3rd birthday 27 coins,
    - 4th birthday 64 coins,
    - 5th birthday 125 coins and so on.

    - Age should be a valid positive number(>0). 
    - Incase of any invalid input, the output should be "Invalid Age".

  Input 1:
    Enter the age: 3
  Output 1:
    Aman gets 27 coins

  Input 2:
    Enter the age: 8
  Output 2:
    Aman gets 512 coins 
*/
import java.util.Scanner;
public class goldCoin_Gift {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int coin = 0;

        System.out.println("Enter the age:");
        int age = SC.nextInt();
        if(age<0){
            System.out.println("Invalid Age");
        }
        else{
            coin = ((age*age)*age);
            System.out.println("Aman gets "+coin+" coins");
        }
    }
}
