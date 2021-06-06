package Java_classesAndObject;
import java.lang.Thread.State;
/*
Hari bank
Hari bank maintains the account details for each customer. The account details are:

a.Account number
b.Type of account
c.Balance amount

Consider the below class:
In the Account class include the given attributes methods and constructor with the access specifiers as specified in the class.
The constructors are used to set the value and the getter methods are used to retrieve the value.
The withdraw method takes the amount to be withdrawn as argument. 
This method should check the balance and detect the withdrawn amount from the balance amount and return 1. 
If there is insufficient balance then return -1.
The deposit method takes the amount to be deposited as argument and adds the deposited amount to the balance amount.
In the Main class, Get the details as shown in the sample input and create an object for the Account class; 
invoke the deposit method to deposit the amount and withdraw method to withdraw the amount from the account.

  Input1 & Output1:
Enter the account number:
1234567890
Enter the available amount in the account:]
15000
Enter the amount to be deposited:
1500
Available balance is:16500.00
Enter the amount to be withdrawn:
500
Available balance is:16000.00

  Input2 & Output2:
Enter the account number:
1234567890
Enter the available amount in the account:
15000
Enter the amount to be deposited:
1500
Available balance is:16500.00
Enter the amount to be withdrawn:
18500
Insufficient balance
Available balance is:16500.00
*/
import java.util.Scanner;
public class HariBank {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the account number:");
        long _accountNumber = SC.nextLong();
        System.out.println("Enter the available amount in the account:");
        double _balanceAmount = SC.nextDouble();

        Account _account = new Account(_accountNumber, _balanceAmount);

        System.out.println("Enter the amount to be deposited:");
        _account.deposit(SC.nextDouble());
        System.out.println("Enter the amount to be withdrw:");
        int status = _account.withdraw(SC.nextDouble());

        if(status<0)
            System.out.println("Insufficient balance");
        System.out.println("Available balance is:"+String.format("%.2f",_account.getBalanceAmount()));
    }   
}
