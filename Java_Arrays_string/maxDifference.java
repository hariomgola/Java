/**
Maximum Difference
ZEE-BEE Company has the list of appraisal ratings for their employees. 
Write a java program to find the maximum difference between any pair of appraisal rating.
The program should display the first occurrence of index positions of the pair that has the maximum difference 
(Assume absolute difference between pairs)
If the array elements or if the size is negative display as “Invalid”.

  Input1:
    6
    4
    3
    7
    5
    9
    1
  Output1:
    (4,5)

  Input2:
    5
    3
    -4
    2
    1
    5
  Output2:
    Invalid

  Input3:
    5
    2
    7
    4
    7
    2
  Output3:
    (0,1)
 */
import java.util.*;
public class maxDifference {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        boolean flag = true;

        // Taking inputs from users
        int len = SC.nextInt();
        int iArr[] = new int[len];
        for(int i=0;i<iArr.length;i++){
            iArr[i] = SC.nextInt();
            if(iArr[i]<0)
                flag = false;
        }

        if(flag)
            maxAbsoluteDifference(iArr);
        else
            System.out.println("Invalid");
    }    
    public static void maxAbsoluteDifference(int[] iArr){
        int max=0,difference=0,x=0,y=0;
        for(int i=0;i<iArr.length;i++){
            for(int j=0;j<iArr.length;j++){
                max = Math.abs(iArr[i] - iArr[j]);
                if(max>difference){
                    difference=max;
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println("("+x+","+y+")");
    }
}
