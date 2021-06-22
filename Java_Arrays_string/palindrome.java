/**
Reverse and find palindrome
In a given sentence, reverse each word and print the reversed words in the sentence.
If there is a palindrome in the words, print those words. If there is no palindrome print “No palindrome”.
Sample Input1:
mom cooks yummy dish
Sample Output1:
mom skooc ymmuy hsid
mom

Sample Input2:
we seven eve madam
Sample Output2:
ew neves eve madam
eve
madam

Sample Input3:
java is a programming language
Sample Output3:
avaj si a gnimmargorp egaugnal
No palindrome
*/
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();

        StringBuilder stb = new StringBuilder();
        String words[] = str.split(" ");

        int c=0;
        for(String word:words){
            String rev=new StringBuilder(word).reverse().toString();
            stb.append(rev+" ");
        }

        System.out.println(stb.toString().trim());

        // Palindrome check
        for(String word:words){
            String rev = new StringBuilder(word).reverse().toString();
            if(rev.equals(word) && rev.length()!=1){
                System.out.println(word);
                c=1;
            }
        }

        if(c==0)
            System.out.println("No palindrome");
    }    
}
