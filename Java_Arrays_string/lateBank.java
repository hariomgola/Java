/**
Late to bank
In a bank all employees are supposed to check in by 9:30. 
The check in time will be noted in 24 hrs format. 
Help the manager of the bank to find the number of employees who come in late . 
If one person is late display "1 employee is late" or if all the employees are late, display"All employees are late".

[The first input is the number of employees, the second series is the IN time of the employees]

  Input1:
    5
    9:30 8:59 9:31 9:45 8:30
  Output1:
    2 employees are late

  Input2:
    6
    9:30 8:59 9:30 9:30 8:30 8:54

  Output2:
    All employees are on time
 */
import java.util.*;
public class lateBank {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int employee = SC.nextInt();
        String time[] = new String[employee];

        int count=0;
        for(int i=0;i<employee;i++){
            time[i]=SC.next();
            if(time[i].charAt(0)<'9')
                continue;
            else if(time[i].charAt(0)>'9')
                count++;
            else if(time[i].charAt(2)>'3')
                count++;
            else if(time[i].charAt(2) == '3' && time[i].charAt(3)>'0')
                count++;
        }

        if(count == employee)
            System.out.println("All employees are late");
        else if(count==0)
            System.out.println("All employees are on time");
        else if(count==1)
            System.out.println("1 employee is late");
        else
            System.out.println(count+" employee are late");
    }
}
