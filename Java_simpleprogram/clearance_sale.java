package Java_simpleprogram;
/*
An E-commerce Site on Winter season is decided for a clearnace sale for 4 days.

 Condition
    - The price of Unsold item will reduce 7% on eachday.
    - Design a program as per giver Inputs.
    - Price should be in whole number for calculation Use double or Float as Data type.

  Input 1:
    Enter the name of the Item:
    Dell Laptop 13inch
    Enter the price of the item:
    10000
    Enter the number of items for sale:
    10
    Enter the number of items sold on Day1:
    4
    Enter the number of items sold on Day2:
    3
    Enter the number of items sold on Day3:
    2
    Enter the number of items sold on Day4:
    1

  Output 1:
    Dell Laptop 13inch
    Day No.of items_available Price
    Day1 10 10000
    Day2 6 9300
    Day3 3 8649
    Day4 1 8043
    Total amount of Sales = Rs.93241 // Issue Due to round off 93241 is correct value

  Input 2:
    Enter the name of the Item:
    Iphone 
    Enter the price of the item:
    8500
    Enter the number of items for sale:
    4
    Enter the number of items sold on Day1:
    4

  Output 2:
    Iphone
    Day No.of items_available Price
    Day1 4 8500
    Total amount of Sales =Rs.34000

  Input 3 :
    Enter the name of the Item:
    Samsung
    Enter the price of the item:
    12000
    Enter the number of items for sale:
    13
    Enter the number of items sold on Day1:
    5
    Enter the number of items sold on Day2:
    4
    Enter the number of items sold on Day3:
    3
    Enter the number of items sold on Day4:
    1

  Output 3:
    Samsung
    Day No.of items_available Price
    Day1 13 12000
    Day2 8 11160
    Day3 4 10379
    Day4 1 9652
    Total amount of Sales = Rs.145429
*/
import java.util.Scanner;
public class clearance_sale{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the name of the Itrem:");
        String item = SC.nextLine();
        System.out.println("Enter the price of the item.");
        double price = SC.nextDouble();

        if(price<=0)
            System.out.println("Invalid Input");
        else{
            System.out.println("Enter the number of items for sale:");
            int noofitems = SC.nextInt();
            int no_Item = noofitems;

            // Days Sale Code start from here
            int d1=0,d2=0,d3=0,d4=0;
            double p1=0,p2=0,p3=0,p4=0;
            System.out.println("Enter the number of items sold on Day1:");
            d1=SC.nextInt();
            noofitems -= d1;

            if(noofitems>0){
                System.out.println("Enter the number of items sold on Day2:");
                d2=SC.nextInt();
                noofitems -=d2;

                if(noofitems>0){
                    System.out.println("Enter the number of items sold on Day3:");
                    d3=SC.nextInt();
                    noofitems -=d3;

                    if(noofitems>0){
                        System.out.println("Enter the number of items sold on Day4:");
                        d4=SC.nextInt();
                    }
                }
            }

            noofitems = no_Item;
            if(d2!=0){
                p1 = price - (price*0.07);
                if(d3!=0){
                    p2 = p1 - (p1*0.07);
                    if(d4!=0){
                        p3=p2 - (p2*0.07);
                    }
                }
            }
            System.out.println(item);
            System.out.println("Day No.of items_available Price");
            System.out.println("Day1 "+noofitems+" "+String.format("%.0f", price));
            if(d2!=0)
                System.out.println("Day2 "+(noofitems -= d1)+" "+String.format("%.0f",p1));
            if(d3!=0)
                System.out.println("Day3 "+(noofitems -= d2)+" "+String.format("%.0f",p2));
            if(d3!=0)
                System.out.println("Day4 "+(noofitems - d3)+" "+String.format("%.0f",p3));

            double total_price = (d1*price)+(d2*p1)+(d3*p2)+(d4*p3);
            System.out.println("Total amount of Sales = Rs."+String.format("%.0f",total_price));

        }
    }
}