package penjamin;
import java.util.Scanner;

public class penjamin
{
	private String Name;
	private String Ic;
	private String Sex;
	public penjamin(String penjaminName, String penjaminIc, String penjaminSex)
	{
		Name = penjaminName;
		Ic = penjaminIc;
		Sex = penjaminSex;
	}
	public String getName()
	{
		return Name;
	}	
	public String getIc()
	{
		return Ic;
	}
	public String getSex()
	{
		return Sex;
	}
}