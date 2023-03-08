
public class Truck extends Vehicle{

	private int towing;
	public Truck (String t, int y, double p, int to)
	{
		super(t, y, p);
		towing = to;
	}
	
	public boolean canTowBoat()
	{
		if(towing >= 2000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String getInfo()
	{
		String info = super.getYear() + " " + super.getType() + ", " + towing + " lbs. towing, $" + super.getPrice();
		return info;
	}
	

}
