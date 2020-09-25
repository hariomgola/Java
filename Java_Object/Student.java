package Java_Object;
public class Student 
{
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	
	public Student(int studentId,String studentName,String studentAddress)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
		this.collegeName="NIT";
	}
	public Student(int studentId,String studentName,String studentAddress,String collegeName)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
		this.collegeName=collegeName;
	}
	public int getStudentId()
	{
		return studentId;
	}
	public void setStudentId(int _studentId)
	{
		this.studentId=_studentId;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	public void setStudentName(String _studentName)
	{
		this.studentName=_studentName;
	}
	
	public String getStudentAddress()
	{
		return studentAddress;
	}
	public void setStudentAddress(String _studentAddress)
	{
		this.studentAddress=_studentAddress;
	}
	
	public String getCollegeName()
	{
		return collegeName;
	}
	public void setCollegeName(String _collegeName)
	{
		this.collegeName=_collegeName;
	}
	
}
