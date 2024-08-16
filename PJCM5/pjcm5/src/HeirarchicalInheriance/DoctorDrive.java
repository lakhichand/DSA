package HeirarchicalInheriance;

public class DoctorDrive {
	
	public static void main(String[] args) {
		
		Doctor d1 = new Doctor("XYZ", "CS", "new pune hosppital", "8-8",
                               145789632l, 600, 3);
		
		d1.displayDoctor();
		
		 System.out.println("==============");
		 
		//d1.dispalyDentist();   //CTE
		
		Dentist d2 = new Dentist("Dentist", "MBBS", 1456987l, 1000, "8-8", 
				                 "Govind Smile Care", 3, "MD", "TEETH");
		
		d2.displayDoctor();
		
		System.out.println("================");
		
		d2.displayDenist();
		
		
		
		
		
		
		
		
		
		
		

		            //UP CASTING           DOwn  CASTING
		
       	//Doctor d1 = new Doctor("XYZ","MBBS", "New Pune Hospital", "8-5",
				//123854796l, 100, 1);
		
		//d1.displayDoctor();
		//System.out.println("==========");
		
		//Doctor d2 = new Dentist("Govind","MBBS", 1456238l, 500, "8-8", 
			//	"Govind Smile Care", 5, "MD", "Teeth");               //UP CASTING
		
   	    //d2.displayDoctor();
		//System.out.println("===========");
		
		//d2.displayDentist();                                       //CTE
		
		//Dentist d3 = (Dentist) d2;                                   //DOWN CASTING
	
		//d3.displayDenist();
		//System.out.println("===========");
		
	    //d3.displayDoctor();
		//System.out.println("============");
		
		//Doctor d4 = new neurologist();
		
		//d4.displayDoctor();
		//System.out.println("============");
		
		//d4.displayneurologist;                                      //CTE
		
		//neurologist n1 = (neurologist)d4;
		
		//n1.displayDoctor();
		//System.out.println("============");
		
		//n1.displayNeurologist();
		
		
		
		
		
		
		
		// CLASS CAST EXCEPTION
		
		//Doctor d1 = new doctor();
		
	//	orthopedic o1 = (orthopedic)d1;   //ClassCastException
		
		
		//o1.displayOrthopedic();
		
		//o1.displayDoctor();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
