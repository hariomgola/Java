/**
Frame the Expression
An expression is given. 
The given expression will give a wrong output. Correct the expression by replacing the operator by +,-,/,* 
so that the expression yields a correct output.

  Input1:
    5-2=10
  Output1:
    5*2=10

  Input2:
    40+2=20
  Output2:
    40/2=20

  Input3:
    1234%2=1236
  Output3:
    Invalid Input
 */
import java.util.*;
public class frameExpression {
    public static void main(String [] args){
        Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();

        if(str.contains("%"))
            System.out.println("Invalid Input");
        else{
            String [] c=str.split("-|\\+|\\/|\\*|=");
            int a[] = new int[c.length];
            for(int i=0;i<c.length;i++)
                a[i]=Integer.parseInt(c[i]);
            
            if(a[0]+a[1]==a[2])
                System.out.println(a[0]+"+"+a[1]+"="+a[2]);
            if(a[0]-a[1]==a[2])
                System.out.println(a[0]+"-"+a[1]+"="+a[2]);
            if(a[0]*a[1]==a[2])
                System.out.println(a[0]+"*"+a[1]+"="+a[2]);
            if(a[0]/a[1]==a[2])
                System.out.println(a[0]+"/"+a[1]+"="+a[2]);
        }
    }
}
