/**
Kids school
In a school, the Kindergarten students are supposed to repeat a word till they memorize the word. 
For example if the word is “dancing”, they will have to say dancingdancingdancing…
Write a program to accept the string(word) as input from the user and also get the X and the Y position of the character
as input from the user. If the Xth and Yth position characters are same then print it as “Same” else “Not Same”.

[Example: if the input is dancing, and if the x is 3 and y is 10 then the output will be “Same”. 
The students keep on repeating the word[dancingdancing], 
the 3rd position character is “n” and 10th position character is also “n” so the output is same] 

  Input 1:
    dancing
    3
    10
  Output 1:
    Same

  Input 2:
    love
    2
    12
  Output 2:
    Not Same
 */
import java.util.*;
public class kidsMathgame {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        int x=SC.nextInt();
        int y= SC.nextInt();

        if(x<=0||y<=0)
            System.out.println("Not Same");
        else{
            String st = str+str+str+str+str+str;
            Character c1 = st.charAt(x-1);
            Character c2 = st.charAt(y-1);
            
            if(c1.equals(c2))
                System.out.println("Same");
            else
                System.out.println("Not Same");
        }
    }
}
