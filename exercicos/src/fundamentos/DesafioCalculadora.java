package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
				
		// Variables
		double num1;
		double num2;
		String operacao;
		
		// Initialize scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Olá Bem vindo ao Desafio da calculadora\nPor favor, insira o primeiro numero >>  ");
		num1 = keyboard.nextDouble();
		System.out.print("Insira o segundo numero >>  ");
		num2 = keyboard.nextDouble();
		System.out.print("Insira qual operação você deseja realizar\\n- , + , * , / , %   >>  ");
		operacao = keyboard.next();
		
		// Logica para operação/calcular
		double resultado = operacao.equals("-") ? num1 - num2 : 0;
		resultado = operacao.equals("+") ? num1 + num2 : resultado;
		resultado = operacao.equals("*") ? num1 * num2 : resultado;
		resultado = operacao.equals("/") ? num1 / num2 : resultado;
		resultado = operacao.equals("%") ? num1 % num2 : resultado;
		
		// Display output
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		// Close Scanner
		keyboard.close();
	}

}
