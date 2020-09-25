package Java_Object;
public class Students 
{
	private int id;
	private String name;
	private int [] marks;
	private float average;
	private char grade;
	
	public Students(int _id,String _name,int[] _marks)
	{
		this.id=_id;
		this.name=_name;
		this.marks=_marks;
	}
	
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

	//Array
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
			average=average+marks[i];
		average=(average/marks.length);
	}
	
	public void findGrade()
	{
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<50)
				grade='F';
		}
		if(this.grade!='F' && average>=80 && average<=100)
			grade='O';
		if(this.grade!='F' && average<80 && average>0)
			grade='A';
	}
}
