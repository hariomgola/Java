package Java_classesAndObject;
/*
Token Automation in Bank
In a bank when a customer approaches for a service, they are provided with a unique token number
Depending on the service required the customer will be routed to the corresponding counter.
So when a customer arrives they will be provided with the token which will have the token number and counter number. 
The counter number for the services provided is shown below: 

    Service Name            Counter Number
    Deposit                     3
    Withdraw                    2
    Cheque deposit              1
    Others                      4

    The token number given to the first customer is 1 and the token number given to the second customer is 2 and 
the sequence follows. 

For example: When the first customer approaches the bank for deposit service, 
the token no will 1 and counter number will be 3.

Develop a java application to automate the above task.

Consider the below class:
In the Token class include the given attributes methods and 
constructor with the access specifiers as specified in the class diagram.
The constructors are used to initialize the service type and set the counter number based on the service type and 
set the token number.

[Note: For the first customer when we create a token the token number should be 1, 
for the next customer when we create a token the token number should be 2]
In the Main class, Get the details as shown in the sample input and create an object for the Token class; 
invoke the appropriate methods to get the results as shown in the sample output.

  Input 1 and Output1:
Enter the service type for first customer:
Others
Your Token number is:1 and Counter number is:4
Enter the service type for next customer:
Deposit
Your Token number is:2 and Counter number is:3
*/
import java.util.Scanner;
public class TokenAutomation {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        for(int i=0;i<2;i++){
            if(i==0)
                System.out.println("Enter the service type for first customer:");
            else
                System.out.println("Enter the service type for next customer:");
            String _type = SC.nextLine();
            // Creating Object of Token class
            Token _token = new Token(_type);

            System.out.print("Your Token number is:"+ _token.getTokenNumber());
            System.out.println(" and Counter number is:"+ _token.getCounterNumber());
        }
    }    
}
