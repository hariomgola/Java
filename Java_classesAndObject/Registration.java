package Java_classesAndObject;
/*
Apple Shop Registration
In the Apple mobile phone shop, when a customer buys a mobile phone, they need to provide the following details:

    - Customer name
    - Contact number
    - Email id
    - Age
Develop a java application to get the details.
Include get and set method for Above property in Customer.java class

    Sample Input:
    Enter the Name:
    john
    Enter the ContactNumber:
    9874561230
    Enter the EmailId:
    john@gmail.com
    Age:32

    Sample Output:
    Name:john
    ContactNumber:9874561230
    EmailId:john@gmail.com
    Age:32
*/
import java.util.Scanner;
public class Registration{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        Customer _cust = new Customer();

        // Taking inputs from user
        System.out.println("Enter the Name:");
        _cust.setCustomerName(SC.nextLine());
        System.out.println("Enter the ContactNumber:");
        _cust.setContactNumber(SC.nextLong());
        SC.nextLine();
        System.out.println("Enter the EmailId:");
        _cust.setEmailId(SC.nextLine());
        System.out.println("Age:");
        _cust.setAge(SC.nextInt());

        // Priniting Data in console
        System.out.println("Name:"+ _cust.getCustomerName());
        System.out.println("ContactNumber:"+ _cust.getContactNumber());
        System.out.println("EmailId:"+ _cust.getEmailId());
        System.out.println("Age:"+ _cust.getAge());
    }
}
