
public class InventoryRunner {
	
	public static void main(String args[])
	{
		Inventory inv = new Inventory();
		Vehicle v = new Car("Honda Civic", 2000, 6400.0, 32.0);
		Vehicle t = new Truck("Ford F-150", 2004, 8999.0, 3200);
		Vehicle s = new Scooter("Nice Scooter", 1995, 34000.0, "Blue"); 
		inv.addVehicle(v);
		inv.addVehicle(s);
		inv.addVehicle(t);
		inv.listInventory();
	}

}
