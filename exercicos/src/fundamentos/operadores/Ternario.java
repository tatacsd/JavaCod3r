package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double nota1 = 8.0;
		double nota2 = 8.0;
		double media = (nota1 + nota2) /2;
		
		boolean bomComportamento = true;
		boolean passouPorMedia = media > 7;
		boolean temDesconto = bomComportamento && passouPorMedia;		
		String aprovacaoDesconto = temDesconto ?
				"sim" : "não";
		
		String resultadoRecuperacao = media >= 5.0 ?
				"em recuperação." : "reprovado.";
		String resultado = media >= 7 ?
				"Aprovado." : resultadoRecuperacao;
		
		System.out.printf("O aluno ta com a media %.1f, entao esta %s\n",
				media, resultado);
		System.out.printf("Tem desconto? %s", aprovacaoDesconto);
	}
}
