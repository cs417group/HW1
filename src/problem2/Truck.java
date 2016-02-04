package problem2;

public class Truck extends Vehicle {
	private int y;
	public Truck(int z) { super(z); y=z; }
	
	@Override 
	public Object clone(){
		Truck result = new Truck(this.y);
		return result;
	}
	// other methods omitted
	public int getY() {
		return y;
	}
}
	//Test: Truck suv = new Truck(4); Truck co = suv.clone();
	//Expected: suv.x = co.x; suv.getClass() = co.getClass();