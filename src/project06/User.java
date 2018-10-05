package project06;

public class User implements Runnable{
	private Account account;
	
	public User(Account account)
	{
		this.account=account;
	}
	
	@Override
	public void run() {	
		for(int i=0;i<6;i++)
		{
			account.add();
		}
	}
	

}
