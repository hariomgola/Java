package Java_simple;
/*
As the winter season is nearing Nyx Air Coolers has decided to go for a clearance sale for 4 days.
The number of items and the price for each item is displayed on the board. The price of the unsold items will be reduced by 7% on each day. For example if an item price is Rs.10000 on the first day, then it will cost Rs.9300 for the next day. Again if the items are unsold on the third day then the price goes to Rs.8649 which is 7% of 9300.
Design a program that prompts the user for the name of the item, number of items for sale , number of items sold on each day . Display the name of the item, Price of the item on each day and the number of items available for sale.  Also display the Total amount obtained through the clearance sale.

Note : For price and any amount calculation, use the data type as double and when printing the values, use System.out.printf method.

Example : totalSales = 145428.70
System.out.printf("Total amount of Sales = Rs.%.0f",totalSales);

Sample input 1:
Enter the name of the Item:
Symphony Winter 56 L Air Cooler
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

Sample output 1:

Symphony Winter 56 L Air Cooler
Day No.of items_available Price
Day1 10 10000
Day2 6 9300
Day3 3 8649
Day4 1 8043
Total amount of Sales = Rs.93241

Sample input 2:

Enter the name of the Item:
Bajaj Desert DC 55 DLX 54L 190 W
Enter the price of the item:
8500
Enter the number of items for sale:
4
Enter the number of items sold on Day1:
4

Sample Output 2:

Bajaj Desert DC 55 DLX 54L 190 W
Day No.of items_available Price
Day1 4 8500
Total amount of Sales =Rs.34000

Sample Input 3 :

Enter the name of the Item:
Wardrobe
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

Sample output 3:

Wardrobe
Day No.of items_available Price
Day1 13 12000
Day2 8 11160
Day3 4 10379
Day4 1 9652
Total amount of Sales = Rs.145429
*/import java.util.Scanner;
public class Clearance_Sale{
    public static void main (String[] args) {
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Enter the name of the Item:");
        String item = SC.nextLine();
        System.out.println("Enter the price of the item:");
        double price = SC.nextDouble();
        
        if(price<=0){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("Enter the number of items for sale:");
            int noofItems = SC.nextInt();
            int no_Item = noofItems;
            
            // Days Sale Code start from here
            int d1=0,d2=0,d3=0,d4=0;
            double p1=0,p2=0,p3=0,p4=0;
            System.out.println("Enter the number of items sold on Day1:");
            d1 = SC.nextInt();
            noofItems-=d1;
            
            if(noofItems >0){
                System.out.println("Enter the number of items sold on Day2:");
                d2 = SC.nextInt();
                noofItems-=d2;
                
                if(noofItems >0){
                    System.out.println("Enter the number of items sold on Day3:");
                    d3 = SC.nextInt();
                    noofItems -= d3;
                    
                    if(noofItems >0){
                        System.out.println("Enter the number of items sold on Day4:");
                        d4 = SC.nextInt();
                    }
                }
            }
            noofItems = no_Item;
            if(d2!=0){
                p1 = price - (price*0.07);
                if(d3!=0){
                    p2 = p1 - (p1*0.07);
                    if(d4!=0){
                        p3 = p2 - (p2*0.07);
                    }
                }
            }
            
            System.out.println(item);
            System.out.println("Day No.of items_available Price");
            System.out.println("Day1 "+noofItems+" "+String.format("%.0f",price));
            if(d2!=0)
                System.out.println("Day2 "+(noofItems = noofItems-d1)+" "+String.format("%.0f",p1));
            if(d3!=0)
                System.out.println("Day3 "+(noofItems = noofItems-d2)+" "+String.format("%.0f",p2));
            if(d4!=0)
                System.out.println("Day4 "+(noofItems-d3)+" "+String.format("%.0f",p3));
            
            double total_price = (d1*price)+(d2*p1)+(d3*p2)+(d4*p3);
            System.out.println("Total amount of Sales = Rs."+String.format("%.0f",total_price));
        }
    }
}