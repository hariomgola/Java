/**
    Print unique characters
Write a program to print all the unique characters in a given sentence. 
The sentence should have only alphabets .
If the sentence is not valid display the message "Invalid Sentence".
If unique characters are not found print "No unique characters".
If unique characters are found print those characters as shown in sample output.

  Input 1:
    Enter the sentence:
    java is an object oriented programming language
  Output 1:
    Unique characters:
    v
    s
    b
    c
    d
    p
    l
    u

  Input 2:
    Enter the sentence:
    Welcome to 12house
  Output 2:
    Invalid Sentence
 */
import java.util.*;
public class uniqueCharacter {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str = SC.nextLine();

        if(!onlyString(str))
            System.out.println("Invalid Sentence");
        else{
            char [] array = Unique(str);
            int length = alength(str);
            if(length>0){
                System.out.println("Unique characters:");
                for(char c:array)
                    System.out.println(c);
            }
            else
                System.out.println("No Unique charcaters");
        }

    }
    public static boolean onlyString(String str){
        if(str.matches("^[a-zA-Z_ ]*$"))
            return true;
        return false;
    }

    public static char[] Unique(String str){
        char[] arr = str.toCharArray();
        char[] array = new char[arr.length];
        int arraycount=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count==1)
                array[arraycount++] = arr[i];
        }

        char [] returnArray = Arrays.copyOf(array, arraycount);
        return returnArray;
    }

    public static int alength(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(str.indexOf(a)!=str.lastIndexOf(a))
                count++;
        }
        if(count==str.length())
            return 0;
        else
            return 1;
    }
}
