package estruturaDeControle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		String texto = "";
		do {
			System.out.println("Quer sair?");
			System.out.println("Você perecisa falar "
					+ "as palavras mágicas...");
			
			texto = keyboard.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));

		System.out.println("Pode sair, obrigada.");
		// Close scanner
		keyboard.close();
	}

}
