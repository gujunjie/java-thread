package project06;



public class Text {
	

	public static void main(String[] args) {
		Account account=new Account();
		
		User user1=new User(account);
		User user2=new User(account);
        
		new Thread(user1).start();
		new Thread(user2).start();
	}



	
}
