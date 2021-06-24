/**
Cumulative sum in an array
Raghavi wants to write Java program to find the cumulative sum of the array with a given set of values.
Input consist of integers .If the size of an array is zero or lesser then display the message as "Invalid Range". 
Print the output in the format which is provided in sample output .
Assume maximum size of array is 20,

  Input 1:
    Enter number of elements
    5
    Enter the elements
    2
    3
    5
    7
    1
  Output 1:
    2 5 10 17 18

  Input 2:
    Enter number of elements
    5
    Enter the elements
    2
    3
    -5
    7
    1
  Output 2:
    2 5 0 7 8

  Input 3:
    Enter number of elements
    0
  Output 3:
    Invalid Range
 */
import java.util.*;
public class sumArray {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int len = SC.nextInt();
        if(len>0){
            int count=0;
            int[] array = new int[len];
            System.out.println("Enter the elements");

            for(int i=0;i<array.length;i++)
                array[i]=SC.nextInt();

            for(int i=0;i<array.length;i++){
                count += array[i];
                System.out.print(count+" ");
            }
        }
        else
            System.out.println("Invalid Range");
    }
}
