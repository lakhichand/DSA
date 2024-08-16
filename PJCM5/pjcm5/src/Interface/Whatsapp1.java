package Interface;

public abstract class Whatsapp1 implements Whatsapp {
	
	public void messageSender(String ip)
	{
		System.out.println(ip);
		
		System.out.println("message sent...!");
	}
	
	public void messageRecevier(String ip)
	{
		System.out.println(ip);
		
		System.out.println("message sent");
	}

}
