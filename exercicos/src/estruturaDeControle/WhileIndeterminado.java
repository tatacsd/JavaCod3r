package estruturaDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Digite algo ou SAIR para sair > ");
		String usuario = keyboard.next();
		
		while(!usuario.equals("SAIR")) {
			System.out.println(usuario);
			System.out.print("Digite algo ou SAIR para sair > ");
			usuario = keyboard.next();
		}
		System.out.println("Fim");
		keyboard.close();
	}

}
