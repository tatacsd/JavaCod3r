package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es de funcionarios
		
		// Tipos Numericos inteiros
		byte anosDeEmpresa = 127;
		short numeroDeVoos = 542;
		int id = 56789;
		// Underline aceito para ajudar na vizualiza��o
		long pontosAcumulados = 3_234_875_223L;
		
		// Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; //ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos acumulados por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha: " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		
		
	}

}
