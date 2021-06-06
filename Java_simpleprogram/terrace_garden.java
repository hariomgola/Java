package Java_simpleprogram;
/*
Write a program to calculate how many pot we can put on terrace on behalf of given Input.

    Explanation : Square root(800)/(diameter of the pot) *12
    Square root of area 800=28.28
    No of pots=(28.28)/12*12=28

    - If area or diameter is zero or negative display "Invalid Input". 
    - If diameter greater than area display "Invalid Input".

  Input 1:
    Enter the area of terrace
    800
    Enter the diameter of the pot
    12
  Output 1:
    28

  Input 2:
    Enter the area of terrace
    -400
  Output 2:
    Invalid Input

  Input 3:
    Enter the area of terrace
    250
    Enter the diameter of the pot
    478
  Output 3:
    Invalid Input

  Input 4:
    Enter the area of terrace
    455
    Enter the diameter of the pot
    -78
  Output 4:
    Invalid Input
*/
import java.util.Scanner;
public class terrace_garden {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the area of terrace");
        int area = SC.nextInt();

        if(area<=0)
            System.out.println("Invaid Input");
        else{
            System.out.println("Enter the diameter of the pot");
            int diameter = SC.nextInt();

            if(diameter<=0 || diameter>area)
                System.out.println("Invalid Input");
            else{
                double root = Math.sqrt(area);
                System.out.println(String.format("%.0f",(root*12)/diameter));
            }
        }
    }
}
