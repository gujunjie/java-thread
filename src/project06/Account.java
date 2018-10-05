package project06;

public class Account {
	
	private double balance=0;
	
    public synchronized void add()
    {   
    		balance+=1000;
    		System.out.println(Thread.currentThread().getName()+" "+balance);
    }
    
}
