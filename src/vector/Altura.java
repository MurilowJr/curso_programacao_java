package vector;

import java.util.Locale;
import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: %n", i + 1);

			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();

		}

		double somaAltura = 0.0;

		int somaIdade = 0;

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				somaIdade++;
			}
			somaAltura += altura[i];
		}
		
		double mediaAltura = somaAltura / n;
		double percentualIdade = ((double) somaIdade / n) * 100;
		
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualIdade);
		
		for (int i=0; i<nome.length; i++) {
			if (idade[i] < 16) {
				System.out.printf("%s%n", nome[i]);
			}
		}

		sc.close();

	}

}
