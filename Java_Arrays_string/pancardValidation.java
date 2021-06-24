/**
PAN Card Validation
Write a program to check  the  PAN card no is valid or not. Generally a PAN no is a mix of both numbers and alphabets. 
It should have exactly 10 characters, in which, the first 5 characters should be upper case, the next 4 should be numbers,
and last one should be an upper case character. If the PAN no doesn't match the pattern print "Invalid PAN no".

  Input 1:
    Enter the PAN no:
    ASDFG7896K
  Output 1:
    Valid PAN no

  Input 2:
    Enter the PAN no:
    7896ABC8K
  Output 2:
    Invalid PAN no
 */
import java.util.*;
public class pancardValidation {
    public static void main(String [] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the PAN no:");
        
        // Printingoutput
        System.out.println(validatePAN(SC.nextLine()));

    }
    public static String validatePAN(String str){
        if(str.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
            return "Valid PAN no";
        else
            return "Invalid PAN no";
    }
}
