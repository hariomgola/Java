/**
Least repeating character
Write a program to find the least repeating character in a given string.

  Input1:
    abcdabcdabcdacd
  Output1:
    b

  Input2:
    abcdefghadbcabgb
  Output2:
    e
    f
    h
 */
import java.util.*;
import java.lang.*;
public class leastrepeating {
    public static void main(String[] args){
      Scanner SC = new Scanner(System.in);
      String str = SC.nextLine();
      uniqueValue(str);
    }
    public static void uniqueValue(String str){
      char ch[] = str.toCharArray();
      Arrays.sort(ch);

      int iArr[] = new int[ch.length];
      int x=1,min=0;
      for(int i=0;i<(ch.length-1);i++){
        if(ch[i]!=ch[i+1]){
          // setting first min value
          if(min==0)
            min=x;
          // comparing every inserted value and checking value
          min = Math.min(min,x);
          iArr[i]=x;
          x=0;
        }
        x++;
      }
      iArr[ch.length-1] = x;

      //Printing output
      for(int i=0;i<iArr.length;i++){
        if(iArr[i]==min)
          System.out.println(ch[i]);
      }
    }
}
