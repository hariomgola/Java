package Java_simpleprogram;
/*
Write a Code for Validate the side of traingle.
  Condition
    - If Sides Provided forms a traingle print "Sides form a Triangle."
    - If not print "Sides does not form a Triangle."
    - If any side is zero or less than zero print "Side should be Greater than zero."

  Input 1:
    Enter the value for side1  
    6
    Enter the value for side2   
    4
    Enter the value for side3   
    5
  Output 1:
    Sides form a Triangle

  Input 2:
    Enter the value for side1   
    6
    Enter the value for side2   
    12
    Enter the value for side3   
    5
  Output 2:
    Sides does not form a Triangle
*/
import java.util.Scanner;
public class traingle_Validation {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the value for side1");
        int s1 = SC.nextInt();
        System.out.println("Enter the value for side2");
        int s2 = SC.nextInt();
        System.out.println("Enter the value for side3");
        int s3 = SC.nextInt();

        if(s1<1 || s2<1 || s3<1){
            System.out.println("Side should be Greater than zero.");
        }
        else{
            if((s1+s2)>s3 && (s2+s3)>s1 && (s3+s1)>s2){
                System.out.println("Sides form a Triangle.");
            }
            else{
                System.out.println("Sides does not form a Triangle.");
            }
        }
    }
}
