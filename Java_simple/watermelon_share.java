package Java_simple;
/*
My share of Watermelon
My father bought a whole watermelon and asked me to share with my elder brother. He told that my elder brother will get a share of 75% of the weight of the watermelon and I get a share of 25% of the weight. As we got our shares, there came our friends and hence we decided to share as follows, I will give a 25% of my share and he will give away 75% of his share to our friends which will be divided equally among them.

Now tell me, If my father has bought a watermelon of x Kgs, how much Kgs of watermelon will be received by me, my brother and each of our friends?

Note: 

Both inputs should be Positive, otherwise display "Invalid Input"

Also to print the output correct to 2 decimal places use System.out.printf method.

Eg :  float val=1.7656f;

System.out.printf("%0.2f",val);


Sample input 1

Enter the weight of the watermelon in Kgs:

10

Enter the number of friends:

5

Sample output 1

My share of Watermelon: 1.88Kgs

My brother’s share: 1.88Kgs

Each of our friend’s share: 1.25Kgs



Sample input 2


Enter the weight of the watermelon in Kgs:
7

Enter the number of friends:

14

Sample output 2

My share of Watermelon: 1.31Kgs

My brother's share: 1.31Kgs

Each of our friend's share: 0.31Kgs

Sample input 3

Enter the weight of the watermelon in Kgs:

-5

Enter the number of friends:

0

Sample output 3

Invalid Input
*/
import java.util.Scanner;
public class watermelon_share {
    public static void main (String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the weight of the watermelon in Kgs:");
        int weight = SC.nextInt();
        System.out.println("Enter the number of friends:");
        int friend = SC.nextInt();
        
        if(weight>0 && friend>0){
            double shareF = (weight*0.25) - (weight*0.25*0.25);
            double shareS = (weight*0.75) - (weight*0.75*0.75);
            double share_friend = ((weight*0.25*0.25)+(weight*0.75*0.75))/friend;
            
            System.out.println("My share of Watermelon: "+String.format("%.2f",shareF)+"Kgs");
            System.out.println("My brother's share: "+String.format("%.2f",shareS)+"Kgs");
            System.out.println("Each of our friend's share: "+String.format("%.2f",share_friend)+"Kgs");
        }
        else
            System.out.println("Invalid Input");
    }
}
