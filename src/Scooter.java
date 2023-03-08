
public class Scooter extends Vehicle{

	private String color;
	public Scooter(String t, int y, double p, String c) 
	{
		super(t, y, p);
		color = c;
	}
	public String getInfo()
	{
		String info = super.getYear() + " " + super.getType() + ", " + color + ", $" + super.getPrice();
		return info;
	}
	

}
