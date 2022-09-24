import java.util.Scanner;
import java.util.Locale;

public class Exercicio6 {
	public static void main(String[] args) {
		
		/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.*/
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//declaração das variáveis com double
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		//area do triangulo que tem A por base e C por altura
		double areaTriangulo = (a * c)/2;
		
		//area do circulo de raio C
		double areaCirculo = Math.pow(c, 2) * 3.14159;
		
		//area do trapezio que tem A e B por bases e C por altura
		double areaTrapezio = (a + b) * c / 2;
		
		//area do quadrado que tem lado b
		double areaQuadrado = Math.pow(b, 2);
		
		//area do retangulo que tem lados a e b
		double areaRetangulo = a * b;
		
		//mostrar os resultados
		System.out.printf("TRIANGULO = %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO = %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO = %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO = %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO = %.3f%n", areaRetangulo);
		
		sc.close();
		
	}
}
