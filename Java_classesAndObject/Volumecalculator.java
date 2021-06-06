package Java_classesAndObject;

/*
Volume calculator- Over Loading
Sarah got confused to calculate volume of cylinder and cuboid. Write a Java application to help Sarah to do this.

Create a class called VolumeHelperCalculator that has the following methods
double calculateVolume(double radius,double height)
This method calculates the volume of the cylinder using the formula 3.14*radius*radius*height
double calculateVolume(int length,int breadth,int height)
This method calculates the volume of the cuboid using the formula length*breadth*height
Write a TestMain class to test the application.

  Input
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

  Input
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

public class Volumecalculator {
  public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);

    System.out.println("Enter the choice");
    System.out.println("1.Find Volume For Cylinder");
    System.out.println("2.Find Volume For Cuboid");
    int _input = SC.nextInt();

    VolumeHelperCalculator _volume = new VolumeHelperCalculator();

    if(_input == 1){
      System.out.println("Enter the radius");
      double _radius = SC.nextDouble();
      System.out.println("Enter the height");
      double _height = SC.nextDouble();
      System.out.println("Volume of the Cylinder is "+String.format("%.2f",_volume.calculateVolume(_radius,_height)));
    }
    else if(_input ==2){
      System.out.println("Enter the length");
      int length = SC.nextInt();
      System.out.println("Enter the breadth");
      int breadth = SC.nextInt();
      System.out.println("Enter the height");
      int height = SC.nextInt();
      System.out.println("Volume of the Cuboid is "+String.format("%.2f",_volume.calculateVolume(length, breadth, height)));
    }
    else{
      System.out.println("Invalid Input");
    }
  }
}
