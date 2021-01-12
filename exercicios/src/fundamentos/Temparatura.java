package fundamentos;

public class Temparatura {
	public static void main(String[] args) {
		// (F - 32) * (5/9) = C
		
		final int TrintaEDois = 32;
		final double CincoPorNove = 5.0 / 9;
		double Celsius;
		
		double fahrenheit = 86;		
		
		Celsius = (fahrenheit - TrintaEDois) * CincoPorNove;
		System.out.println("A temperatura em Celsius é: "+ Celsius);
		
		
	}

}
