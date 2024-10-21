package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab4Tests {

	// tests for POINT.java 
	@Test
	void testDistance() {
		Point p1 = new Point(1, 0);
		Point p2 = new Point(0, 0);
		assertEquals(p1.distance(p2), 1);
	}
	
	@Test
	void testPhashCode() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 1);
		assertEquals(p1.hashCode(), p2.hashCode());
	}
	
	@Test
	void testPequals1() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 1);
		assertEquals(p1, p2);
	}

	@Test
	void testPequals2() {
		Point p1 = new Point(1, 1);
		assertFalse(p1.equals(null));
	}
	
	@Test
	void testPequals3() {
		Point p1 = new Point(1, 1);
		assertFalse(p1.equals(4));
	}
	
	@Test
	void testPequals4() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 1);
		assertNotEquals(p1, p2);
	}
	
	@Test
	void testPequals5() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 2);
		assertNotEquals(p1, p2);
	}
	
	@Test
	void testPequals6() {
		Point p1 = new Point(1, 1);
		assertTrue(p1.equals(p1));
	}
	//*************************************************************
	// tests for TRIANGLE.java
	@Test
	void testPerimeter() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, -1);
		Point p3 = new Point(-1, -1);
		Triangle t = new Triangle(p1, p2, p3);
		assertEquals(t.perimeter(), 2 + 2*Math.sqrt(2));
	}
	
	@Test
	void testIsEquilateral1() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, -1);
		Point p3 = new Point(-1, -1);
		Triangle t = new Triangle(p1, p2, p3);
		assertFalse(t.isEquilateral());
	}
	@Test
	void testIsEquilateral2() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(Math.sqrt(5), 0);
		Point p3 = new Point(Math.sqrt(5)/2, Math.sqrt(15)/2);
		Triangle t = new Triangle(p1, p2, p3);
		assertTrue(t.isEquilateral());
	}
}
