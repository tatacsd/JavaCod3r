package fundamentos.exerciciosconceitosbasicos;

import java.util.Scanner;

// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		double c;
		double f;
		Double result;
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Insira o valor em celsius >> ");
		f = keyboard.nextDouble();
		
		// Formula
		c = (f - 32) / (9/5);
		result = c;
		
		// Display output
		System.out.print(result.toString().replace(",", ".") + " °C");
		
		// Close scanner
		keyboard.close();		
	}

}
