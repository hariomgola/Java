/*
Substitution Cipher Technique
Krena sitting in the first row wants to send a secret message to her friend Sudha who is sitting in the last row 
inside the classroom. So she writes the secret message in a piece of paper and passes it through her classmates. 
Krena has used substitution cipher technique where every letter is replaced with the one 7 letters down the alphabetic 
line. Since Sudha already knows the technique she easily got the exact message.

Write a program that accepts the secret message to decrypt and print the actual message to the screen.
Input consists of the encrypted text.

Note: The encrypted text (input) may have numbers or special characters along with letters. 
If so, ignore those and convert only the letters. If space occurs between the words of input, 
it must occur in output also. If no letters, then there is “No hidden message”.

  Input 1
    Enter the encrypted text:
    Pukph
  Output 1
    Decrypted text:
    India

  Input 2
    Enter the encrypted text:
    Z23hcl @d$3#haly
  Output 2
    Decrypted text:
    Save water
*/
import java.util.*;
public class encodertechnique {
    public static void main(String[] args){
      Scanner SC = new Scanner(System.in);
      System.out.println("Enter the encrypted text:");
      String str = SC.nextLine();

      String result = decrypt(str);
      if(result.length()>0)
        System.out.println("Decrypted text: \n"+result);
      else
        System.out.println("No hidden message");

    }
    public static String decrypt(String str){
      // Uses the concept of boxing and unboxing
      char ch[] = str.toCharArray();
      int temp[] = new int[ch.length];
      int x=0;
      for(int i=0;i<ch.length;i++){
        // condition to check from a-z and A-Z with the help of ascii value
        // we can also use regex over here
        if(  ((int)ch[i]>=96 && (int)ch[i]<=122) || ((int)ch[i]>=65 && (int)ch[i]<=90) ){
          // for a-z
          if((int)ch[i]>=96 && (int)ch[i]<=122){
            int _temp = (int)ch[i] - 7;
            if(_temp<96){
              int len = 96 - _temp;
              _temp = 122 - (len);
            }
            temp[x++] = _temp;
          }
          // for A-Z
          if((int)ch[i]>=65 && (int)ch[i]<=90){
            int _temp = (int)ch[i] - 7;
            if(_temp<65){
              int len = 65 - _temp;
              _temp = 90 - (len);
            }
            temp[x++] = _temp;
          }
        }
        // condition for Adding white space in output
        if(ch[i] == ' ')
          temp[x++] = ch[i];
      }

      int _ch[] = Arrays.copyOf(temp,x);
      char rArr[] = new char[_ch.length];
      for(int i=0;i<rArr.length;i++)
        rArr[i] = (char)_ch[i];

      return String.valueOf(rArr);
    }
}
