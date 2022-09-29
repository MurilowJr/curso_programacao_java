package repeticao;

import java.util.Scanner;

public class ExercicioFor07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int valor = 0;
		
		for (int i = 0; i < a; i++) {
			valor += 1;
			int valorQuad = valor * valor;
			int valorCubo = valorQuad * valor;
			
			System.out.printf("%d %d %d%n", valor, valorQuad, valorCubo);
			
		}
		sc.close();
	}

}
