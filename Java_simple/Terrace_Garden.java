package Java_simple;
/*
Terrace Garden
Hannah is planning to set up a garden in her terrace. 
First she wants to know how many pots can be kept in her terrace before she buys the saplings and seeds.
Help her to set up her terrace garden.
Enter the area of the terrace in square feet and the diameter of the pot in inches.
If area or diameter is zero or negative display "Invalid Input". 
If diameter greater than area display "Invalid Input".

Explanation : Square root(800)/(diameter of the pot) *12
Square root of area 800=28.28
No of pots=(28.28)/12*12=28


Sample Input 1:
Enter the area of terrace
800
Enter the diameter of the pot
1
Sample Output 1:
28

Sample Input 2:
Enter the area of terrac
-400
Sample Output 2:
Invalid Input

Sample Input 3:
Enter the area of terrace
250
Enter the diameter of the pot
478
Sample Output 3:
Invalid Input

Sample Input 4:
Enter the area of terrace
455
Enter the diameter of the pot
-78
Sample Output 4:
Invalid Input
*/
import java.util.*;
public class Terrace_Garden {
    public static void main (String[] args) {
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Enter the area of terrace");
        int area = SC.nextInt();
        if(area<=0)
            System.out.println("Invalid Input");
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
