package test;

import static org.junit.Assert.*;

import org.junit.Test;
import junit.src.*;

public class test1 {

	@Test
	public void SumaTest() {
		//fail("Not yet implemented");
		long a = 20;
		long b = 40;
		EjbContext ejb = new EjbContext();
		try{
			long result = ejb.LlamarSuma(a, b);
			assertEquals(a + b ,result);
		}
		catch(Exception e){
			fail("Ocurrio un error interno dentro del metodo. No paso la prueba.");
		}
	}

}
