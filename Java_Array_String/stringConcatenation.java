package Java_Array_String;
/**
String Concatenation
The authority of XYZ gated residential colony wants its residents' name datum Should be stored in the following format 
- residents' name <space> his/her father's name. Write a program to concat the father's name to the residents' name. 
The name should be validated,on validation the name should contain only alphabets and space is allowed. 
If the name is not valid display the message "Invalid name". If valid string then convert  it to uppercase and print it.. 


Sample Input 1:
Inmate's name:Aron
Inmate's father's name:Terby
Sample Output 1:
ARON TERBY

Sample Input 2:
Inmate's name:Mary Anto
Inmate's father's name:Jose
Sample Output 2:
MARY ANTO JOSE

Sample Input 3:
Inmate's name:Dev12
Inmate's father's name:Terby
Sample Output 3:
Invalid name
 */
import java.util.*;
public class stringConcatenation 
{
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("Inmate's name:");
		String str1 = SC.nextLine();
		System.out.println("Inmate's father's name:");
		String str2=SC.nextLine();
		
		if(str1.matches("^[a-zA-Z ]*$") && str2.matches("^[a-zA-Z ]*$"))
		{
			String name = str1.concat(" ").concat(str2).toUpperCase();
			System.out.println(name);
		}
		else
			System.out.println("Invalid name");
	}

}
