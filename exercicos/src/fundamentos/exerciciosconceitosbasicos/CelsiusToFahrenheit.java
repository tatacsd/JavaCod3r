package fundamentos.exerciciosconceitosbasicos;

import java.util.Scanner;

// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		double c;
		double f;
		Double result;
		
		// (0 °C × 9/5) + 32 = 32 °F
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Insira o valor em celsius >> ");
		c = keyboard.nextDouble();
		
		// Formula
		f = c * (9/5) + 32;
		result = f;
		
		// Display output
		System.out.print(result.toString().replace(",", ".") + " °F");
		
		// Close scanner
		keyboard.close();		
	}

}
