package fundamentos;

public class Temparatura {
	public static void main(String[] args) {
		// (F - 32) * (5/9) = C
		
		final int trintaEDois = 32;
		final double cincoPorNove = 5.0 / 9;
		
		double fahrenheit = 86;		
		
		double celsius = (fahrenheit - trintaEDois) * cincoPorNove;
		System.out.println("A temperatura em Celsius é: "+ celsius);
		
		
	}

}
