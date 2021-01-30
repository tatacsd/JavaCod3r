package fundamentos.exerciciosconceitosbasicos;

import java.util.Scanner;

//		Criar um programa que resolve equa��es do segundo grau 
//		(ax2 + bx + c = 0) utilizando a f�rmula de Bhaskara.
//		Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

public class EquacaoSegundoGrau {
	public static void main(String[] args) {
		int a, b, c ;
		double delta;
		double xOne;
		double xTwo;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Digite o valor de a >>  ");
		a = keyboard.nextInt();
		System.out.print("Digite o valor de b >>  ");
		b = keyboard.nextInt();
		System.out.print("Digite o valor de c >>  ");
		c = keyboard.nextInt();
		
		// formula		
		delta = Math.pow(b, 2) - (4 * a * c);		
		if(delta > 0) {
			xOne = (-b + Math.sqrt(delta)) / (2 * a);
			xTwo = (-b - Math.sqrt(delta)) / (2 * a);
					
			
			System.out.printf("Os coeficientes da equa��o a = %d, b = %d, c = %d.", a, b, c);
			System.out.printf("\nO delta � %.0f.\n", delta);
			System.out.printf("\nTemos dois Xs.O x1 � igual a %.0f e o x2 � igual a %.0f", xOne, xTwo);
			System.out.printf("\nPortanto, as ra�zes da equa��o %dx� � %dx � %d = 0 s�o %.0f e %.0f.", a, b, c, xOne, xTwo);
		} else {
			System.out.printf("O delta � %.0f, a equa��o n�o ter� ra�zes reais.\nN�o existe raiz quadrada de n�mero negativo", delta);
		}
		
		keyboard.close();
	}
}
