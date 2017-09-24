package customer;

import java.util.Scanner;
import penjamin.*;
import cars.*;
import owner.*;

public class customer
{
	private String customerGrantorName;			/* declare of grantor of object 'penjamin' */
	private String customerGrantorIC;
	private String customerGrantorSex;			
	
	private Name name1;							/* declare composition of object 'Name' */

	public Saga saga = new Saga();				/* declare object 'saga' */
	public Wira wira = new Wira();				/* declare object 'wira' */
	
	public int carSelect;						/* declare car input of choosing car either 'saga' or 'wira'*/
	public int day;

	public int carSelect1;						/* declare car input from car list saga */
	public int carSelect2;						/* declare car input from car list wira */
	
	public int sagaTemp1 = 0;
	public int wiraTemp1 = 0;

	penjamin[] pen = new penjamin[2];			/* declare object penjamin as array size of 2 */
	Scanner sc = new Scanner(System.in);		/* declare object scanner*/
	
	
	public Name getName()
	{
		return name1;
	}

	public customer(Name name1)
	{

		this.name1 = name1;

		String name; String ic; String sex;
		
		System.out.println("\n\n---------------------------------------\n|  *********First Guarantor Details*******\n---------------------------------------");
		System.out.println("\n| Please Full Up Your 1st Guarantor Name :: ");
		name = sc.nextLine();
		
		System.out.println("\n| Please Full Up Your 1st Guarantor IC :: ");
		ic = sc.nextLine();
		
		System.out.println("\n| Please Full Up Your 1st Guarantor Sex :: ");
		sex = sc.nextLine();
		
		pen[0] = new penjamin(name,ic,sex);
		
		
		System.out.println("\n\n---------------------------------------\n|  *********Second Guarantor Details*******\n---------------------------------------");
		
		
		System.out.println("\n| Please Full Up Your 2st Guarantor Name:: ");
		name = sc.nextLine();
		
		System.out.println("\n| Please Full Up Your 2st Guarantor IC:: ");
		ic = sc.nextLine();
		
		System.out.println("\n| Please Full Up Your 2st Guarantor Sex:: ");
		sex = sc.nextLine();
		
		pen[1] = new penjamin(name,ic,sex);

		customerGrantorName = name;
		customerGrantorIC = ic;
		customerGrantorSex = sex;
		
		
		System.out.println("\n\n----------------------------------------------\n|  ****************Day Rent***************\n---------------------------------------------");
		
		System.out.println("\n| How many day :: ");
		Scanner da = new Scanner(System.in);
		day = da.nextInt();
		

		System.out.println("\n\n---------------------------------------------\n|  **************Choose Car Model*************\n--------------------------------------------");
		System.out.println("\n| Please Select Your Car \n| 1::--SAGA--:: \n| 2::--WIRA--:: ");
		carSelect = sc.nextInt();
		if (carSelect == 1)
		{
			System.out.println("\n\n-----------------------------\n|  *******************Choose Car****************\n-----------------------------");
			saga.getSagaCarList();
			saga.setrentPrice(day);  //over
			
			carSelect1 = sc.nextInt();
			if (carSelect1 == 1)
			{
				sagaTemp1 = 1;

			}
			else if (carSelect1 == 2)
			{
				sagaTemp1 = 2;
			}
			else if (carSelect1 == 3)
			{
				sagaTemp1 = 3;
			}
			else if (carSelect1 == 4)
			{
				sagaTemp1 = 4;			
			}
			else if (carSelect1 == 5)
			{
				sagaTemp1 = 5;			
			}	
		}
		
		else if (carSelect == 2)
		{
			System.out.println("\n\n-----------------------------\n|  *********Choose Car*******\n-----------------------------");
			wira.getWiraCarList();
			wira.setrentPrice(day);
			
			carSelect2 = sc.nextInt();
			if (carSelect2 == 1)
			{
				wiraTemp1 = 1;
			}
			else if (carSelect2 == 2)
			{
				wiraTemp1 = 2;			
			}
			else if (carSelect2 == 3)
			{
				wiraTemp1 = 3;
				wira.wira3();
			}
			else if (carSelect2 == 4)
			{
				wiraTemp1 = 4;
				wira.wira4();				
			}
			else if (carSelect2 == 5)
			{
				wiraTemp1 = 5;
				wira.wira5();				
			}
		}		
		else
		{
			System.out.print("Please Select Again....!!!");
		}
	}
	
	public String getRentalName()
	{
		return customerGrantorName;
	}
	
	public String getRentalIc()
	{
		return customerGrantorIC;
	}

	public String getRentalSex()
	{
		return customerGrantorSex;
	}
	
	public void printAll()
	{
		
		String temp = "nd";
		
		System.out.println(name1.toString()); 		//overide
		
		System.out.println("\n\n--------------------------------------------\n|  *********Guarantor*******\n--------------------------------------------");
		
		for(int i = 0 ; i < 2 ; i++)
		{	
		if (i == 0)
		{
			temp = "st";
		}
		else
		{
			temp = "nd";
		}
		System.out.println("\n\n" + (i + 1) + temp + "| Guarantor name \t:: " + pen[i].getName());
		System.out.println(i + 1 + temp + "| Guarantor IC \t:: " + pen[i].getIc());
		System.out.println(i + 1 + temp + "| Guarantor Sex \t:: " + pen[i].getSex());
		
		}
		
			
		//selected car
		if (sagaTemp1 == 1)
		{
			saga.saga1();
		}
		else if (sagaTemp1 == 2)
		{
			saga.saga2();
		}
		else if (sagaTemp1 == 3)
		{
			saga.saga3();
		}
		else if (sagaTemp1 == 4)
		{
			saga.saga4();
		}
		else if (sagaTemp1 == 5)
		{
			saga.saga5();
		}
		if (wiraTemp1 == 1)
		{
			wira.wira1();
		}
		else if (wiraTemp1 == 2)
		{
			wira.wira2();
		}
		else if (wiraTemp1 == 3)
		{
			wira.wira3();
		}	
		else if (wiraTemp1 == 4)
		{
			wira.wira4();
		}
		else if (wiraTemp1 == 5)
		{
			wira.wira5();
		}
	
	System.out.println("\n\n--------------------------------------------\n|  *********Price Need To Pay*******\n---------------------------------------------");	
	if (carSelect == 1)
	{
	System.out.println ("\n| Total  \t\t:: RM" + saga.getrentPrice());
	}
	else 
	{
	System.out.println ("\n| Total \t\t:: RM" + wira.getrentPrice());
	}
	}
}


