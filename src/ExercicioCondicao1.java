import java.util.Scanner;

public class ExercicioCondicao1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro: ");
		int x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
		
	}
}
