package ejb;

import javax.ejb.Remote;

@Remote
public interface calculatorRemote {
	public long Sumar(long a,long b);
	
	public long Restar(long a,long b);
	
	public long Multiplicar(long a,long b);
	
	public double Dividir(double a,double b);
}
