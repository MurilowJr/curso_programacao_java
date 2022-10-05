package program;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramDollarConversion {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		double converted = CurrencyConverter.converter(dollar, quantity);
		
		System.out.println("Amount to be paid in reais = " + converted);
		
		
		sc.close();
	}

}
