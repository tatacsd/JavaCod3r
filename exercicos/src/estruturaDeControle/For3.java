package estruturaDeControle;

public class For3 {
	public static void main(String[] args) {
		
//		int i = 0;
//		for(;i < 10; ++i){
//			System.out.println("i >> " + i);
//		}
//		
//		// Now you can use the varibale i outside the for
//		System.out.println("i + 50 = " + (i + 50));
		
		
		
		
		for(int j = 0; j < 10; j++) {
			for(int k = 0; k < 10; k++) {
				System.out.printf("[%d %d]", j,k);
			}
		}
	}

}
