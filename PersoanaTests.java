import static org.junit.Assert.*;

import org.junit.Test;

public class PersoanaTests {

	@Test(timeout = 10)
	public void testPerformance() {
	Persoana persoana =new Persoana("Ionel","2980802675432");
	persoana.checkCNP();
	}

	@Test(expected=IllegalArgumentException.class)
	public void testConformance() {
		Persoana persoana =new Persoana("Ionel","29808026754321");
		persoana.checkCNP();
	}	
	
	@Test(expected=IllegalArgumentException.class)
	public void testCheckConformance() {
		Persoana persoana =new Persoana("Ionel","298080267543a");
		persoana.checkCNP();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConformancePrimaCifra()
	{
		Persoana persoana =new Persoana("Ionel","0980802675431");
		persoana.checkCNP();
	}
	
	@Test
	public void testFormatCorectCNPInvalid() {
		Persoana persoana=new Persoana("Ionel","1900129321791");
		assertFalse(persoana.checkCNP());
	}
	
	@Test
	public void testFormatCorectCNPValid() {
		Persoana persoana=new Persoana("Ionel","1900129321797");
		assertTrue(persoana.checkCNP());
	}
	
	@Test(expected =IllegalArgumentException.class)
	public void testExistence() {
		Persoana persoana=new Persoana("Bianca",null);
		persoana.checkCNP();
	}
	@Test
	public void testCardinality() {
		Persoana persoana=new Persoana("Bianca","6190303567657");
		assertEquals(persoana.getVarsta(), 2);
	}

}
