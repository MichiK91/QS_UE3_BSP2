import static org.junit.Assert.*;

import java.security.InvalidParameterException;
import java.util.Stack;

import org.junit.Test;

public class QSVU_UEbung3_1126331_Kirchknopf_Michael_TriangleTests {
	
	QSVU_UEbung3_1126331_Kirchknopf_Michael_Triangle triangle;
	
	public QSVU_UEbung3_1126331_Kirchknopf_Michael_TriangleTests() {
		new QSVU_UEbung3_1126331_Kirchknopf_Michael_Triangle();
	}

	@Test
	public void testHypotenuseValidTriangle() {
		Double h = triangle.calcHypotenuse(3,4);
		assertEquals(h,new Double(5));
	}
	
	@Test
	public void testHypotenuseInvalidTriangle() {
		try{
			double h = triangle.calcHypotenuse(3,3);
			fail("Should not happen");
		} catch(InvalidParameterException e){
			assertEquals("Falsche Parameter", e.getMessage());			
		}
	}
	
	@Test
	public void testHypotenuseInvalidParameter() {
		try{
			double h = triangle.calcHypotenuse(-3,3);
			fail("Should not happen");
		} catch(InvalidParameterException e){
			assertEquals("Negativer Parameter", e.getMessage());			
		}
	}
}
