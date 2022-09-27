import java.util.Scanner;
import java.util.Locale;

public class ExercicioCondicao5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//declaração de variáveis para os itens
		double quantidade, preco, total;
		
		System.out.println("Bem vindo(a) ao lanchão do Muca, escolha de 1 a 5 para fazer seu pedido:");
		int selecionar = sc.nextInt();
		
		if (selecionar == 1) {
			
			System.out.println("Você selecionou Cachorro quente, o preço é R$4,00, qual a quantidade?");
			preco = 4;
			quantidade = sc.nextInt();
			total = quantidade * preco;
			System.out.printf("Total: R$%.2f", total);
			
		} else if (selecionar == 2) {
			
			System.out.println("Você selecionou X Salada, o preço é R$4,50, qual a quantidade?");
			preco = 4.5;
			quantidade = sc.nextInt();
			total = quantidade * preco;
			System.out.printf("Total: R$%.2f", total);
		
		} else if (selecionar == 3) {
			
			System.out.println("Você selecionou X Bacon, o preço é R$5,00, qual a quantidade?");
			preco = 5;
			quantidade = sc.nextInt();
			total = quantidade * preco;
			System.out.printf("Total: R$%.2f", total);
			
		} else if (selecionar == 4) {
			
			System.out.println("Você selecionou Torrada Simples, o preço é R$2,00, qual a quantidade?");
			preco = 2;
			quantidade = sc.nextInt();
			total = quantidade * preco;
			System.out.printf("Total: R$%.2f", total);
			
		} else if (selecionar == 5) {
			
			System.out.println("Você selecionou Refrigerante, o preço é R$1,50, qual a quantidade?");
			preco = 1.5;
			quantidade = sc.nextInt();
			total = quantidade * preco;
			System.out.printf("Total: R$%.2f", total);
		} else {
			System.out.println("Você selecionou algo inválido, selecione entre 1 e 5");
		}
		
		sc.close();
	}

}
