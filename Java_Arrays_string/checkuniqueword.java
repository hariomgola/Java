/**
Two words of same letters
Write a program to get two strings as input from the user. 
The program should check if both the strings contains the same letters.

Note: Both the string values will be in lowercase.

  Input 1:
    tea
    ate
  Output 1:
    Same
Explanation: Letter 't' is available in the word a't'e, 
Letter 'e' is present in the word at'e' and letter 'a' is available in the word 'a'te.

  Input 2:
    ear
    tear
  Output 2:
    Different
Explanation: 't' is not available in the word "ear"(first input)

  Input 3:
    record
    order
  Output 3:
    Different

  Input 4:
    record
    coder
  Output 4:
    Same
Explanation: Though 'r' is repeated twice in the word 'record', 
it is available in the word 'coder' as per the problem statement. Here, Letters are same. Hence, the output is "Same".
 */
import java.util.*;
public class checkuniqueword {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String str1 = SC.nextLine();
        String str2 = SC.nextLine();
        System.out.println(checkUniqueString(str1, str2));
    }
    // Helper method
    public static String checkUniqueString(String str1, String str2){
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);


        // converting first array and checking only unique value
        char _ch1[] = new char[ch1.length];
        int x=0;
        for(int i=0;i<(ch1.length -1);i++){
            if(ch1[i]!=ch1[i+1])
                _ch1[x++] = ch1[i];
        }
        _ch1[x++] = ch1[ch1.length-1]; // Inserting last element

        //converting second string array and converting only unique value
        char _ch2[] = new char[ch2.length];
        int y=0;
        for(int i=0;i<(ch2.length-1);i++){
            if(ch2[i]!=ch2[i+1])
                _ch2[y++] = ch2[i];
        }
        _ch2[y++] = ch2[ch2.length-1]; // Inserting last element

        // creating new array with only unique values
        char[] c1 = Arrays.copyOfRange(_ch1, 0, x);
        char[] c2 = Arrays.copyOfRange(_ch2, 0, y);

        // checking both arrays are equal or not
        if(Arrays.equals(c1, c2))
            return "Same";
        else
            return "Different";
    }
}
