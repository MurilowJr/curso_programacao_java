import java.util.Scanner;

public class ExercicioConidcao3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declarar duas variaveis para ler 2 numeros inteiros
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//saber se são multiplos ou não com if e else
		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();
	}
}
