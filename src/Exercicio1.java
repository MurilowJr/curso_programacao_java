import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, resultado;
		
		x = sc.nextInt();
		sc.nextLine();
		y = sc.nextInt();
		
		resultado = x + y;
		
		System.out.println("SOMA = " + resultado);
		sc.close();
	}

}
