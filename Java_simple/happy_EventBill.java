package Java_simple;
/*
Happy Events bill generation
Happy Events is an event management company who are specialists in conducting birthday parties for its customers.
They charge for their services as below.
The charge per person is Rs.350.
Depending upon the number of guest they charge an additional fee.
Number of guests Extra charge
Below 50: nil
50-99: 12% from total amount
100-149: 15% from total amoun
150- 200: 18% from total amount
If the number of guest goes beyond 200, a separate plan is available.
Create a program to accept the number of guests and display the bill as given in the sample format
Note : The Total Amount should be of float data type and when displaying display with no decimal value.

Sample input 1
Enter the name of the customer
Samson
Enter the date
12/02/2019
Enter the number of guests
65
Sample output 1
Happy Events
Name of the customer: Samson
Date of the event: 12/02/2019
No. of guests: 65
Total Amount: Rs.25480

Sample input 2
Enter the name of the customer
Samson
Enter the date
12/02/201
Enter the number of guests
250
Sample output 2
Check for a separate plan
*/
import java.util.Scanner;
public class happy_EventBill {
    public static void main (String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the name of the customer");
        String name = SC.nextLine();
        System.out.println("Enter the date");
        String date = SC.nextLine();
        System.out.println("Enter the number of guests");
        int guest = SC.nextInt();
        
        if(guest>200)
            System.out.println("Check for a separate plan");
        else{
            float amount = guest*350;
            if(guest>=50 && guest<100)
                amount += amount*0.12;
            if(guest>100 && guest<150)
                amount += amount*0.15;
            if(guest>150 && guest<=200)
                amount += amount*0.18;
                
            System.out.println("Happy Events");
            System.out.println("Name of the customer: "+name);
            System.out.println("Date of the event: "+date);
            System.out.println("No. of guests: "+guest);
            System.out.println("Total Amount: Rs."+String.format("%.0f",amount));
        }
    }
}
