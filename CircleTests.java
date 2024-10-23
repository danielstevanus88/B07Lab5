import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {
	@Test
	void test1() {
		Point p = new Point(0,0);
		Circle c = new Circle(p,1);
		assertTrue(c.perimeter() == 2 * Math.PI);
	}

	@Test
	void test2() {
		Point p = new Point(0,0);
		Circle c = new Circle(p,1);
		assertTrue(c.area() == Math.PI);
	}

	@Test
	void test3() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0.5,0);
		Circle c = new Circle(p1,1);
		assertTrue(c.contains(p2));
	}

	@Test
	void test4() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(2,0);
		Circle c = new Circle(p1,1);
		assertFalse(c.contains(p2));
	}
}
