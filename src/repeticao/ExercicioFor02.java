package repeticao;

import java.util.Scanner;

public class ExercicioFor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declarar a variavel de numero inteiro N para decidir quantas entradas irão no loop
		int n = sc.nextInt();
		int counterIn = 0;
		int counterOut = 0;
		
		//fazer um loop que declare diversos numeros inteiros
		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				counterIn += 1;
			
			} else {
				counterOut += 1;
			}
		}
		
		System.out.println("In: " + counterIn);
		System.out.println("Out: " + counterOut);
		
		sc.close();
		
	}

}
