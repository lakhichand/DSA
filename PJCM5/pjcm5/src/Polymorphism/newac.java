package Polymorphism;

public class newac extends old{
	
	String status;
	String vc;
	String ac;
	String pay;
	
	
	newac() {}
	
    newac( String name,String dp,String chat,long number,
    		String vc,String status,String ac,String pay)
    {
    	super(name,chat,dp,number);
    	this.status = status;
    	this.vc = vc;
    	this.ac = ac;
    	this.pay = pay;
    }
    
    public void abc2()
    {
    	abc();
    	System.out.println("status can update:"+status);
    	System.out.println("video call can do:"+vc);
    	System.out.println("audio call can do:"+ac);
    	System.out.println("payment gateway:"+pay);    	
    }

}
