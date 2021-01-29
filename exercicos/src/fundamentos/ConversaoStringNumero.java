package fundamentos;

//import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o primeiro número");
		
		System.out.println(valor1 + valor2);
		
		// converter string para double
		double numero1 =  Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma é " + soma);
		System.out.println("A media é: " + soma/2);
		
		
		// para obter valores super exatos
		// BigDecimal
	}
}
