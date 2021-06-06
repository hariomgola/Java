package Java_simpleprogram;
/*
Hi Hari this Side I want Simple Application that can take Input as my name and print it in console.

Input: 
    Enter the name:
    Hari
Output:
    Welcome Hari.

Input: 
    Enter the name:
    Sushil Kumar

Output:
    Welcome Sushil Kumar.
*/

import java.util.Scanner;
public class Print_UserName{
    public static void main(String[] args){
        // Creating Scanner Function
        Scanner SC = new Scanner(System.in);

        // Defining Variable
        String name;

        //Taking inputs from User
        System.out.println("Enter the name:");
        name = SC.nextLine();

        // Output
        System.out.println("Welcome "+name+".");

    }
}
