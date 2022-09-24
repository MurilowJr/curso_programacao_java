import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi;
		
		pi = 3.14159;
		
		System.out.print("Defina o raio: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("A = %.4f", area);
		
		sc.close();
	}
	
}
