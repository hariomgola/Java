package Java_Object;
/**
Volume calculator- Over Loading
Sarah got confused to calculate volume of cylinder and cuboid. Write a Java application to help Sarah to do this.
Create a class called VolumeCalculator that has the following methods
double calculateVolume(double radius,double height)
This method calculates the volume of the cylinder using the formula 3.14*radius*radius*height
double calculateVolume(int length,int breadth,int height)
This method calculates the volume of the cuboid using the formula length*breadth*height
Write a TestMain class to test the application.

Sample Input
Enter the choice
1.Find Volume For Cylinder
2.Find Volume For Cuboid
1
Enter the radius
3
Enter the height
2

Output
Volume of the Cylinder is 56.52

Sample Input
Enter the choice
1.Find Volume For Cylinder
2.Find Volume For Cuboid
2
Enter the length
3
Enter the breadth
2
Enter the height
1

Output
Volume of the Cuboid is 6.00
 */
import java.util.Scanner;
public class VolumeCalculator 
{
	public static void main(String[] args) 
	{
		Scanner SC= new Scanner(System.in);
		VolumCalculator VC = new VolumCalculator();
		System.out.println("1.Find volume For Cylinder");
		System.out.println("2.Find volume For Cuboid");
		int i=SC.nextInt();
		if(i==1)
		{
			System.out.println("Enter the radius");
			double radius=SC.nextDouble();
			System.out.println("Enter the height");
			double height=SC.nextDouble();
			double result=VC.calculateVolume(radius, height);
			System.out.println("Volume of the cylinder is "+String.format("%.2f", result));
		}
		if(i==2)
		{
			System.out.println("Enter the length");
			int length=SC.nextInt();
			System.out.println("Enter the breath");
			int breath=SC.nextInt();
			System.out.println("Enter the height");
			int height=SC.nextInt();
			double result=VC.calculateVolume(length,breath, height);
			System.out.println("Volume of the cylinder is "+String.format("%.2f", result));
		}
	}
}
