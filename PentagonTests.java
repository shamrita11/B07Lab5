package B07Lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PentagonTests {

	@Test
	void testperimeter1() throws Exception {
		// 5 of the same points
		Pentagon p1 = new Pentagon(new Point(0, 0), new Point(0, 0), new Point(0, 0), new Point(0, 0), new Point(0, 0));
		assertEquals(p1.perimeter(), 0);
	}
	
	@Test
	void testperimeter2() throws Exception {
		// 5 normal points
		Pentagon p1 = new Pentagon(new Point(0, 0), new Point(2, 0), new Point(4, 2), new Point(-1, 5), new Point(1, 6));
		assertEquals(p1.perimeter(), 2 + Math.sqrt(8) + Math.sqrt(25+9) + Math.sqrt(5) + Math.sqrt(37));
	}

}
