package Java_Object;
public class Account 
{
	private int accountId;
	private String accountType;
	private int balance;
	
	public int getAccountid()
	{
		return accountId;
	}
	public void setAccountid(int _accountId)
	{
		this.accountId=_accountId;
	}
	
	public String getAccountType()
	{
		return accountType;
	}
	public void setAccountType(String _accountType)
	{
		this.accountType=_accountType;
	}
	
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int _balance)
	{
		this.balance=_balance;
	}
	
	//Logic
	public boolean withdraw(int acc)
	{
		if(balance>=acc)
		{
			System.out.println("Balance amount after withdraw:"+(balance-acc));
			return true;
		}
		else
		{
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
	}
}
