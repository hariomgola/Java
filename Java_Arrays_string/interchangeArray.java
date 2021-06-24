/**
Interchange the elements of an array
Write a Java program to interchange the elements of an array with the elements of another array without using the third array.
If the array size differs display "Unable to swap size differs".If the range is lesser or equal to Zero . 
Display "Invalid range "
Assume the maximum size of array is 20

 Input 1:
    Enter the number of elements in the first array :
    3
    Enter the elements in the first array
    1
    2
    3
    Enter the number of elements in the second array :
    3
    Enter the elements in the second array
    4
    5
    6
  Output 1:
    The first array after swapping is :
    4 5 6
    The second array after swapping is :
    1 2 3

  Input 2:
    Enter the number of elements in the first array :
    -3
  Output 2:
    Invalid range

  Input 3:
    Enter the number of elements in the first array :
    3
    Enter the elements in the first array
    1
    2
    3
    Enter the number of elements in the second array :
    2
  Output 3:
    Unable to swap size differs
 */
import java.util.*;
public class interchangeArray {
    public static void main(String[] args){
      Scanner SC = new Scanner(System.in);
      System.out.println("Enter the number of elements in the first array :");
      int lengtha = SC.nextInt();
      if(lengtha>0){
        int[] a = new int[lengtha];
        System.out.println("Enter the elements in the first array :");
        for(int i=0;i<a.length;i++)
          a[i]=SC.nextInt();

        System.out.println("Enter the number of elements in the second array :");
        int lengthb = SC.nextInt();

        if(lengtha>0 && lengthb ==lengtha){
          int [] b = new int[lengthb];
          System.out.println("Enter the elements in the second array :");
          for(int i=0;i<lengthb;i++)
            b[i] = SC.nextInt();

          //Swapping elements of arrays
          for(int i=0;i<a.length;i++){
            a[i] = a[i]+b[i];
            b[i] = a[i]-b[i];
            a[i] = a[i] -b[i];
          }
          /*
          a=5,b=2
          a=5+2=7;   a=7;
          b=7-2=5;   b=5;
          a=7-5=2    a=2;  // Swapping complete 
          */

          // Printing output
          System.out.println("The first array after swapping is :");
          for(int i:a)
            System.out.print(i+" ");
          System.out.println("\nThe second array after swapping is :");
          for(int i:b)
            System.out.print(i+" ");
        }
        else if(lengthb<=0)
          System.out.println("Invalid range");
        else
          System.out.println("Unable to swap size differs");
      }
      else
        System.out.println("Invalid range");
    }
}
