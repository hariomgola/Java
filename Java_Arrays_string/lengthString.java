/**
Length of String
A test conducted by an IT corporate requires two participants. 
One of them will provide his/her opponent with a long text. 
The opponent must code and find the no of characters in the string.The string should be validated ,spaces are allowed between the string. If valid Sting is provided   then find the length of the string .If the string is invalid then display the message "Invalid String". So help him/her code the logic in Java for the same. 
[Use length() of the String class.]

  Input 1:
    She sells seashells on the seashore
  Output 1:
    No of characters is:35

  Input 2:  
    hi @ welcome
  Output 2:
    Invalid String
 */
import java.util.*;
public class lengthString {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();

        if(str.matches("^[a-zA-Z ]*$"))
            System.out.println("No of character is:"+str.length());
        else
            System.out.println("Invalid String");
    }
}
