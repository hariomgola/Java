package Java_simpleprogram;
/*
I want to Create Java Program that will Calculate earning of labour on behalf of no of hours they worked.

Note -
    Hours Enter by user ia always positive and remember that hours should not be more than 24 
    Per hour Income is 1000 rs.

Input:
    Enter name:Hari
    Enter no of hours worked in a day:3
Output:
    Hari's total income in a year is 1095000.

Input:
    Enter name:Aman
    Enter no of hours worked in a day:0
Output:
    Aman's total income in a year is 0.

Input:
    Enter name:Aman
    Enter no of hours worked in a day:-5
Output:
    Unable to calculate the earnings.Please Provide correct hours

*/
import java.util.Scanner;
public class IncomeCalculator{
    public static void main(String[] args){
        // Scanner
        Scanner SC = new Scanner(System.in);
        
        //Variable
        int hours;
        String name;

        //Inputs
        System.out.println("Enter name:");
        name = SC.nextLine();
        System.out.println("Enter no of hours worked in a day:");
        hours = SC.nextInt();

        // Output
        if(hours<0 || hours>24){
            System.out.println("Unable to calculate the earnings. Please Provide correct hours");
        }else{
            int earning = ((hours*1000)*365);
            System.out.println(name+"'s total income in a year is "+earning+".");   
        }
    }
}