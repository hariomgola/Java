package Java_simpleprogram;
/*
In a party 2 brother bought the chocklate and will share in form of 25% and 75%.
Meanwhile other guest join the party and Both brother decided to share 25% share from 25% and 75% from 75%.
And will distributed equally Amoung the guest create a program for same.
Input from the user is always positive otherwise print Invalid input.

  Input 1
    Enter the Weight of the chocklate in Kgs:
    10
    Enter the number of friends:
    5
  Output 1
    My share of chocklate: 1.88Kgs
    My brother’s share: 1.88Kgs
    Each of our friend’s share: 1.25Kgs

  Input 2
    Enter the weight of the chocklate in Kgs:
    7
    Enter the number of friends:
    14
  Output 2
    My share of chocklate: 1.31Kgs
    My brother's share: 1.31Kgs
    Each of our friend's share: 0.31Kgs

  Input 3
    Enter the weight of the chocklate in Kgs:
    -5
    Enter the number of friends:
    0
  Output 3
    Invalid Input
*/
import java.util.Scanner;
public class drink_share {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the weight of the chocklate in Kgs:");
        int weight = SC.nextInt();
        System.out.println("Enter the number of friend:");
        int friend = SC.nextInt();

        if(weight>0 && friend>0){
            double shareF = (weight*0.25) - (weight*0.25*0.25);
            double shareS = (weight*0.75) - (weight*0.75*0.75);
            double share_friend = ((weight*0.25*0.25)+(weight*0.75*0.75))/friend;

            System.out.println("My share of chocklate: "+String.format("%.2f",shareF)+"Kgs");
            System.out.println("My brother's share: "+String.format("%.2f",shareS)+"Kgs");
            System.out.println("Each of our friend's share: "+String.format("%.2f",share_friend)+"Kgs");
        }
        else
            System.out.println("Invalid Input");
    }  
}
