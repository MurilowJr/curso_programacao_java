package repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//declarar a variavel para votação e somatoria de combustiveis
		System.out.println("Escolha entre 1. Alcool; 2. Gasolina; 3. Diesel, 4. Sair");
		int voto = sc.nextInt();
		
		int somaGas = 0;
		int somaAlc = 0;
		int somaDie = 0;
		
		while (voto != 4) {
			if (voto == 1) {
				
				somaAlc += 1;
			
			} else if (voto == 2) {
				
				somaGas += 1;
				
			} else if (voto == 3) {
				
				somaDie += 1;
				
			} else {
				
				System.out.println("Insira um numero válido, escolha entre 1. Alcool; 2. Gasolina; 3. Diesel, 4. Sair");
			}
			
			voto = sc.nextInt();
			
		}

		System.out.println("Muito Obrigado!");
		System.out.printf("Álcool: %d votos.%n", somaAlc);
		System.out.printf("Gasolina: %d votos.%n", somaGas);
		System.out.printf("Diesel: %d votos.%n", somaDie);
		
		sc.close();
		
	}

}
