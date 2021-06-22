/**
Display Date
Write a program to display the date as given below.

1st January 2019
The program should prompt the user to enter the date as three integer values for the day followed by the month 
and the year and produces an output date as shown in the sample output.
The program should print the correct superscripts “th”, “nd”, “st”, and “rd” to the day value. Assume you give valid date.
[Note: 1st, 2nd, 3rd, 4th; and then 11th, 12th, 13th, 14th; and 21st, 22nd, 23rd, and 24th.]

  Input
    Enter 3 integers for the day of the month, month and year
    23
    4
    1989

  Output
    23rd April 1989
*/
import java.util.*;
public class displayDate {
    public static void main(String [] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter 3 integers for the day of the month, month and year");
        int day = SC.nextInt();
        int month= SC.nextInt();
        int year = SC.nextInt();
        String Month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        
        String temp;
        if(day>=11 && day<=20)
            temp="th";
        else if(day%10==1)
            temp="st";
        else if(day%10==2)
            temp="nd";
        else if(day%10==3)
            temp="rd";
        else
            temp="th";
        
        System.out.println(day+temp+" "+Month[month-1]+" "+year);
    }
}
