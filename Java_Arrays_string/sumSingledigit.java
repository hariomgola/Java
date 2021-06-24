/**
Sum of factorial of positive and single digit numbers in an array
Write a java program to find the sum of factorial of the numbers in an array. 
Consider the number for finding the factorial only if it is positive and single digit.  
If not print "No positive and single digit numbers found in an array".
Example if the array is {2,-7,14,-24,41,5} the output should be 122

Sample Input 1:
Enter the size of an array:
5
Enter the elements:
2
-56
-13
6
56
Sample Output 1:
722
 */
import java.util.*;
public class sumSingledigit {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int len = SC.nextInt();

        if(len>0){
            int [] array = new int[len];
            System.out.println("Enter the elements:");
            int count=0;

            for(int i=0;i<array.length;i++){
                array[i]=SC.nextInt();
                if(array[i]>0 && array[i]<9)
                    count+= factor(array[i]);
            }
            if(count>0)
                System.out.println(count);
            else
                System.out.println("No positive and single digit numbers found in an array");
        }
    }

    // helper function
    public static int factor(int length){
        int count =1;
        while(length>1){
            count *= length;
            length--;
        }
        return count;
    }
}
