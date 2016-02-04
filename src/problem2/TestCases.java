package problem2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void problemTest() {
		Truck suv = new Truck(4);
		Truck co = (Truck) suv.clone();
		assertTrue(suv.getX() == co.getX());
		assertTrue(suv.getClass() == co.getClass());
	}

}
