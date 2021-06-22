/**
Temperature Summary
Every FortnightTimes of India News paper releases a summary of the weather report .
It prints the date and the temperature on that date in three categories.
If the temperature is below or equal to 20 Celsius it comes under cool category, 
if the temperature is between 20 and 30 it falls under the warm and if the temperature is greater than 30 celsius 
then it comes under Dry

Write a program to display the date and its corresponding temperature for each category .
Create a two dimensional array to store the date and its temperature for each category.
Prompt the user to enter the temperature sequentially for 15 days.

  input
    38 40 41 40 37 38 36 35 30 28 27 25 20 18 16

  output
    Dry Temperature

    1    2    3   4   5    6    7   8
    38 40 41 40 37 38 36 35

    Warm Temperature

    9  10 11 12
    30 28 27 25

    Cool Temperature
    13 14 15
    20 18 16
 */
import java.util.*;
public class temperatureSummary {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int iArr[][] = new int[15][2];

        for(int i=0;i<15;i++){
            iArr[i][0] = i+1;
            iArr[i][1] = SC.nextInt();
        }

        int x=0,y=0,z=0;
        for(int i=0;i<15;i++){
            if(iArr[i][1]<=20)
                x++;
            if(iArr[i][1]>20 && iArr[i][1]<=30)
                y++;
            if(iArr[i][1]>30)
                z++;
        }

        int cool[][] = new int[x][2];
        int warm[][] = new int[y][2];
        int dry[][] = new int[z][2];
        x=0;
        y=0;
        z=0;

        for(int i=0;i<15;i++){
            if(iArr[i][1]<=20){
                cool[x][0] = iArr[i][0];
                cool[x++][1] = iArr[i][1];
            }
            if(iArr[i][1]>20 && iArr[i][1]<=30){
                warm[y][0] = iArr[i][0];
                warm[y++][1] = iArr[i][1];
            }
            if(iArr[i][1]>30){
                dry[z][0] = iArr[i][0];
                dry[z++][1] = iArr[i][1];
            }
        }

        // Printing output
        if(z>0){
            System.out.println("Dry Temperature \n");
            for(int i=0;i<z;i++)
                System.out.print(dry[i][0]+" ");
            System.out.println(" ");
            for(int i=0;i<z;i++)
                System.out.print(dry[i][1]+" ");
            System.out.println(" ");
        }

        if(y>0){
            System.out.println("Warm Temperature \n");
            for(int i=0;i<y;i++)
                System.out.print(warm[i][0]+" ");
            System.out.println(" ");
            for(int i=0;i<y;i++)
                System.out.print(warm[i][1]+" ");
            System.out.println(" ");
        }

        if(x>0){
            System.out.println("Cool Temperature \n");
            for(int i=0;i<x;i++)
                System.out.print(cool[i][0]+" ");
            System.out.println(" ");
            for(int i=0;i<x;i++)
                System.out.print(cool[i][1]+" ");
            System.out.println(" ");
        }
    }
}
