package repeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//declarar as variaveis de coordenadas x e y
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//iniciar a repetição de quadrantes, caso nao seja nulo, os quadrantes continuarão sendo inseridos
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				
				System.out.println("Primeiro");
				
			} else if (x < 0 && y > 0) {
				
				System.out.println("Segundo");
				
			} else if (x < 0 && y < 0) {
				
				System.out.println("Terceiro");
				
			} else {
				
				System.out.println("Quarto");
				
			}
		
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		
		sc.close();
		
	}

}
