package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class calculator
 */
@Stateless
@LocalBean
public class calculator implements calculatorRemote, calculatorLocal {

    /**
     * Default constructor. 
     */
    public calculator() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public long Sumar(long a, long b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public long Restar(long a, long b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public long Multiplicar(long a, long b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double Dividir(double a, double b) {
		// TODO Auto-generated method stub
		return a / b;
	}
    
    

}
