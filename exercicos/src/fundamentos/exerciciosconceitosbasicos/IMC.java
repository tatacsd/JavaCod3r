package fundamentos.exerciciosconceitosbasicos;

import java.util.Scanner;

// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

public class IMC {
	public static void main(String[] args) {
		// Formula  Peso ÷ (altura x altura).
		double peso;
		double altura;
		double imc;
		
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Insira o peso (Ex.: 80,5) >> ");
		peso = keyboard.nextDouble();
		System.out.print("Insira a altura (Ex.: 1,62) >> ");
		altura = keyboard.nextDouble();
		
		// Formula
		imc = peso / (altura * altura);
		
		// Table info
		boolean muitoBaixo = imc >= 16 && imc <= 16.9;
		boolean abaixoDoPeso = imc >= 17 && imc <= 18.4;
		boolean normal = imc >= 18.5 && imc <= 24.9;
		boolean acimaDoPeso = imc >= 25 && imc <= 29.9;
		boolean obsedidadeI = imc >= 30 && imc <= 34.9;
		boolean obsedidadeII = imc >= 35 && imc <= 40;
		boolean obsedidadeIII = imc > 40;
		
		String result = muitoBaixo ? 
				"Muito abaixo do peso >> 16 a 16,9 kg/m2  >>  Queda de cabelo, infertilidade, ausência menstrual" : "zero";
		result = abaixoDoPeso ? 
				"Abaixo do peso >> 17 a 18,4 kg/m2  >> Fadiga, stress, ansiedade" : result;
		result = normal ? 
				"Peso normal >> 18,5 a 24,9 kg/m2  >>  Menor risco de doenças cardíacas e vasculares" : result;
		result = acimaDoPeso ? 
				"Acima do peso  >>  25 a 29,9 kg/m2  >>  Fadiga, má circulação, varizes" : result;
		result = obsedidadeI ?
				"Obesidade Grau I  >>  30 a 34,9 kg/m2  >>  Diabetes, angina, infarto, aterosclerose" : result;
		result = obsedidadeII ?
				"Obesidade Grau II  >>  35 a 40 kg/m2  >>  Apneia do sono, falta de ar" : result;
		result = obsedidadeIII ?
				"Obesidade Grau III  >>  maior que 40 kg/m2  >>  Refluxo, dificuldade para se mover, escaras, diabetes, infarto, AVC" : result;
		
				
		// Display output
		System.out.printf("O IMC é %.1f \n%s", imc, result);
				
		
		// Close scanner
		keyboard.close();		
	}

}
