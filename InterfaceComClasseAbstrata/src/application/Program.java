package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.print("Digite a cor do circulo: ");
		String color = sc.nextLine();
		System.out.print("Digite o raio do circulo para achar a area: ");
		double radius = sc.nextDouble();
		
		Shape c1 = new Circle(color, radius);
		
		System.out.println();
		System.out.println("O circulo de cor " + c1.getColor() + ", tem a area de " + String.format("%.3f", c1.area()));
		
		System.out.println();
		System.out.print("Digite a cor do retangulo: ");
		sc.nextLine();
		String colores = sc.nextLine();
		System.out.print("Digite a largura do retangulo: ");
		double width = sc.nextDouble();
		System.out.print("Digite a altura do retangulo: ");
		double heigth = sc.nextDouble();
		
		Shape r1 = new Rectangle(colores, width, heigth);
		
		
		System.out.println("O retangulo de cor " + r1.getColor() + ", tem a area de " + String.format("%.3f", r1.area()));
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
