package fundamentos.exerciciosconceitosbasicos;

import java.util.Scanner;

// Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
public class TrianguloArea {
	public static void main(String[] args) {
		double base;
		double altura;
		double area;
		
		// Dados usuario
		Scanner usuario = new Scanner(System.in);
		System.out.println("Area do Triangulo ");
		System.out.print("Digite a altura >> ");
		altura = usuario.nextDouble();
		System.out.print("Digite a base >> ");		
		base = usuario.nextDouble();
		
		// Area Triangulo
		area = (base * altura) / 2;
		System.out.printf("A area do triangulo retangulo é %.1f", area);
		
		usuario.close();
	}

}
