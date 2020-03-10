package com.ipartek.formacion.metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilidadesTest {

	private static final String AsserTrue = null;
//	@Test
//	public void testSaludarString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSaludarStringString() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSuma() {
		assertEquals(6, Utilidades.suma(3, 3));
		// fail("Not yet implemented");
		// mas asserciones que podemos usar.
		assertTrue(true);
		assertFalse(2 > 300);
		assertNull(null);
		// assernotnull
	}

//
//	@Test
//	public void testCalcularLetraDniInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCalcularLetraDniString() {
//		fail("Not yet implemented");
//	}
//

}
