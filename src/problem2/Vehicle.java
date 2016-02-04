package problem2;

public class Vehicle implements Cloneable {
	private int x;
	public Vehicle(int y) { setX(y); }
	public Object clone(){
		System.out.println("Using Vehicle's Clone");
		Object result = new Vehicle(this.getX());
		// Location "A"
		return result;
	}
	// other methods omitted
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
}
	//Test: Truck suv = new Truck(4); Truck co = suv.clone();
	//Expected: suv.x = co.x; suv.getClass() = co.getClass();
