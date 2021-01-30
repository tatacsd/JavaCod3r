package fundamentos.exerciciosconceitosbasicos;

import java.util.Scanner;

// Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
public class QuadradoECubo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Digite um valor >> ");
		double num = keyboard.nextDouble();
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		System.out.printf("Quadrado: %.0f² = %.0f\nCubo: %.0f³ = %.0f",num, quadrado, num, cubo);
		keyboard.close();
	}

}
