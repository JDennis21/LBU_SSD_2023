import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void defaultConstructor() {
		
		Triangle tri = new Triangle();
		
		assertTrue(tri.isEquilateral());
		assertFalse(tri.isIsosceles());
		assertFalse(tri.isScalene());
	}

	@Test
	void threeParamConstrctor() {
		
		Triangle equalTri = new Triangle(100, 100, 100);
		Triangle isoTri = new Triangle(50, 100, 100);
		Triangle scaleTri = new Triangle(50, 100, 80);
		
		assertTrue(equalTri.isEquilateral());
		assertFalse(equalTri.isIsosceles());
		assertFalse(equalTri.isScalene());
		
		assertFalse(isoTri.isEquilateral());
		assertTrue(isoTri.isIsosceles());
		assertFalse(isoTri.isScalene());
		
		assertFalse(scaleTri.isEquilateral());
		assertFalse(scaleTri.isIsosceles());
		assertTrue(scaleTri.isScalene());
	}
	
	@Test
	void oneParamConstructor() {
		
		Triangle tri = new Triangle();
		
		assertTrue(tri.isEquilateral());
		assertFalse(tri.isIsosceles());
		assertFalse(tri.isScalene());
	}
	
	@Test
	void averageLength() {
		
		Triangle tri = new Triangle(50);
		
		int expectedValue = 50;
		
		assertEquals(expectedValue, tri.getAverageLength());
	}
	
	@Test
	void perimeter() {
		
		Triangle tri = new Triangle(50);
		
		int expectedValue = 150;
		
		assertEquals(expectedValue, tri.getPerimeter());
	}
	
	@Test
	void setSides() {
		
		Triangle tri = new Triangle(50);
		tri.setSides(40);
		
		int expectedValue = 120;
		
		assertEquals(expectedValue, tri.getPerimeter());
	}
}
