package Java_simpleprogram;
/*
Develop a program to calulate movie Ticket price for Below Schenerio.
  There is a discount scheme announced where
    Case - 1
        10% Discount on Bulk Booking on more than 20 Tickets
    Case - 2
        2% Discount When Special Code is Submitted.

    Cost
        - King Class Ticket cost Rs 75/-
        - Queen Class Ticket cost Rs 150/-
        - Refreshment is Additional for Cost Rs 50/-

    Condition
        - Ticket Only booked min-5 and max-40 at a time Otherwise Show Below Text
        - "Please Book Minimum of 5 and Maximum of 40 Tickets"
        - If circle Given is Not 'k' or 'q' display "Invalid Circle Input".
        - Ticket value should be printed exactly in 2 decimal place.

    
    Input 1:
        Enter the no of ticket:35
        Do you want refreshment:y
        Do you have coupon code:y
        Enter the circle:k
    Output 1:
        Ticket cost:4065.25

    Input 2:
        Enter the no of ticket:1
    Output 2:
        Please Book Minimum of 5 and Maximum of 40 Tickets
*/
import java.util.Scanner;
public class movieTicket_Calculator {
    public static void main(String[] args){
        double total_cost=0,r_cost=0,Final_price=0;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        int ticket = SC.nextInt();

        if(ticket<5 || ticket>40){
            System.out.println("Please Book Minimum of 5 and Maximum of 40 Tickets");
        }
        else{
            System.out.println("Do you want refreshment:");
            char r_f = SC.next().charAt(0);
            System.out.println("Do you have coupon code:");
            char coupon = SC.next().charAt(0);
            System.out.println("Enter the circle");
            char circle = SC.next().charAt(0);

            if(circle!= 'k' && circle !='q' && circle!='K' && circle!='Q'){
                System.out.println("Invalid Circle Input");
            }
            else{
                // Ticket Cost Calculation Section
                if(circle=='k' || circle == 'K'){
                    total_cost = ticket*75;
                }
                if(circle=='q' || circle == 'Q'){
                    total_cost = ticket*150;
                }
                if(r_f == 'y' || r_f =='Y'){
                    r_cost = ticket*50;
                }

                // Discount in Cost Section
                if(ticket>20){
                    total_cost = total_cost-(total_cost*0.1);
                }
                if(coupon == 'y' || coupon =='Y'){
                    total_cost = total_cost-(total_cost*0.02);
                }

                // Total Cost Section
                Final_price = total_cost+r_cost;
                System.out.println("Ticket cost:"+String.format("%.2f",Final_price));
            }
        }
    }
}
