package Java_simpleprogram;
/*
Hari bought a Bamboo tree sapling to grow in his garden and it was 3 feet tall when he planted. 
To his surprise he finds that every year the bamboo tree grows double its current height.
How many years will it take for the bamboo tree to reach  a  height of  X feet.
Note : Bamboo tree can't grow more than 10000 feet

    Sample input 1
    768
    Sample output 1
    It will take 8 years for the Bamboo tree to reach a height 768 feet.

    Sample input 2
    500
    Sample output 2
    Invalid Input

    Sample input 3
    -100
    Sample output 3
    Bamboo height cannot be negative

    Sample input 4
    0
    Sample output 4
    Bamboo height cannot be zero

    Sample input 5
    25000
    Sample output 5
    Bamboo cannot grow more than 10000 feet
*/
import java.util.Scanner;
public class bamboo_tree {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);

        int height = SC.nextInt();
        int year=0;

        if(height>0 && height<10000){
            int temp_height = 3;
            int temp=0;
            while(temp_height<height){
                temp = 2*temp_height;
                ++year;
                temp_height = temp;
            }
            if(temp_height==height){
                System.out.println("It will take "+year+" years for the Bamboo tree to reach a height "+height+" feet.");
            }else{
                System.out.println("Invalid Input");
            }
        }
        else{
            if(height==0)
                System.out.println("Bamboo height cannot be zero");
            else if(height>9999)
                System.out.println("Bamboo cannot grow more than 10000 feet");
            else
                System.out.println("Bamboo height cannot be nagative");
        }
    }
}
