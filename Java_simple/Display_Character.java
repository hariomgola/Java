package Java_simple;
/*
Display Characters or ASCII value

Manoj wants a magic board, which displays a character for a corresponding number for his science exhibition. 
Help him to develop such application. 
For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
[Assume the number of inputs should be always 4 ]
Sample Input 1:
Enter the digits:
65
66
67
68

Sample Output 1:
65-A
66-B
67-C
68-D

Sample Input 2: 
Enter the digits:
115
116
101
112

Sample Output 2:
115-s
116-t
101-e
112-p
*/
import java.util.Scanner;
public class Display_Character 
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		char m,n,o,p;
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter the digits:");
		a=SC.nextInt();
		b=SC.nextInt();
		c=SC.nextInt();
		d=SC.nextInt();
		//Converting int data type into character datatype
		m=(char)a;
		n=(char)b;
		o=(char)c;
		p=(char)d;
		
		System.out.println(a+"-"+m);
		System.out.println(b+"-"+n);
		System.out.println(c+"-"+o);
		System.out.println(d+"-"+p);
		
	}

}
