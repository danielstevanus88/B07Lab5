import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {
	@Test
	void test1() {
		Point p = new Point(0,0);
		Circle c = new Circle(p,0.5);
		assertTrue(c.perimeter() == Math.PI);
	}

	@Test
	void test2() {
		Point p = new Point(0,0);
		Circle c = new Circle(p,2);
		assertTrue(c.area() == 4 * Math.PI);
	}

	@Test
	void test3() {
		Point p = new Point(0,0);
		Point p1 = new Point(0,0);
		Circle c = new Circle(p1,1);
		assertTrue(c.contains(p));
	}

	@Test
	void test4() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(4,0);
		Circle c = new Circle(p1,2);
		assertFalse(c.contains(p2));
	}
}
