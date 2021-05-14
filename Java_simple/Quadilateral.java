package Java_simple;
/*
Quadrilaterals
During the activity time grade 3 students were given four sticks and are asked to form a shape and place it on the desk. The teacher will measure one internal angle, and tell the students what shape they have formed with the given sticks.

Write a program to get the input for the length of the stick and the internal angle.  Based on the input, specify whether it is a square, rectangle, rhombus ,parallelogram, or irregular quadrilateral.

Assume sides given as input are sq,s2,s3,s4.

If s1=s2=s3=s4 and the angle is 90, the shape is square

If s1=s2 and s3=s4 and the angle is 90, the shape is rectangle.

If s1=s2=s3=s4 and the angle is not  90, the shape is rhombus.

If s1=s2 and s3=s4 and the angle is not 90, the shape is parallelogram.

If none of the above conditions are true, the shape is  irregular quadrilateral.

The output should be  "It’s a <<shape>>"

Sample input

Enter the length of the four sticks in cm

12

12

12

12

Enter one internal angle

90

Sample output

It’s a square
*/
import java.util.Scanner;
public class Quadilateral {
    public static void main (String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the length of the four sticks in cm");
        int l1 = SC.nextInt();
        int l2 = SC.nextInt();
        int l3 = SC.nextInt();
        int l4 = SC.nextInt();
        System.out.println("Enter one internal angle");
        int angle = SC.nextInt();
        
        if(l1==l2 && l2==l3 && l3==l4 && l4==l1){
            if(angle==90)
                System.out.println("It's a square");
            else
                System.out.println("It's a rhombus");
        }
        else if(l1==l2 && l3==l4){
            if(angle==90)
                System.out.println("It's a rectangle");
            else
                System.out.println("It's a parallelogram");
        }
        else
            System.out.println("It's a irregular quadrilateral");
    }
}
