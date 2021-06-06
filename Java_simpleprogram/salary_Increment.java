package Java_simpleprogram;
/*
Create a Program to calculate the Increment in Salary.
  Condition
    - If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
    - If the appraisal rating is between 3.1 and 4, the increment is  25% of the salary.
    - If the appraisal rating is between 4.1 and 5, the increment is  30% of the salary.
    - If either the salary is 0 or negative  (or) if the appraisal rating is not in the range 1 to 5 (inclusive), 
       print "Invalid Input".

  Input 1 :
    Enter the salary
    8000
    Enter the Performance appraisal rating
    3
  Output  1 :
    8800

  Input  2 :
    Enter the salary
    7500
    Enter the Performance appraisal rating
    4.3
  Output  2 :
    9750

  Input  3 :
    Enter the salary
    -5000
    Enter the Performance appraisal rating
    6
  Output  3 :
    Invalid Input
*/
import java.util.Scanner;
public class salary_Increment {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        double d=0;

        System.out.println("Enter the salary");
        int salary = SC.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        float ra = SC.nextFloat();

        if(salary <=0 || ra<0 || ra>5){
            System.out.println("Invalid Input");
        }
        else{
            if(ra>0 && ra<=3){
                d = salary + (salary*0.1);
            }
            if(ra>3 && ra<=4){
                d = salary + (salary*0.25);
            }
            if(ra>4 && ra<=5){
                d = salary + (salary*0.3);
            }
            System.out.println(String.format("%.0f",d));
        }
    }    
}
