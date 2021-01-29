package fundamentos.operadores;

public class DesafioOperadorAritmetico {
	public static void main(String[] args) {
		double part1 = Math.pow(6 * (3 + 2), 2) / (3 * 2); 
		double part2 = Math.pow((1 - 5) * (2 - 7) / 2, 2);
		double part3 = Math.pow(part1 - part2, 3);
		double part4 = Math.pow(10, 3);
		int finalScore = (int) (part3 / part4);
		
		System.out.println(finalScore);
	}

}
