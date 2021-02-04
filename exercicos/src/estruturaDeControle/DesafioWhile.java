package estruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		// Variable
		int total = 0;
		int numNotas = 0;
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Digite uma nota ou -1 para finalizar > ");
		double nota = keyboard.nextDouble();
		
		while(nota != -1) {
			if(nota > 10 || nota < 0) {
				System.out.println("A nota digitada é invalida");
				System.out.print("Digite uma nota válida ou -1 para finalizar > ");
				nota = keyboard.nextDouble();
			} else {
				numNotas++;
				total += nota;
				System.out.print("Digite uma nota ou -1 para finalizar > ");
				nota = keyboard.nextDouble();				
			}
		}

		// Display the total
		System.out.println("A media das notas é: "+ total/numNotas);
		// Close scanner
		keyboard.close();
	}

}
