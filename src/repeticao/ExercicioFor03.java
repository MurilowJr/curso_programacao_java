package repeticao;

import java.util.Scanner;

public class ExercicioFor03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//declarar uma variavel para ler numero de casos de teste
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double media = (2 * a + 3 * b + 5 * c) / (2 + 3 + 5);
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();

	}

}
