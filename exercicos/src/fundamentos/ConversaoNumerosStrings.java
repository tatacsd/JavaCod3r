package fundamentos;

public class ConversaoNumerosStrings {
	public static void main(String[] args) {
		
		// Usando o wrapper
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		// Usando o tipo primitivo
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		// usando gambiarra (concatenando)
		System.out.println(("" + num1).length());
		System.out.println(("" +  num2).length());
	}

}
