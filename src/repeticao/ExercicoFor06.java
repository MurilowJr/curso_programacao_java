package repeticao;

import java.util.Scanner;

public class ExercicoFor06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//declarar uma variavel que leia um inteiro
		int x = sc.nextInt();
		
		//fazer com que o código leia seus divisores
		for (int i = 1; i <= x; i++) {
			
			if (x % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
