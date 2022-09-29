package repeticao;

import java.util.Scanner;

public class ExercicioFor04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declarar a variavel que leia a quantidade de casos
		int casos = sc.nextInt();
		double divisao;
		
		//declarar o loop for para divisão desses casos
		for (int i = 0; i < casos; i++) {
			
			//serão declaradas 2 variaveis para ler os numeros a serem divididos
			double a = sc.nextInt();
			double b = sc.nextInt();
			
			
			//se a divisao for para zero, deve mostrar "divisao impossivel"
			if (b == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				divisao = a / b;
				System.out.printf("%.1f%n", divisao);
			}
			
		}
		
		sc.close();
		
	}

}
