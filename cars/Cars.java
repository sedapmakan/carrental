package cars;
import java.util.Scanner;

public abstract class Cars
{
	private int totalCars = 10;
	private int totalSaga = 5;
	private int totalWira = 5;
	public int totalPrice;
	public int price,day;

	public Cars()
	{}	
	public int getBalanceSaga()
	{
		totalSaga -= 1;
		return totalSaga;
	}
	public int getBalanceWira()
	{
		totalWira -= 1;
		return totalWira;
	}
	public int getBalanceCars()
	{
		totalCars -= 1;
		return totalCars;
	}	
	abstract public void showBalanceCars();
}