package fundamentos.exerciciosconceitosbasicos;

import java.util.Scanner;

//		Criar um programa que resolve equações do segundo grau 
//		(ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
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
					
			
			System.out.printf("Os coeficientes da equação a = %d, b = %d, c = %d.", a, b, c);
			System.out.printf("\nO delta é %.0f.\n", delta);
			System.out.printf("\nTemos dois Xs.O x1 é igual a %.0f e o x2 é igual a %.0f", xOne, xTwo);
			System.out.printf("\nPortanto, as raízes da equação %dx² – %dx – %d = 0 são %.0f e %.0f.", a, b, c, xOne, xTwo);
		} else {
			System.out.printf("O delta é %.0f, a equação não terá raízes reais.\nNão existe raiz quadrada de número negativo", delta);
		}
		
		keyboard.close();
	}
}
