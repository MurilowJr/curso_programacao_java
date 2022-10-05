package entities;

public class Rectangle {
	
	//declarar os atributos da classe
	public double width;
	public double height;
	
	//declarar os metodos: área, perimetro e diagonal
	
	public double area() {
		return width * height;
	}
	
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
