package com.operador.java;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		double n1, n2;

		// Variaveis

		String sinal = "";

		Scanner sinalMat = new Scanner(System.in);
		System.out.println("Digite o operação matemática:( + , - , / ou *)");

		sinal = sinalMat.nextLine();

		Scanner ler1 = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");

		n1 = ler1.nextDouble();

		Scanner ler2 = new Scanner(System.in);
		System.out.println("Digite o segundo valor:");

		n2 = ler2.nextDouble();

		// Condicionais:

		if  (sinal.contains("+"))  // Operação de soma
			System.out.println( n1 + n2);

		else if (sinal.contains("-")) // Operação de subtração
			System.out.println(n1 - n2);

		else if (sinal.contains("*")) // Operação de multiplicação 
			System.out.println(n1 * n2);

		else if (sinal.contains("/")) // Operação de divisão
			System.out.println(n1 / n2);
	}

}