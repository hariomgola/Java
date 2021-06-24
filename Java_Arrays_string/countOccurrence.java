/**
Count occurrence of a character
Raji wants to count the no of occurrences of the given character.Write a program to accept a word from the user. 
Get a character from the user and find the no of occurrences . 
Check whether the given character and word is valid
The word is valid if it contains only alphabets and no space or any special characters or numbers.
The character is valid if it is an alphabet alone.

  Input 1:
    Enter a word:
    programming
    Enter the character:
    m
  Output 1:
    No of 'm' present in the given word is 2.

  Input 2:
    Enter a word:
    programming
    Enter the character:
    s
  Output 2:
    The given character 's' not present in the given word.

  Input 3:
    Enter a word:
    56
  Output 3:
    Not a valid string

  Input 4:
    Enter a word:
    Hello
    Enter the character:
    6
  Output 4:
    Given character is not an alphabet
 */
import java.util.*;
public class countOccurrence {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = SC.next();

        if(sCheck(str)){
            System.out.println("Enter the character:");
            char c=SC.next().charAt(0);
            if(cCheck(c)){
                int count = cinsCheck(str, c);
                if(count>0)
                    System.out.println("No of '"+c+"' present in the given word is "+count+".");
                else
                    System.out.println("The given character '"+c+"' not present in the given word.");
            }
            else
                System.out.println("Given character is not an alphabet");
        }
        else
            System.out.println("Not a valid String");
    }
    // checking string
    public static boolean sCheck(String str){
        if(str.matches("^[a-zA-Z]*$"))
            return true;
        return false;
    }
    // Checking character
    public static boolean cCheck(char c){
        if((c>='a' && c<='z') || (c>='A' && c<='Z'))
            return true;
        return false;
    }
    // counting occurence
    public static int cinsCheck(String str,char c){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c)
                count++;
        }
        return count;
    }
}
