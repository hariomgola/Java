package Java_simpleprogram;
/*
ABC company want to distribute tickets for Some show to employee.
Tickets will be given on first come first serve basis Util its available and maximum no of ticket given is 3 per Employee.

  Condition:
    - If ticket Asked is more than 3 print "Maximum of 3 tickets per person" and proceed until ticket is finished.
    - Also print the number of tickets Available After Each Employee Ask.
    - See the below pattern and write down the program for same.

  Input/Output :
    Enter the Total number of tickets: 10
    Enter the number of tickets u need: 3
    Tickets Available: 7
    Enter the number of tickets u need: 3
    Tickets Available: 4
    Enter the number of tickets u need: 2
    Tickets Available: 2
    Enter the number of tickets u need: 3
    Check the ticket availability.
    Enter the number of tickets u need: 2
    No more tickets.
    Number of Employees who got the tickets: 4
*/
import java.util.Scanner;
public class tickets_show {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the Total number of tickets u need:");
        int total_ticket = SC.nextInt();

        if(total_ticket>0){
            int counter = 0;
            int ticket =0;
            while(total_ticket>0){
                System.out.println("Enter the number of tickets u need:");
                ticket = SC.nextInt();

                if(ticket>3)
                    System.out.println("Maximum of 3 tickets per person");
                else{
                    total_ticket -= ticket;
                    if(total_ticket<0){
                        System.out.println("Check the availability.");
                        total_ticket +=ticket;
                    }
                    else if(total_ticket ==0){
                        System.out.println("No more tickets.");
                        ++counter;
                    }
                    else{
                        System.out.println("Tikets Available: "+total_ticket);
                        ++counter;
                    }
                }
            }
            System.out.println("Number of Employees who got the tickets:"+counter);
        }
    }
}
