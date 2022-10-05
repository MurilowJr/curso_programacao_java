package util;

public class CurrencyConverter {
	
	//classes declaradas com "final" são classes imutáveis, ou seja, não alteram seu valor.
	public static final double IOF = 0.06;
	
	public static double converter(double dollar, double quantity) {
		
		return dollar * quantity * (1.0 + IOF);
		
	}
	
}
