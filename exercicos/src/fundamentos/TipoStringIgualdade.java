package fundamentos;

import java.util.Scanner;

public class TipoStringIgualdade {
	public static void main(String[] args) {
		
		// use equals to compare the string not ==
		System.out.print("\"2\" == \"2\" >> ");
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.print("\"2\" == s1 >> ");
		System.out.println("2" == s1);
		System.out.print("\"2\".equals(s1) >> ");
		System.out.println("2".equals(s1));
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a value >> ");
		String s2 = keyboard.nextLine(); // next trim the spaces in the line
		
		System.out.printf("\"2\" == %s.trim()   >> ", s2);
		System.out.println("2" == s2.trim());
		
		System.out.printf("\"2\".equals(%s.trim()) >> ", s2);
		System.out.println("2".equals(s2.trim()));	
		
		keyboard.close();
		
	}
}
