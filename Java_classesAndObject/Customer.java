package Java_classesAndObject;
public class Customer{
    private String customerName;
    private long contactNumber;
    private String emailId;
    private int age;

    // get method
    public String getCustomerName(){
        return customerName;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public String getEmailId(){
        return emailId;
    }
    public int getAge(){
        return age;
    }

    // set method
    public void setCustomerName(String _customerName){
        this.customerName = _customerName;
    }
    public void setContactNumber(long _contactNumber){
        this.contactNumber = _contactNumber;
    }
    public void setEmailId(String _emailId){
        this.emailId = _emailId;
    }
    public void setAge(int _age){
        this.age = _age;
    }
    
}