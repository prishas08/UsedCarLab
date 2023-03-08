
public class Car extends Vehicle {
	
	
	private double mpg;
	public Car(String t, int y, double p, double m)
	{
		super(t, y, p);
		mpg = m;
	}
	public boolean greatGasMileage()
	{
		if (mpg >= 36)
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
		String info = super.getYear() + " " + super.getType() + ", " + mpg + " mpg, $" + super.getPrice();
		return info;
	}

}
