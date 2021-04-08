package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Hello, guys".charAt(2));
		
		String s = "Good afternoon";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s.toLowerCase()
				.startsWith("good"));
		System.out.println(s.toLowerCase().endsWith("afternoon"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase() 
				.equals("good afternoon"));
		System.out.println(s.equalsIgnoreCase("good afternoon"));
		
		
		String nome = "Pedro";
		String sobrenome = "Santos";
		int idade = 33;
		float salario = 12345.987F;
		
		System.out.println("Nome: " + nome +"\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f. ",  nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		//other examples
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 8));
	}

}
