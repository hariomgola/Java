/**
Find the highest mark
Raj is a professor who handles Mathematics ,he wants to conduct evaluation for the students.
He wants to find the highest mark among the students to give the proficiency .
Write a Java program to help Raj. (Assume 6 set of marks provided always)

Note: Mark should be greater than equal to zero.
  Input 1 : 
    89
    90
    67
    78
    98
    76
  Output 1 :
    Highest mark is 98

  Input 2:
    96
    -89
  Output 2 :
    Invalid Mark
 */
import java.util.*;
public class highestmark {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int iArr[] = new int[6];
        int max=0;
        boolean flag = true;

        for(int i=0;i<iArr.length;i++){
            iArr[i]=SC.nextInt();
            if(iArr[i]<0){
                flag = false;
                break;
            }
            if(iArr[i]>max)
                max=iArr[i];
        }

        if(flag)
            System.out.println("Highest mark is "+max);
        else
            System.out.println("Invalid Mark");
    }
}
