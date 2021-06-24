/**
Find and Replace
Polymens a famous news editor, has daily responsibility of deciding which news stories are printed in the paper. 
Before that he wants to verify all the words are spelled in a right way. Incase of any misspelled word found, 
he has to replace it throughout the document without any fail. 
Polymens needs an application to make his find and replace job easier. 
Implement the given scenario and code accordingly. Refer the samples for read and display the data.
[Search and replace should be case sensitive.  Input can contain words separated by space and full stop.]

  Input 1:
    Enter the string:
    Have a good day
    Enter the word to be searched:
    good
    Enter the word to be replaced:
    nice
  Output 1:
    Have a nice day

  Input 2:
    Enter the string:
    Have a good day
    Enter the word to be searched:
    nice
    Enter the word to be replaced:
    nice
  Output 2:
    The word nice not found

  Input 3:
    Enter the string:
    Google PlayStore is a digital distribution service operated and developed by Google.
    Enter the word to be searched:
    Google
    Enter the word to be replaced:
    Yahoo
 Output 3:
    Yahoo PlayStore is a digital distribution service operated and developed by Yahoo.
 */
import java.util.*;
public class findReplace {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = SC.nextLine();

        System.out.println("Enterthe character to be searched:");
        String str1 = SC.next();
        // char a= SC.next().charAt(0);
        // String str1 = Character.toString(a);

        System.out.println("Enter the character to replace:");
        String str2 = SC.next();
        // char b = SC.next().charAt(0);
        // String str2 = Character.toString(b);

        if(str.indexOf(str1)== -1)
            System.out.println("The word "+(str1)+" not found");
        else
            System.out.println(str.replace(str1,str2));
    }
}
