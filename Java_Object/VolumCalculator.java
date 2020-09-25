package Java_Object;
public class VolumCalculator 
{
	public double calculateVolume(double radius,double height)
	{
		double result =3.14*radius*radius*height;
		return result;
	}
	public double calculateVolume(int length,int breath , int height)
	{
		double result=length*breath*height;
		return result;
	}

}
