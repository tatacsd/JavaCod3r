package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		// Declaring 3 variable
		String sal1, sal2, sal3;
		
		// Initialize scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Por favor insira o valor do primeiro salario >> ");
		sal1 = keyboard.next().replace(',', '.');
		System.out.print("Por favor insira o valor do segundo salario >> ");
		sal2 = keyboard.next().replace(',', '.');
		System.out.print("Por favor insira o valor do terceiro salario >> ");
		sal3 = keyboard.next().replace(',', '.');
		
		// Convert string to double
		Double value1 = Double.parseDouble(sal1);
		Double value2 = Double.parseDouble(sal2);
		Double value3 = Double.parseDouble(sal3);
		
		double media = (value1 + value2 + value3) / 3;
		// Display the info
		System.out.println("A media do salario é >> " + media);
		// Close scanner
		keyboard.close();
	}

}
