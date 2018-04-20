package test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import Opcional.Opcional;

public class Test {
	
	@Test
    public void test() {
		Opcional c = new Opcional();
		assertTrue("Correcto", c.gus("fer"));
		assertTrue("Correcto", c.gus("ferfer"));
		assertTrue("Correcto", c.gus("aba"));
		assertTrue("Correcto", c.gus("abcabc"));
		assertTrue("Correcto", c.gus("rrrrrr"));
		assertTrue("Correcto", c.gus("lolipoplolipop"));
		assertTrue("Correcto", c.gus("123456123"));
		assertTrue("Correcto", c.gus("9876598765"));
		assertTrue("Correcto", c.gus("gustavogustavo"));
		assertTrue("Correcto", c.gus("aaaaa"));
		
		assertFalse("Correcto", c.gus("rrrrrrrrrrrrrrt"));
		assertFalse("Correcto", c.gus("elingenioso"));
		assertFalse("Correcto", c.gus("hidalgo"));
		assertFalse("Correcto", c.gus("donquijote"));
		assertFalse("Correcto", c.gus("delamancha"));
		assertFalse("Correcto", c.gus("Enunlugardelamancha"));
		assertFalse("Correcto", c.gus("decuyonombre"));
		assertFalse("Correcto", c.gus("noquieroacordarme"));
		assertFalse("Correcto", c.gus("nohabiahacemucho"));
		assertFalse("Correcto", c.gus("queviviaunhidalgo"));
		
	}
}