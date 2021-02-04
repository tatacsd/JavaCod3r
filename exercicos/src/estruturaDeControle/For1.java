package estruturaDeControle;

public class For1 {

	public static void main(String[] args) {
		
		for(int i= 0; i <= 20; i +=2) {
			System.out.printf("i = %d\n", i);
		}
		
		int x = 2;
		for(; x < 10;) {
			System.out.println("x= " + x);
			x++;
		}
		
		//Laço infito
		for(;;) {
			System.out.println("Infinito");
		}
	}
}
