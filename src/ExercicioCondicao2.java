import java.util.Scanner;

public class ExercicioCondicao2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		//declarar uma variavel de numero inteiro
		int x = sc.nextInt();
		
		//mostrar se ela é par ou impar
		if (x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		sc.close();
	}
}
