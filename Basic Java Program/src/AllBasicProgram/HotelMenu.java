package AllBasicProgram;

import java.util.Scanner;

public class HotelMenu {

public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("+++++++++ gurubramha hotel +++++++++");
		System.out.println("                                  ");
		System.out.println("++++++++++menu cart+++++++++");
		System.out.println("                             ");
		System.out.println("1.veg");
		System.out.println("2.nonveg");
		System.out.println("3.punjabi");
		System.out.println("4.chinese");
		System.out.println("5.starter");
		System.out.println("6.sweets");
		System.out.println("                                        ");
		
		System.out.println("Enter the your option");
		int option = s.nextInt();
		
		switch (option) {
		case 1:{
		System.out.println("1.panner bhaji");
		System.out.println("2.shahi panner");
		System.out.println("3.mutter panner bhaji");
		System.out.println("4.kaju panner mix bhaji");
		System.out.println("5.shev bhaji");
		System.out.println("6.aloo muttor bhaji");
		System.out.println("7.bengal masala bhaji");
		System.out.println("8.mashroom bhaji");
		System.out.println("9.mix veg bhaji");
		System.out.println("10.veg kolhapuri");
		System.out.println("11.malvani special bhaji");
	    System.out.println("                                           ");
		System.out.println("Enter your order");
		int order =s.nextInt();
		System.out.println("your bill !");
		System.out.println("                                ");
		switch (order) {
		case 1:{
			System.out.println("you have to pay 150 for panner bhaji");
			break;
		}
		case 2:{
			System.out.println("you have to pay 170 for shahi panner");
			break;
		}
		case 3:{
			System.out.println("ypu have to pay 160 mutter panner bhaji");
			break;
		}
		case 4:{
			System.out.println("you have to pay 190 for kaju panner panner mix");
			break;
		}
		case 5:{
			System.out.println("you have to pay 90 for shev bhaji");
			break;
		}
		case 6:{
			System.out.println("you have to pay 100 for aloo mutter bhaji");
			break;
		}
		case 7:
		{
			System.out.println("you have to pay 100 for bengal masala bhaji");
			break;
		}
		case 8:{
			System.out.println("you have to pay 200 mashroom bhaji");
			break;
		}
		case 9:{
			System.out.println("you have to pay 120 for mix veg bhaji");
			break;
			
		}
		case 10:{
			System.out.println("you have to pay 150 for veg kolhapuri bhaji");
			break;
			
		}
		case 11:{
			System.out.println("you have to pay 180 malavnai special bhaji");
			break;
		}
		
		}
		break;
		}
		
		case 2:{
			System.out.println("1.kolhapuri mutton");
			System.out.println("2.chicken 365");
			System.out.println("3.chiken kabab");
			System.out.println("4.chicken perifiry");
			System.out.println("5.chicken tandoor");
			System.out.println("6.chicken malai");
			System.out.println("7.chiken leg");
			System.out.println("                                ");
			System.out.println("Enter your order");
			int order2 = s.nextInt();
			System.out.println(" your bill !");
			System.out.println("                                     ");
			
			switch (order2) {
			case 1:{
				System.out.println("you have to pay 200 for kolhapuri mutton");
				break;
			}
			case 2:
			{
				System.out.println("you have to pay 250 for chiken 365");
				break;
			}
			case 3:
			{
				System.out.println("you have to pay 200 for chiken kabab");
				break;
			}
			case 4:
			{
				System.out.println("you have to pay 300 for chicken periferry");
				break;
			}
			case 5:
			{
				System.out.println("you have to pay 250 for chiken tandoor");
				break;
			}
			case 6:
			{
				System.out.println("you have to pay 350 for chiken malai");
			    break;
			}
			case 7:
			{
				System.out.println("you have to pay 300-6 chiken leg");
				break;
			}
		}
            break;
		}
		case 3:
		{
			System.out.println("1.panner koptha");
			System.out.println("2.bhajiri bhakar");
			System.out.println("3.dal chikolya");
			System.out.println("4.dal makhani");
			System.out.println("5.dal dhokari");
			System.out.println("6.punjabi khichadi");
			System.out.println("                            ");
			System.out.println("Enter your order");
			int order3 = s.nextInt();
			System.out.println(" your bill !");
			System.out.println("                                     ");
			
			switch (order3) {
			case 1:
			{
				System.out.println("you should have to pay 250 for panner koptha");
				break;
				
			}
			case 2:
			{
				System.out.println("you should have to pay 100 for bhajiri bhakar");
				break;
			}
			case 3:
			{
				System.out.println("you should have to pay 150 for dal chikoliya");
				break;
				
			}
			case 4:
			{
				System.out.println("you should have to pay 150 for dal makhani");
				break;
			}
			case 5:
			{
				System.out.println("you should have to pay 350 for dal dhikari");
				break;
				
			}
			case 6:
			{
				System.out.println("opu should have to pay 100 for khichadi");
				break;
			}
		}
		break;
		}
		case 4:
		{
			System.out.println("1.fried noodles");
			System.out.println("2.shezhavan noodles");
			System.out.println("3.singapori noodles");
			System.out.println("4.manchurian noodles");
			System.out.println("5.egg noodles");
			System.out.println("6.chicken noodels");
			System.out.println("7.chiken shezhvan noodles");
			System.out.println("8.chiken singapuri noodels");
			System.out.println("9.chiken manchurian noodles");
			System.out.println("10.veg tripple noodles");
			System.out.println("11.tripple egg noodles");
			System.out.println("12.tripple chicken noodles");
			System.out.println("13.veg fried rice");
			System.out.println("14.veg shezhavan rice");
			System.out.println("15.veg singapori rice");
			System.out.println("16.veg mamchurian rice");
			System.out.println("17.egg rice");
			System.out.println("18.chiken rice");
			System.out.println("19.chiken shezhavan rice");
			System.out.println("                                    ");
			System.out.println("Enter the your order");
			int order = s.nextInt();
			System.out.println(" your bill !");
			System.out.println("                                     ");
			
			switch (order) {
			case 1:{
				System.out.println("you have to pay 50 for fried noodles");
				break;
			}
			case 2:
			{
				System.out.println("you have to pay 60 for shezhavn noodles");
				break;
			}
			case 3:
			{
				System.out.println("you have to pay 80 for sinagapori noodles");
				break;
			}
			case 4:
			{
				System.out.println("you have to pay 80 for manchurian noodles");
				break;
			}
			case 5:
			{
				System.out.println("you have to pay 70 for egg noodles");
				break;
			}
			case 6:
			{
				System.out.println("you have to pay 80 for chicken noodles");
				break;
			}
			case 7:
			{
				System.out.println("you have to pay 90 for chicken shezhavan  noodles");
				break;
			}
			case 8 :
			{
				System.out.println("you have to pay 100 for chiken singapori noodles");
				break;
			}
			case 9 :
			{
				System.out.println("you have to pay 80 for chicken manchurian noodles");
				break;
			}
			case 10 :
			{
				System.out.println("you have to pay 120 for veg triple noodles");
				break;
			}
			case 11 :
			{
				System.out.println("you have to pay 130 for egg triple noodles");
				break;
			}
			case 12:
			{
				System.out.println("you have to pay 140 for chicken triple noodles");
				break;
			}
			case 13:
			{
				System.out.println("you have to pay 60 for veg fried rice");
				break;
			}
			case 14:
			{
				System.out.println("you have to pay 70 for veg shezhvan rice");
				break;
			}
			case 15:
			{
				System.out.println("you have to pay 80 for veg singapori rice");
				break;
			}
			case 16:
			{
				System.out.println("you have to pay 80 for veg manchurian rice");
				break;
			}
			case 17:
			{
				System.out.println("you have to pay 70 for egg rice");
				break;
			}
			case 18:
			{
				System.out.println("you have to pay 90 for chicken rice");
				break;
			}
			case 19:
			{
				System.out.println("you have to pay 100 for chiken shezhvan rice");
				break;
			}
			}
				break;
		}
		case 5:{
			System.out.println("1.mendu vada");
			System.out.println("2.pav bhaji");
			System.out.println("3.dosa");
			System.out.println("4.uthhappa");
			System.out.println("5.masala papad");
			System.out.println("6.roasted papad");
			System.out.println("7.sandwich");
			System.out.println("8.patis");
			System.out.println("9.poha");
			System.out.println("10.bhel");
			System.out.println("                                ");
			System.out.println("Enter your order");
			int order = s.nextInt();
			System.out.println(" your bill !");
			System.out.println("                                     ");
			
			switch (order) {
			case 1:
			{
				System.out.println("you have to pay 50 for mendu vada");
				break;
			}
			case 2:
			{
				System.out.println("you have to pay 110 for pav bhaji");
				break;
			}
			case 3:
			{
				System.out.println("you have to pay 50 for dosa");
				break;
			}
			case 4:
			{
				System.out.println("you have to pay 60 for uthappa");
				break;
			}
			case 5:
			{
				System.out.println("you have to pay 25 for masala papad");
				break;
			}
			case 6:
			{
				System.out.println("you have to pay 15 for roasted papad");
				break;
			}
			case 7:
			{
				System.out.println("you have to pay 35 for sandvich");
				break;
			}
			case 8:
			{
				System.out.println("you have to pay 30 for patis");
				break;
			}
			case 9:
			{
				System.out.println("you have to pay 30 for poha");
				break;
			}
			case 10:
			{
				System.out.println("you have to pay 25 for bhel");
				break;
			}
			}	
			break;
		}
		
		case 6:
		{
			System.out.println("1.gulab jamun");
			System.out.println("2.rasmali");
			System.out.println("3.rabadi");
			System.out.println("4.ice cream");
			System.out.println("5.bangali mithai");
			System.out.println("6.rasgula");
			System.out.println("7.mitha pan");
			System.out.println("8.basundi");
			System.out.println("                                          ");
			System.out.println("note -> all prices should be for per plate");
			System.out.println("                                        ");
			System.out.println("Enter your order");
			int order = s.nextInt();
			System.out.println(" your bill !"
					+ ""
					+ "");
			System.out.println("                                     ");
			
			switch (order) {
			case 1:
			{
				System.out.println("you have to pay 50-2 piece for gulab jamun");
				break;
				
			}
			case 2:
			{
				System.out.println("you have to pay 100 for rasmali");
				break;
			}
			case 3:
			{
				System.out.println("you have to pay 120 for rabadi");
				break;
			}
			case 4:
			{
				System.out.println("you ahve to pay 80 for ice cream");
				break;
			}
			case 5:
			{
				System.out.println("you have to pay 50-1 piece for bangali mithai");
				break;
			}
			case 6:
			{
				System.out.println(" you have to pay 60-2 piece for rasguala");
				break;
			}
			case 7:
			{
				System.out.println("you have to pay 30 for mitha pan");
				break;
			}
			case 8:
			{
				System.out.println("you have to pay 90 for basundi");
				break;
			}
			}
				break;
		}
		}
     }
}