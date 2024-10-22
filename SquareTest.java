import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void testPerimeter() {
		Point a = new Point(3,5);
		double l = 5;
		Square s = new Square(a,l);
		assertEquals(20.0, s.perimeter());
	}
	
	@Test
	void testArea() {
		Point a = new Point(3,5);
		double l = 5;
		Square s = new Square(a,l);
		assertEquals(25.0, s.area());
	}
}
