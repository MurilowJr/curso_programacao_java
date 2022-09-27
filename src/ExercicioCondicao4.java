import java.util.Scanner;

public class ExercicioCondicao4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//variavies de hora inicial e final para definir
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duracao;
		
		//criar condição de quantas horas durou o evento
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O JOGO DUROU = %d HORA(S)", duracao);
		
		sc.close();
	}
}
