package Java_simpleprogram;
/*
I am creating one application that take input from User for Job related required.
After Successfull registration print the Below Given Message on Console. 

Input:
    Enter your Name:Hari
    Enter your Age:18
    Enter your Phone-no:9876542100
    Enter your Qualification:MBA
    Enter your Email-id[Please provide valid id]:hari@gmail.com
    Enter your Experience[if any]:5

Output:
    Dear Hari, Thanks for registering in our portal,Our HR Will contact you on hari@gmail.com within 2-3 working days.

*/

import java.util.Scanner;
public class Print_RegistrationDetails{
    public static void main(String[] args){
        // Scanner
        Scanner SC = new Scanner(System.in);

        //Variable
        String name,qual,email;
        int age;
        double phone,exp;

        // input
        System.out.println("Enter your Name:");
        name = SC.nextLine();
        System.out.println("Enter your Age:");
        age = SC.nextInt();
        System.out.println("Enter your Phone-no:");
        phone = SC.nextDouble();
        SC.nextLine();
        System.out.println("Enter your Qualification:");
        qual = SC.nextLine();
        System.out.println("Enter your Email-id[Please provide valid id]:");
        email = SC.nextLine();
        System.out.println("Enter your Experience[if any]:");
        exp = SC.nextDouble();

        // Output
        System.out.println("Dear "+name+", Thanks for registering in our portal,Our HR Will contact you on "+email+" within 2-3 working days.");


    }
}