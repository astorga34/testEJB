package junit.src;

import java.util.Hashtable;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import ejb.*;

public class EjbContext {
	@EJB
	private calculatorRemote ejb;
	
	public EjbContext(){
		try{
			Hashtable<String,Object> jndiProperties = new Hashtable<String,Object>();
			jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			
			InitialContext c = new InitialContext(jndiProperties);		
			this.ejb = (calculatorRemote)c.lookup("ejb:/EJBCalculator//calculator!ejb.calculatorRemote");			
		}
		catch(NamingException e){}
	}
	
	public long LlamarSuma(long a, long b) throws Exception
	{
		if(ejb != null)
		{
			return ejb.Sumar(a, b);
		}
		else
		{
			throw new Exception();
		}
		
	}
	
	public long LlamarResta(long a, long b) throws Exception
	{
		if(ejb != null)
		{
			return ejb.Restar(a, b);
		}
		else
		{
			throw new Exception();
		}
	}
	
	public long LlamarMultiplicacion(long a, long b) throws Exception
	{
		if(ejb != null)
		{
			return ejb.Multiplicar(a, b);
		}
		else
		{
			throw new Exception();
		}		
	}
	
	public double LlamarDivision(double a, double b) throws Exception
	{
		if(ejb != null)
		{
			return ejb.Dividir(a, b);
		}
		else
		{
			throw new Exception();
		}		
	}	
	
}
