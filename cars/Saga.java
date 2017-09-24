package cars;
import java.util.Scanner;

interface MySaga
{
   public void saga1();
   public void saga2();
   public void saga3();
   public void saga4();
   public void saga5();
}

public class Saga extends Cars implements MySaga
{
	int p = 140;		//rent price for saga
	public Saga()
	{
		this.price =p;
	}
	public void showBalanceCars()
	{
		System.out.println("\n\n Total Car Balance :: " + getBalanceCars());
	}
	public void getSagaCarList()
	{		
		System.out.println("\n| NO \t\t:: 1");
		System.out.println("| CAR \t\t:: SAGA ");
		System.out.println("| CAR PLATE \t:: DCK2152");
		System.out.println("| CAR COLOR \t:: RED");
		System.out.println("\n---------------------------------");
		System.out.println("\n| NO \t\t:: 2");
		System.out.println("| CAR \t\t:: SAGA");
		System.out.println("| CAR PLATE \t:: DCL2232");
		System.out.println("| CAR COLOR \t:: BROWN");
		System.out.println("\n---------------------------------");
		System.out.println("\n| NO \t\t:: 3");
		System.out.println("| CAR \t\t:: SAGA");
		System.out.println("| CAR PLATE \t:: DCC2734");
		System.out.println("| CAR COLOR \t:: YELLOW");
		System.out.println("\n---------------------------------");
		System.out.println("\n| NO \t\t:: 4");
		System.out.println("| CAR \t\t:: SAGA");
		System.out.println("| CAR PLATE \t:: WLC2423");
		System.out.println("| CAR COLOR \t:: GREEN");
		System.out.println("\n---------------------------------");			
		System.out.println("\n| NO \t\t:: 5");
		System.out.println("| CAR \t\t:: SAGA");
		System.out.println("| CAR PLATE \t:: WVQ4523");
		System.out.println("| CAR COLOR \t:: WHITE");
		System.out.println("\n---------------------------------");
	}	
	public void setrentPrice(int d)
	{	
	this.day=d;
	totalPrice = price*day;	
	}
	public int getrentPrice()
	{
		return totalPrice;
	}
	public void saga1()
	{
		System.out.println("\n-----------------------------\n|  *********Selected Car*******\n-----------------------------");
		System.out.println("\n| CAR \t\t:: SAGA ");
		System.out.println("| CAR PLATE \t:: DCK2152");
		System.out.println("| CAR COLOR \t:: RED");
		System.out.println("\nBalance Of Saga \t:: " + getBalanceSaga());	
	}
	public void saga2()
	{
		System.out.println("\n-----------------------------\n|  *********Selected Car*******\n-----------------------------");	
		System.out.println("\n| CAR \t\t:: SAGA");
		System.out.println("| CAR PLATE \t:: DCL2232");
		System.out.println("| CAR COLOR \t:: BROWN");	
		System.out.println("\nBalance Of Saga \t:: " + getBalanceSaga());
	}
	public void saga3()
	{
		System.out.println("\n-----------------------------\n|  *********Selected Car*******\n-----------------------------");	
		System.out.println("\n| CAR \t\t:: SAGA");
		System.out.println("| CAR PLATE \t:: DCC2734");
		System.out.println("| CAR COLOR \t:: YELLOW");	
		System.out.println("\nBalance Of Saga \t:: " + getBalanceSaga());
	}
	public void saga4()
	{
		System.out.println("\n-----------------------------\n|  *********Selected Car*******\n-----------------------------");	
		System.out.println("\n| CAR \t\t:: SAGA");
		System.out.println("| CAR PLATE \t:: WLC2423");
		System.out.println("| CAR COLOR \t:: GREEN");	
		System.out.println("\nBalance Of Saga \t:: " + getBalanceSaga());
	}
	public void saga5()
	{
		System.out.println("\n-----------------------------\n|  *********Selected Car*******\n-----------------------------");	
		System.out.println("\n| CAR \t\t:: SAGA");
		System.out.println("| CAR PLATE \t:: WVQ4523");
		System.out.println("| CAR COLOR \t:: WHITE");	
		System.out.println("\nBalance Of Saga \t:: " + getBalanceSaga());
	}
}