package Java_classesAndObject;
/*
Travel Details

Create a class Person with the following private member variables
    String name
    char gender
    int age
Include appropriate getters and setters method 
Create a class BusTicket with the following private member variables

    int ticketNo
    float ticketPrice
    float totalAmount
    Person person
Include appropriate getters and setters method 

Write the following method in the BusTicket class
void calculateTotal()—this method should calculate the total and set it based on the discount given below:

For Children whose age is less than 16, give 50% discount
For Senior citizen whose age is greater than or equal to 60 give 25% discount
For Ladies give 10% discount
No discount for remaining category. 
Based on above condition calculate total price. 
Create TestMain class which has main method and do the following input and output process .

To get the input write a method
public static BusTicket getTicketDetails() - Get the inputs relevant to BusTicket in this method and return the BusTicket object.
Call this method in the main method, using the returned object invoke the method calculateTotal and print the output accordingly  

  Input 1:
    Enter the passenger name:
    vivek
    Enter the gender(M or F / m or f):
    M
    Enter the age:
    16
    Enter the ticket no:
    123
    Enter the ticket price:
    100.0

  Output 1
    Ticket no:123
    Passenger Name:vivek
    Price of a ticket : 100.0
    Total Amount : 100.0

  Input 2:
    Enter the passenger name:
    Priya
    Enter the gender(M or F / m or f):
    F
    Enter the age:
    61
    Enter the ticket no:
    140
    Enter the ticket price:
    500.0

  Output 1
    Ticket no:140
    Passenger Name:Priya
    Price of a ticket : 500.0
    Total Amount : 375.0
*/
import java.util.Scanner;
public class Traveldetails {
    public static void main(String[] args) {
        BusTicket _busTicket = getTicketDetails();
        Person _person = _busTicket.getPerson();
        _busTicket.calculateTotal();

        // PRinting output
        System.out.println("Ticket no:"+ _busTicket.getTiketNo());
        System.out.println("Passenger Name:"+ _person.getName());
        System.out.println("Price of a ticket : "+ _busTicket.getTicketPrice());
        System.out.println("Total Amount : "+ _busTicket.getTotalAmount());
    }
    public static BusTicket getTicketDetails(){
        Scanner SC = new Scanner(System.in);
        BusTicket _busTicket = new BusTicket();
        Person _person = new Person();
        
        System.out.println("Enter the passenger name:");
        _person.setName(SC.nextLine());
        System.out.println("Enter the gender(M or F / m or f):");
        _person.setGender(SC.next().charAt(0));
        System.out.println("Enter the age:");
        _person.setAge(SC.nextInt());
        System.out.println("Enter the ticket no:");
        _busTicket.setTicketNo(SC.nextInt());
        System.out.println("Enter the ticket price:");
        _busTicket.setTicketPrice(SC.nextFloat());

        _busTicket.setPerson(_person);
        return _busTicket;
    }
}
