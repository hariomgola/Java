/*
Marathon Data Analysis (2D Array Example)

David and his three friends namely Charles, Antony and Leo decided to go for week long marathon.
Each day they recorded the distance covered by them individually in kilo meters. 
At the end of the week they have planned to meet and share their data and discuss on it.

Write a program to analyze the data recorded by them.
The Program should store their names in a single dimensional array and the distance covered by each of them for 
each day should be stored in a parallel 2 dimensional array of 4 rows and 7 columns.

Create a the following functions
A function that calculates the total distance covered by each runner.
A function that calculates the average distance covered on each day.
A function to display the output .

  Input:
    Enter the number of Kilometers covered by the runners for each day of the week  Use the data type as double.
    Note that the input consist of 28 values in double. Declare an array according to the problem statement and get the input

  Output
    Average distance covered on each day. (Correct to 2 decimal places)
    Total Distance covered by each participant  (Correct to 2 decimal places)
    To print the output correct to 2 decimal places, use System.out.printf.

  Input
    10 15 20 14 15 15 16
    12 23 12 10 9 8 10
    9 8 6 7 8 9 10
    15 12 13 11 10 12 13

  Output
    Total Distance covered by each participant:
    David 105 kms 
    Charles 84 kms
    Antony 57 kms
    Leo 86 kms
    Average distance covered on each day:
    Day1:11.50 kms
    Day2:14.50 kms
    Day3:12.75 kms
    Day4:10.50 kms
    Day5:10.50 kms
    Day6:11.00 kms
    Day7:12.25 kms
*/
import java.text.DecimalFormat;
import java.util.*;
public class marathon {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String name[] = {
            "David",
            "Charles",
            "Antony",
            "Leo"
        };

        double a[][] = new double[4][7];

        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++)
                a[i][j] = SC.nextDouble();
        }

        double b[] = totaldistance(a);
        double d[] = averagedistance(a);

        display(b, d, name);
    }
    //Helper function
    public static double[] totaldistance(double[][] a){
        double b[] = new double[4];
        double sum;
        for(int i=0;i<4;i++){
            sum=0;
            for(int j=0;j<7;j++)
                sum += a[i][j];
            b[i]=sum;
        }

        return b;
    }
    //Helper function
    public static double[] averagedistance(double[][] a){
        double d[] = new double[7];
        double sum;
        for(int  i=0;i<7;i++){
            sum=0;
            for(int j=0;j<4;j++)
                sum += a[j][i];
            d[i] = sum/4;
        }

        return d;
    }
    //Helper function for printing value
    public static void display(double[] b,double[] d,String[] name){
        DecimalFormat _df = new DecimalFormat("0.00");
        System.out.println("Total Distance covered by each participant:");
            for(int i=0;i<4;i++)
                System.out.printf("%s %.0f kms\n",name[i],b[i]);
        System.out.println("Average distance covered on each day:");
            for(int i=0;i<7;i++)
                System.out.println("Day"+(i+1)+" : "+ _df.format(d[i]) + " Kms");
    }
}
