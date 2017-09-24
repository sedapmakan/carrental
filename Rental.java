import java.util.Scanner;

import customer.*;
import penjamin.*;
import cars.*;
import owner.*;


public class Rental
{
	static String RentalName;
	static String RentalIc;
	static String RentalSex;
	
	public static void main(String[] args)
	{
		System.out.println("\n| ***** Welcome to Pet Management System *****");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n| Please Insert Rental Name :: ");
		RentalName = sc.nextLine();
		
		
		System.out.println("\n| Please Insert Rental Ic :: ");
		RentalIc = sc.nextLine();
		
		
		System.out.println("\n| Please Insert Rental Sex :: ");
		RentalSex = sc.nextLine();
		
		Name nama1 = new Name(RentalName, RentalSex , RentalIc);
		
		//customer cus = new customer(RentalName,RentalIc,RentalSex);
		customer cus = new customer(nama1);
		
		cus.printAll();
		
		
	}
}