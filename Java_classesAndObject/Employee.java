package Java_classesAndObject;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;

    // getter
    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public double getSalary(){
        return salary;
    }
    public double getNetSalary(){
        return netSalary;
    }

    //setter
    public void setEmployeeId(int _employeeId){
        this.employeeId = _employeeId;
    }
    public void setEmployeeName(String _employeeName){
        this.employeeName = _employeeName;
    }
    public void setSalary(double _salary){
        this.salary = _salary;
    }
    public void setNetSalary(double _netSalary){
        this.netSalary = _netSalary;
    }

    // functionality method
    public void calculateNetSalary(int pfpercentage){
        this.netSalary = salary - (salary*pfpercentage)/100;
    }
}
