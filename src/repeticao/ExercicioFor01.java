package repeticao;

import java.util.Scanner;

public class ExercicioFor01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declarar a variavel que leia um numero inteiro (1 <= X <= 1000)
		int x = sc.nextInt();
		
		//criar um loop que pegue somente os numeros impares desta variavel
		for (int i = 0; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
