package Java_simpleprogram;
/*
Write a program to Store the patient details and print it on card in below format.

  Input 1:
    Enter the name:
    Edward
    Enter age:
    32
    Enter Gender('M' or 'F'):
    M
    Enter Weight:
    60.5
  Output 1:
    Name: Edward
    Age: 32
    Gender: M
    Weight: 60.50

  Input 2:
    Enter the name:
    Smith Williams
    Enter age:
    35
    Enter Gender('M' or 'F'):
    F
    Enter Weight:
    60.45
  Output 2:
    Name: Smith Williams
    Age: 35
    Gender: F
    Weight: 60.45
*/
import java.util.Scanner;
public class patient_details {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = SC.nextLine();
        System.out.println("Enter age:");
        int age = SC.nextInt();
        System.out.println("Enter Gender('M' or 'F'):");
        char gender = SC.next().charAt(0);
        System.out.println("Enter Weight:");
        double weight = SC.nextDouble();

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("Weight:"+String.format("%.2f",weight));
    }
}
