package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.src.EjbContext;

public class test3 {

	@Test
	public void testMultiplicar() {
		long a = 20;
		long b = 40;
		EjbContext ejb = new EjbContext();
		try{
			long result = ejb.LlamarMultiplicacion(a, b);
			assertEquals(a * b ,result);
		}
		catch(Exception e){
			fail("Ocurrio un error interno dentro del metodo. No paso la prueba.");
		}
	}

}
