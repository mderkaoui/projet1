package fr.dawan.projet1;



import org.junit.Test;

import junit.framework.TestCase;


public class Calcul2Test extends TestCase  {

		
	@Test
	public void testMultiplier() {
		assertEquals(6, Calcul2.multiplier(3, 2));
	}

}
