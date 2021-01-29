package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		// a letra maiuscula diferencia de uma classe para um tipo primitivo.
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		
		// Converter um string to int
		System.out.print("Digite um valor >> ");
		Integer i2 = Integer.parseInt(entrada.nextLine());
		System.out.println(i2);
		
		
		entrada.close();
		Float f = 123.10F;
		
		Double d = 123456.23;
		 
		// convert string to boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		// boolean to string
		System.out.println(bo.toString().toUpperCase());
		
		// convert character to string
		Character c = 'c';
		System.out.println(c + "");
		
	}
}
