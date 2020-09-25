package Java_simple;
/*
Spell Check
Riya’s teacher gave her an assignment to practice the spelling of “RAINBOW”. 
Riya’s mother helped her in doing this by spelling each letter as Riya wrote it in her notebook. 
If Riya writes wrong spelling her mother should say "The spelling is wrong"

Sample Input 1:
Enter the first letter:R
Enter the second letter:A
Enter the third letter:I
Enter the fourth letter:N
Enter the fifth letter:B
Enter the sixth letter:O
Enter the seventh letter:W

Sample Output 1:
RAINBOW

Sample Input 2:
Enter the first letter:R
Enter the second letter:E
Enter the third letter:I
Enter the fourth letter:N
Enter the fifth letter:B
Enter the sixth letter:O
Enter the seventh letter:W

Sample Output 2:
The spelling is wrong
*/
import java.util.Scanner;
public class Spell_Check 
{
	public static void main(String[] args) 
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the first letter:");
		char a=SC.next().charAt(0);
		System.out.println("Enter the second letter:");
		char b=SC.next().charAt(0);
		System.out.println("Enter the third letter:");
		char c=SC.next().charAt(0);
		System.out.println("Enter the forth letter:");
		char d=SC.next().charAt(0);
		System.out.println("Enter the fifth letter:");
		char e=SC.next().charAt(0);
		System.out.println("Enter the sixth letter:");
		char f=SC.next().charAt(0);
		System.out.println("Enter the seventh letter:");
		char g =SC.next().charAt(0);
		
		if(a=='R' && b=='A' && c=='I' && d=='N' && e=='B' && f=='O' && g=='W')
			System.out.println("RAINBOW");
		else
			System.out.println("The spelling is wrong");
		
	}

}
