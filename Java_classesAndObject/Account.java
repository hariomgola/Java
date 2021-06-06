package Java_classesAndObject;

public class Account {
    private long accountNumber;
    private double balanceAccount;

    public Account(long _ac,double _balance){
        this.accountNumber = _ac;
        this.balanceAccount = _balance;
    }

    public int withdraw(double _amount){
        if(balanceAccount>=_amount){
            this.balanceAccount-= _amount;
            return 1;
        }
        else
            return -1;
    }

    public void deposit(double _amount){
        this.balanceAccount += _amount;
        System.out.println("Available balance is:"+ String.format("%.2f",balanceAccount));
    }

    public double getBalanceAmount(){
        return balanceAccount;
    }
}
