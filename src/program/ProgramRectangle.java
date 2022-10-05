package program;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//declarar a classe de entidade com o retangulo, no caso o prórpio retangulo
		Rectangle rect = new Rectangle();
		
		System.out.print("Width: ");
		rect.width = sc.nextDouble();
		System.out.print("Height: ");
		rect.height = sc.nextDouble();
		
		System.out.printf("ÁREA: %.2f%n", rect.area());
		System.out.printf("PERIMETER: %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL: %.2f%n", rect.diagonal());
		
		sc.close();
		
	}

}
