package Polymorphism;

public class old {

		String name;
		String dp;
		long number;
		String chat;
		
		
		 old() {}
		
	      old(String name,String chat,String dp,long number)
		{
			this.name = name;
			this.dp = dp;
			this.number = number;
			this.chat = chat;
		}
		public void abc()
		{
			System.out.println("at start:"+name);
			System.out.println("saving profile photo:"+ dp);
			System.out.println("whatsapp number:"+number);
			System.out.println("char module:"+chat);
		}

	}
