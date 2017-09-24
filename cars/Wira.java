package cars;
import java.util.Scanner;

interface MyWira
{
   public void wira1();
   public void wira2();
   public void wira3();
   public void wira4();
   public void wira5();
}
public class Wira extends Cars implements MyWira
{
	int p = 120;
	int day;
	public Wira()
	{
		this.day=0;
		this.price = p;	
	}
	public void showBalanceCars()
	{
		System.out.println("\n\n| Total Car Balance :: " + getBalanceCars());
	}
	public void getWiraCarList()
	{
		System.out.println("\n| NO \t\t:: 1");
		System.out.println("| CAR \t\t:: WIRA ");
		System.out.println("| CAR PLATE \t:: BVW6564");
		System.out.println("| CAR COLOR \t:: BLACK");
		System.out.println("\n------------------------------------");
		System.out.println("\n| NO \t\t:: 2");
		System.out.println("| CAR \t\t:: WIRA ");
		System.out.println("| CAR PLATE \t:: BWC7723");
		System.out.println("| CAR COLOR \t:: YELLOW");
		System.out.println("\n------------------------------------");
		System.out.println("\n| NO \t\t:: 3");
		System.out.println("| CAR \t\t:: WIRA ");
		System.out.println("| CAR PLATE \t:: BDD2342");
		System.out.println("| CAR COLOR \t:: GREEN");
		System.out.println("\n------------------------------------");
		System.out.println("\n| NO \t\t:: 4");
		System.out.println("| CAR \t\t:: WIRA ");
		System.out.println("| CAR PLATE \t:: BWV2789");
		System.out.println("| CAR COLOR \t:: RED");
		System.out.println("\n------------------------------------");
		System.out.println("\n| NO \t\t:: 5");
		System.out.println("| CAR \t\t:: WIRA");
		System.out.println("| CAR PLATE \t:: BDA2152");
		System.out.println("| CAR COLOR \t:: BROWN");
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
	
	public void wira1()
	{
		System.out.println("\n-----------------------------\n|  *********Selected Car*******\n-----------------------------");
		System.out.println("\n| CAR \t\t:: WIRA ");
		System.out.println("| CAR PLATE \t:: BVW6564");
		System.out.println("| CAR COLOR \t:: BLACK");
		System.out.println("\n\nBalance Of Wira \t:: " + getBalanceWira());
	}
	
	public void wira2()
	{
		System.out.println("\n-----------------------------\n|  *********Selected Car*******\n-----------------------------");
		System.out.println("\n| CAR \t\t:: WIRA ");
		System.out.println("| CAR PLATE \t:: BWC7723");
		System.out.println("| CAR COLOR \t:: YELLOW");
		System.out.println("\n\nBalance Of Wira \t:: " + getBalanceWira());
	}
	
	public void wira3()
	{
		System.out.println("\n-----------------------------\n|  *********Selected Car*******\n-----------------------------");
		System.out.println("\n| CAR \t\t:: WIRA ");
		System.out.println("| CAR PLATE \t:: BDD2342");
		System.out.println("| CAR COLOR \t:: GREEN");
		
		System.out.println("\nBalance Of Wira \t:: " + getBalanceWira());
	}
	public void wira4()
	{
		System.out.println("\n-----------------------------\n|  *********Selected Car*******\n-----------------------------");
		System.out.println("\n| CAR \t\t:: WIRA ");
		System.out.println("| CAR PLATE \t:: BWV2789");
		System.out.println("| CAR COLOR \t:: RED");
		System.out.println("\nBalance Of Wira \t:: " + getBalanceWira());
	}
	public void wira5()
	{
		System.out.println("\n-----------------------------\n|  *********Selected Car*******\n-----------------------------");
		System.out.println("\n| CAR \t\t:: WIRA ");
		System.out.println("| CAR PLATE \t:: BDA2152");
		System.out.println("| CAR COLOR \t:: BROWN");
		System.out.println("\nBalance Of Wira \t:: " + getBalanceWira());	
	}
}