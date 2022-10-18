package vector;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
			- Imprimir todos os elementos do vetor
			- Mostrar na tela a soma e a média dos elementos do vetor 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//criar a variavel para digitar N numeros
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		//declarar um vetor
		double vect[] = new double[n];
		
		//criar um loop para que todos os N numeros consigam ter valores no vetor
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i=0; i<vect.length; i++) {
			soma += vect[i];
		}
		
		double media = soma / vect.length;
		
		System.out.print("VALORES = ");
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.1f%n", vect[i]);
		}
		
		System.out.printf("%nSOMA = %.1f%n", soma);
		System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();

	}

}
