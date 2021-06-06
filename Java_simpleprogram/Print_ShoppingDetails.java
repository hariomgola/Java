package Java_simpleprogram;
/*
XYZ Travel Solution Want a Javaprogram to take information from User
Print details in console in given format

Input:
    Enter your name:Hari
    Enter age:18
    Enter gender:Male
    Hailing from:Delhi

Output:
    Welcome, Hari!
    Age:18
    Gender:Male
    City:Delhi
    * -Have A NICE JOURNEY- *
*/

import java.util.Scanner;
public class Print_ShoppingDetails{
    public static void main(String[] args){
        // Using Scanner Function
        Scanner SC = new Scanner(System.in);

        // Variable
        String name,gender,city;
        int age;


        // Inputs
        System.out.println("Enter your name:");
        name = SC.nextLine();
        System.out.println("Enter age:");
        age = SC.nextInt();
        SC.nextLine();
        System.out.println("Enter gender:");
        gender = SC.nextLine();
        System.out.println("Hailing from:");
        city = SC.nextLine();


        // Output
        System.out.println("Welcome, "+name+"!");
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("City:"+city);

        System.out.println("* -Have A NICE JOURNEY- *");


    }
}