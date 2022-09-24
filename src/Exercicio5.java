import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Fazer um programa para ler o código de uma peça 1,
		 *  o número de peças 1, o valor unitário de cada peça 1, 
		 *  o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
		 *  Calcule e mostre o valor a ser pago*/
		
		//iniciar o Scanner e o Locale
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//declarar as variaveis de peça 1 e peça 2
		int codPeca1, codPeca2, numPeca1, numPeca2;
		double valorUniPeca1, valorUnipeca2, totalPeca1, totalPeca2, valorPago;
		
		//utilizar o Scanner para definir os valores de peça 1
		System.out.print("Código da peca 1: ");
		codPeca1 = sc.nextInt();
		System.out.print("Numero de pecas 1: ");
		numPeca1 = sc.nextInt();
		System.out.print("Valor Unitario da peca 1: ");
		valorUniPeca1 = sc.nextDouble();
		
		//utilizar o Scanner para definir os valores de peca 2
		System.out.print("Código da peca 2: ");
		codPeca2 = sc.nextInt();
		System.out.print("Numero de pecas 2: ");
		numPeca2 = sc.nextInt();
		System.out.print("Valor Unitario da peca 2: ");
		valorUnipeca2 = sc.nextDouble();
		
		//Calculo de peças selecionadas
		totalPeca1 = (double) numPeca1 * valorUniPeca1;
		totalPeca2 = (double) numPeca2 * valorUnipeca2;
		
		//Calculo do valor a ser pago
		valorPago = totalPeca1 + totalPeca2;
		
		System.out.printf("VALOR A SER PAGO = %.2f", valorPago);
		
		sc.close();
		
	}

}
