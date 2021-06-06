package Java_classesAndObject;

public class BusTicket {
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;

    // getter
    public int getTiketNo(){
        return ticketNo;
    }
    public float getTicketPrice(){
        return ticketPrice;
    }
    public float getTotalAmount(){
        return totalAmount;    
    }
    public Person getPerson(){
        return person;
    }
    // setter
    public void setTicketNo(int _ticketNo){
        this.ticketNo = _ticketNo;
    }
    public void setTicketPrice(float _ticketPrice){
        this.ticketPrice = _ticketPrice;
    }
    public void setTotalAmount(float _totalAmount){
        this.totalAmount = _totalAmount;
    }
    public void setPerson(Person _person){
        this.person = _person;
    }

    // functionality method
    public void calculateTotal(){
        int _age = person.getAge();
        char _gender = person.getGender();
        if(_age<16)
            totalAmount = (float)((double)ticketPrice*0.05);
        else if(_age>=60)
            totalAmount = (float)((double)ticketPrice*0.75);
        else if(_gender=='f'||_gender=='F')
            totalAmount = (float)((double)ticketPrice*0.9);
        else
            totalAmount = ticketPrice;
    }
}
