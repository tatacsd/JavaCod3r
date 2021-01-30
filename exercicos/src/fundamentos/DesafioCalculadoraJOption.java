package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadoraJOption {
	public static void main(String[] args) {
				
		// Variables
		double num1;
		double num2;
		String operacao;
		
		String entrada = JOptionPane.showInputDialog(null,"Olá Bem vindo ao Desafio da calculadora\nPor favor, insira o primeiro numero");
		num1 = Double.parseDouble(entrada);
		entrada = JOptionPane.showInputDialog(null,"Insira o segundo numero");
		num2 = Double.parseDouble(entrada);
		operacao = JOptionPane.showInputDialog(null,"Insira qual operação voce deseja realizar\n- , + , * , / , %");
		
		
		// Logica para operação/calcular
		double resultado = operacao.equals("-") ? num1 - num2 : 0;
		resultado = operacao.equals("+") ? num1 + num2 : resultado;
		resultado = operacao.equals("*") ? num1 * num2 : resultado;
		resultado = operacao.equals("/") ? num1 / num2 : resultado;
		resultado = operacao.equals("%") ? num1 % num2 : resultado;
		
		// Display output
		JOptionPane.showConfirmDialog(null, num1 + " " + operacao + " " + num2 + " = " + resultado);
	}

}
