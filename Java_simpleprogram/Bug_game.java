package Java_simpleprogram;
/*
Aryan and Daksh are classmates who just started learning numbers. 
They both decided to play a game with what they learnt. 
Jamie will start saying number 1 and Leo should say 2 and again Jamie says 3.
In the same  manner both will alternatively spell the consecutive number. 
But if number 5 or a multiple of five comes , they should say “Bus/ bUs/ buS” instead of the number as per the sample output.

Write a program to display the numbers and word they spell.

The input to the program is the highest number,that ends the game

  Input
    21
  Output
    1 2 3 4 Bus 6 7 8 9 bUs 11 12 13 14 buS 16 17 18 19 Bus 21
*/
import java.util.Scanner;
public class Bug_game {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();

        int counter = 1;
        for(int i=1;i<=num;i++){
            if(i%5==0){
                if(counter==1)
                    System.out.print("Bus ");
                if(counter==2)
                    System.out.print("bUs ");
                if(counter==3){
                    System.out.print("buS ");
                    counter =0;
                }
                counter+=1;
            }
            else
                System.out.print(i+" ");
        }
    }
}
