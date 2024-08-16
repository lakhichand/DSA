package Interface;

public interface Whatsapp {
	
	void messageSender(String ip);
	
	void audioSender();
	
	void emojiSender();
	
	void photosSender();
	
	
	
	void messageRecevier(String ip);
	
	void audioRecevier();
	
	void emojiRecevier();
	
	void photosRecevier();
	
	
	void status(String st);
	

}
