package ejb;

import javax.ejb.Local;

@Local
public interface calculatorLocal {
	public long Sumar(long a,long b);
	
	public long Restar(long a,long b);
	
	public long Multiplicar(long a,long b);
	
	public double Dividir(double a,double b);
}
