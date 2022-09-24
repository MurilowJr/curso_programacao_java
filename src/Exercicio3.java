import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.print("Primeiro numero: ");
		a = sc.nextInt();
		System.out.print("Segundo numero: ");
		b = sc.nextInt();
		System.out.print("Terceiro numero: ");
		c = sc.nextInt();
		System.out.print("Quarto numero: ");
		d = sc.nextInt();
		
		//A diferença entre (A * B - C * D)
		diferenca = (a * b - c * d);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
		}

}
