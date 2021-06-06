package Java_simpleprogram;
/*
Create a program to check the Quadrilaterals is of which type
Take 4 side from user and one angle in below given example format.
On based of given input,specify whether it is a square, rectangle, rhombus ,parallelogram, or irregular quadrilateral.

Assume sides given as input are x1,x2,x3,x4.

If x1=x2=x3=x4 and the angle is 90, the shape is square
If x1=x3 and x2=x4 and the angle is 90, the shape is rectangle.
If x1=x2=x3=x4 and the angle is not  90, the shape is rhombus.
If x1=x3 and x2=x4 and the angle is not 90, the shape is parallelogram.
If none of the above conditions are true, the shape is  irregular quadrilateral.
The output should be  "It’s a <<shape>>"

  Input
    Enter the length of the four sticks in cm
    12
    12
    12
    12
    Enter one internal angle
    90
  Output
    It’s a square
*/
import java.util.Scanner;
public class quadrilaterals_check {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the length of the four stick in cm");
        int x1 = SC.nextInt();
        int x2 = SC.nextInt();
        int x3 = SC.nextInt();
        int x4 = SC.nextInt();

        System.out.println("Enter one internal angle");
        int angle = SC.nextInt();

        if(x1==x2 && x2==x3 && x3==x4 && x4==x1){
            if(angle==90)
                System.out.println("It's a square");
            else
                System.out.println("It's a rhombus");
        }
        else if(x1==x3 && x2==x4){
            if(angle==90)
                System.out.println("It's a rectangle");
            else
                System.out.println("It's a parallelogram");
        }
        else{
            System.out.println("It's a irregular quadrilateral");
        }
    } 
}
