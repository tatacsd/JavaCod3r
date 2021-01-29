package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean tv52 = false;
		boolean tv32 = false;
		boolean sorvete = false;
		boolean saudavel = !sorvete;
		
		if(trabalho1 && trabalho2) {
			tv52 = true;
			sorvete = true;
			saudavel = !sorvete;
		} else if(trabalho1 ^ trabalho2) {
			tv32 = true;
			sorvete = true;
			saudavel = !sorvete;
		}
		System.out.printf("Status:\nTrabalho de terça >> %b\nTrabalho de quinta >> %b\n\n",
				trabalho1, trabalho2);
		System.out.printf("Compra a tv de 52: %b\nCompra tv de 32: %b\nToma sorvete: %b\nEsta mais saudavel: %b",
				tv52, tv32, sorvete, saudavel);
		
		// outra maneira
		System.out.println("\n==============");
		boolean comprouTV50 = trabalho1 && trabalho2;
		System.out.println("Comprou TV de 50\"? " + comprouTV50);
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		System.out.println("Comprou TV de 32\"? " + comprouTV32);
		boolean tomouSorvete = trabalho1 || trabalho2;
		System.out.println("Tomou sorvete? " + tomouSorvete);
		boolean maisSaudavel = !tomouSorvete;
		System.out.println("Esta mais saudavel? " + maisSaudavel);
	}

}
