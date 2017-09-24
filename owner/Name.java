package owner;

public class Name
{ 
	private String Name;
	private String Sex;
	private String Ic;
	public Name(String n, String s, String i)
		{ 
			this.Name=n;
			this.Sex=s;
			this.Ic =i;
		}
	public String toString()
		{ 
			System.out.println("\n\n------------------------------------\n|  *********Customer Details*******\n------------------------------------");
			return "\n\n| Rental Name \t\t:: " + Name + "\n| Rental Sex \t\t:: " + Sex + "\n| Rental IC \t\t:: " + Ic;
		} 
}