package Java_simple;
/*
ickets for a Weekend Show
NMS Company celebrates its 20th anniversary as a part of which it buys a certain number of tickets for a weekend show to gift its employees. The tickets are given on first come, first serve basis and until it remains available. The tickets are available at the HR help desk and an employee can ask for a maximum of 3 tickets. If ticket exceeds 3, then display "Maximum of 3 tickets per person" and proceeds until all the tickets are given away.

Write a program that gets the total number of tickets available from the user. (Note: Bulk purchase of tickets is limited to 100). The program should prompt the user for the desired number of tickets and then display the number of remaining tickets, until all the tickets are given away.

Finally it should display the total number of employees who got tickets.

Sample input/output :

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
public class Ticket_weekendShow{
    public static void main (String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the Total number of tickets:");
        int total_ticket = SC.nextInt();
        
        if(total_ticket<=100){
            int counter = 0;
            int ticket = 0;
            while(total_ticket>0){
                System.out.println("Enter the number of tickets u need:");
                ticket = SC.nextInt();
                
                if(ticket>3)
                    System.out.println("Maximum of 3 tickets per person");
                else{
                    total_ticket -= ticket;
                    if(total_ticket<0){
                        System.out.println("Check the ticket availability.");
                        total_ticket += ticket;
                    }
                    else if(total_ticket==0){
                        System.out.println("No more tickets.");
                        ++counter;
                    }
                    else{
                        System.out.println("Tickets Available: "+total_ticket);
                        ++counter;
                    }
                }
            }
            System.out.println("Number of Employees who got the tickets:"+counter);
        }
    }
}