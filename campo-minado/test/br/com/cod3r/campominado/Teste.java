package br.com.cod3r.campominado;

import static org.junit.jupiter.api.Assertions.*;

class Teste {

	@org.junit.jupiter.api.Test
	void testSeIgualADois() {
		int a = 1+1;
		
		assertEquals(2, a);
	}

	@org.junit.jupiter.api.Test
	void testarSeIgualATres() {
		int x = 2 + 10 - 9;
		
		assertEquals(3, x);
	}
}
