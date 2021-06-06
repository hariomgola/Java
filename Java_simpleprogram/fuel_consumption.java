package Java_simpleprogram;
/*
Write a program to calculate the fuel consumption of your vehicle.
The program should ask the user to enter the quantity of petrol/Diesel to fill up the tank and the distance 
covered by him till the tank goes dry.
Calculate the fuel consumption and display it in the format (liters per 100 kilometers).
Convert the same result to the U.S. style of miles per gallon and display the result. 
If the quantity or distance is zero or negative display "Invalid Input".

[Note: The US approach of fuel consumption calculation (distance / fuel) is the inverse of the European approach 
(fuel / distance ). Also note that 1 kilometer is 0.6214 miles, and 1 liter is 0.2642 gallons.]

  Input 1:
    Enter the no of liters to fill the tank
    20
    Enter the distance covered
    150
  Output 1:
    Liters/100KM
    13.33
    Miles/gallons
    17.64


  Input 2:
    Enter the no of liters to fill the tank
    -45
  Output 2:
    Invalid Input

  Input 3:
    Enter the no of liters to fill the tank
    56
    Enter the distance covered
    -112
  Output 3:
    Invalid Input
*/
import java.util.Scanner;
public class fuel_consumption {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the no of liters to fill the tank");
        double fuel = SC.nextDouble();

        if(fuel<=0)
            System.out.println("Invalid Input");
        else{
            System.out.println("Ente the distance covered");
            double distance = SC.nextDouble();

            if(distance<=0)
                System.out.println("Invalid Input");
            else{
                double _fuel = (fuel/distance)*100;
                double _Mfuel = ((distance*0.6214)/(fuel*0.2642));

                System.out.println("Liters/100km");
                System.out.println(String.format("%.2f", _fuel));
                System.out.println("Miles/gallons");
                System.out.println(String.format("%.2f", _Mfuel));
            }
        }
    }
}
