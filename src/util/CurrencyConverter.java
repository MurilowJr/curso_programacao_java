package util;

public class CurrencyConverter {
	
	//classes declaradas com "final" são classes imutáveis, ou seja, não alteram seu valor.
	public static final double IOF = 6.0;
	
	public static double converter(double dollar, double quantity) {
		
		double valor = dollar * quantity;
		return valor += valor * IOF/100;
		
	}
	
}
