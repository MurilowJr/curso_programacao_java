package vector;

import java.util.Scanner;

public class Negativos {
	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
		 * N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os números negativos lidos.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		if (n <= 10) {
			for (int i = 0; i < vect.length; i++) {
				System.out.print("Digite um número: ");
				vect[i] = sc.nextInt();
			}

			System.out.println("Números negativos: ");

			for (int i = 0; i < vect.length; i++) {
				if (vect[i] < 0) {
					System.out.printf("%d%n", vect[i]);
				}
			}

		} else {

			System.out.println("A quantidade não pode exceder 10 numeros!");

		}

		sc.close();
	}
}
