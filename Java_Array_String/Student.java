package Java_Array_String;

public class Student 
{
	private int id;
	private String name;
	private int [] marks;
	private float average;
	private char grade;
	
	public int getId()
	{
		return id;
	}
	public void setId(int _id)
	{
		this.id=_id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String _name)
	{
		this.name=_name;
	}
	
	public int [] getMarks()
	{
		return marks;
	}
	public void setMarks(int [] _marks)
	{
		this.marks=_marks;
	}
	
	public float getAverage()
	{
		return average;
	}
	public void setAverage(float _average)
	{
		this.average=_average;
	}

	public char getGrade()
	{
		return grade;
	}
	public void setGrade(char _grade)
	{
		this.grade=_grade;
	}
	
	public void calculateAvg()
	{
		for(int i=0;i<marks.length;i++)
			average +=marks[i];
		average /=marks.length;
	}
	public void findGrade()
	{
		boolean flag=true;
		for(int i=0;i<marks.length;i++)
			if(marks[i]<50)
				flag=false;
		if(flag)
		{
			if(average>=80 && average<=100)
				grade='O';
			if(average>=50 && average<=79)
				grade='A';
			if(average<50)
				grade='F';
		}
		else
			grade='F';
	}
}
