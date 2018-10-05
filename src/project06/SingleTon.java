package project06;

public class SingleTon {
	
	private SingleTon(){}
	
	public static SingleTon instance=null;
	
	public static SingleTon getInstance()
	{   
		
		if(instance==null)
		{
			synchronized (SingleTon.class) {
				if(instance==null)
				{
					instance=new SingleTon();
				}
			}
		}
		
		return instance;
	}

	

	

}
