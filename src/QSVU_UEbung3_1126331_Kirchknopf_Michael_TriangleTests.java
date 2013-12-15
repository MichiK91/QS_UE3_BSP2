import static org.junit.Assert.*;

import java.security.InvalidParameterException;
import java.util.Stack;

import org.junit.Test;

public class QSVU_UEbung3_1126331_Kirchknopf_Michael_TriangleTests {
	
	QSVU_UEbung3_1126331_Kirchknopf_Michael_Triangle triangle;
	
	public QSVU_UEbung3_1126331_Kirchknopf_Michael_TriangleTests() {
		triangle = new QSVU_UEbung3_1126331_Kirchknopf_Michael_Triangle();
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
			assertEquals("Ungueltige Parameter", e.getMessage());			
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
	
	@Test
	public void testWinkelVvalidTriangle(){
		Double h = triangle.calcWinkel(60);
		assertEquals(h,new Double(30));
	}
	
	@Test
	public void testWinkelInvalidTriangle(){
		try{
			double h = triangle.calcWinkel(90);
			fail("Should not happen");
		} catch(InvalidParameterException e){
			assertEquals("Ungueltiger Parameter", e.getMessage());			
		}
	}
	
	@Test
	public void testFlaecheInvalidParameter(){
		try{
			double h = triangle.calcWinkel(-90);
			fail("Should not happen");
		} catch(InvalidParameterException e){
			assertEquals("Negativer Parameter", e.getMessage());			
		}
	}
	
	@Test
	public void testFlaecheVvalidTriangle(){
		Double h = triangle.calcFlaeche(3, 4);
		assertEquals(h,new Double(6));
	}
	
	@Test
	public void testFlaecheInvalidTriangle(){
		try{
			double h = triangle.calcFlaeche(3, 3);
			fail("Should not happen");
		} catch(InvalidParameterException e){
			assertEquals("Ungueltige Parameter", e.getMessage());			
		}
	}
	
	@Test
	public void testWinkelInvalidParameter(){
		try{
			double h = triangle.calcFlaeche(-3,3);
			fail("Should not happen");
		} catch(InvalidParameterException e){
			assertEquals("Negativer Parameter", e.getMessage());			
		}
	}
}
