package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) * (5/9) = C
		
		final int trintaEDois = 32;
		final double cincoPorNove = 5.0 / 9.0;
		
		double fahrenheit = 86;		
		
		double celsius = (fahrenheit - trintaEDois) * cincoPorNove;
		
		System.out.println("O valor em celsius é >> " + celsius);
		
	}
}
