package fundamentos;

public class ConversaoDeTiposPrimitivosNumericos {
	public static void main(String[] args) {
		// conversao implicita sem problema por causa do tamanho
		double a = 1; 
		System.out.println(a);
		
		// conversao explicita (casting) 
		float b = (float) 1.0;
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // perdeu informação e gerou outro numero
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;  // perdeu informação (truncou)
		System.out.println(f);
	}

}
