package Java_Object;
public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	//Creating getter and Setter 
	public int getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeeId(int _employeeId)
	{
		this.employeeId=_employeeId;
	}
	
	public String getEmplyeeName()
	{
		return employeeName;
	}
	public void setEmployeeName(String _employeeName)
	{
		this.employeeName=_employeeName;
	}
	
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double _salary)
	{
		this.salary=_salary;
	}
	
	public double getNetSalary()
	{
		return netSalary;
	}
	public void setNetSalary(double _netSalary)
	{
		this.netSalary=_netSalary;
	}

	public void calculateNetSalary(int pfpercentage)
	{
		double pf;
		pf=(salary-((pfpercentage*salary)/100));
		setNetSalary(pf);
		//this.netSalary=pf;
	}

}
