import java.util.Scanner;
import java.util.Locale;

public class ExercicioCondicao7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//declarar as variaveis de coordenada
		System.out.println("Coordenada x: ");
		double x = sc.nextDouble();
		
		System.out.println("Coordenada y: ");
		double y = sc.nextDouble();
		
		//declarar a condição se a coordenada estiver em Q1, Q2, Q3, Q4 e Origem
		if (x == 0 && y == 0) {
			
			System.out.println("Origem");
		
		} else if (x == 0) {
			
			System.out.println("Eixo X");
			
		} else if (y == 0) {
			
			System.out.println("Eixo Y");
			
		} else if (x >= 0 && y >= 0) {
			
			System.out.println("Q1");
			
		} else if (x <= 0 && y >= 0) {
			
			System.out.println("Q2");
			
		} else if (x <= 0 && y <= 0) {
			
			System.out.println("Q3");
			
		} else {
			
			System.out.println("Q4");
			
		}
		
		sc.close();
		
	}

}
