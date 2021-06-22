/**
Maximum repeated number
In a given array find the maximum value which gets repeated for the maximum number of times. 
If two values get repeated for maximum number of times, then print the largest one.
[Input format: First input refers to the no of elements in the array and the next is the series of elements in the array]

  Input1:
    5
    3
    2
    3
    2
    2

  Output1:
    2

  Input2:

    10
    3
    2
    3
    3
    2
    4
    5
    4
    6
    4

  Output2:
    4
 */
import java.util.*;
public class macrepeactedNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        // Taking input from users
        int len = SC.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++)
            arr[i] = SC.nextInt();

        // Printing output with the help of helper function
        System.out.println(maxNumber(arr));
    }
    //Helper function
    public static int maxNumber(int arr[]){
        Arrays.sort(arr);
        int _arr[] = new int[arr.length];

        int x=1;
        int max =0;
        for(int i=0;i<(arr.length-1);i++){
            if(arr[i] != arr[i+1]){
                _arr[i] = x;
                x=1;
            }
            else
                x += 1;
            // puting maximum value in max variable
            if(x>max)
                max = x;
        }

        _arr[(arr.length-1)] = x;

        int rtn =0;
        for(int i=0;i<_arr.length;i++){
            if(_arr[i] == max)
                rtn = arr[i];
        }

        return rtn;
    }
}
