package Java_simpleprogram;
/*
Create a Program to calculate gain percentage for selling a scooter.
  Condition
    - If old price or sold price results in zero or negative or repair price is negative,
      then display "Incorrect Inputs" 
    - If  Selling price is not greater than Price of  [old scooter + Repaired amount]  
      display  "Unable to calculate Gain Percentage.Sold in Loss.".  
    - The Gain percentage should be displayed with 2 decimal digits.

  Input 1:
    Price of old scooter:
    4700
    The amount spent for repair:
    800
    Sold Price:
    5800
  Output 1:
    Gain percentage is 5.45

  Input 2:
    Price of old scooter:
    8500
    The amount spent for repair:
    700
    Sold Price:
    5000
  Output 2:
    Unable to calculate Gain Percentage.Sold in Loss.

  Input 3:
    Price of old scooter:
    -15000
    The amount spent for repair:
    450
    Sold Price:
    20000
  Output 3:
    Incorrect Inputs

*/

import java.util.Scanner;
public class Gainpercentage_cal {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        double total_price=0,b_price=0,profit=0;

        System.out.println("Price of old scooter");
        int buy = SC.nextInt();
        System.out.println("The amount spent for repair:");
        int repair = SC.nextInt();
        System.out.println("Sold Price:");
        int sold=SC.nextInt();

        if(buy<0 || repair<0 || sold<0){
            System.out.println("Incorrect Inputs");
        }
        else{
            b_price = buy +repair;
            if(sold<b_price){
                System.out.println("Unable to calculate Gain Percentage.Sold in Loss.");
            }
            else{
                profit = (((sold-b_price)/b_price)*100);
                System.out.println("Gain percentage is "+String.format("%.2f",profit));
            }
        }
    }
}
