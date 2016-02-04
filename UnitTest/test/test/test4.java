package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.src.EjbContext;

public class test4 {

	@Test
	public void testDividir() {
		double a = 10;
		double b = 2;
		EjbContext ejb = new EjbContext();
		try{
			double result = ejb.LlamarDivision(a, b);
			double real = a / b;
			assertEquals("Margen de error del +-0.01",real ,result,0.01);
		}
		catch(Exception e){
			fail("Ocurrio un error interno dentro del metodo. No paso la prueba.");
		}
	}

}
