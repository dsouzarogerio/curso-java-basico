package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("C�lculo de dois n�meros");
		System.out.println("===========================\n");

		System.out.println(
				"Escolha o tipo de c�lculo: S -> soma // Sub -> subtra��o // M -> multiplica��o // D -> divis�o");
		String calculo = scan.next();

		System.out.println("\nDigite o primeiro n�mero:");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo n�mero:");
		double num2 = scan.nextDouble();

		// C�lculo das opera��es
		double soma = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;

		switch (calculo) {
		case "S":
			System.out.println("\nResultado soma = " + soma);
			if (soma > 0) {
				System.out.println("\nEste n�mero � positivo.");
			} else {
				System.out.println("\nEste n�mero � negativo.");
			}
			if (soma % 1 != 0) {
				System.out.println("Este n�mero � decimal");
			} else {
				System.out.println("Este n�mero � inteiro");
			}
			if (soma % 2 == 0) {
				System.out.println("Este n�mero � par");
			} else {
				System.out.println("Este n�mero � �mpar");
			}
			break;

		case "Sub":
			System.out.println("\nResultado subtra��o = " + sub);
			if (sub > 0) {
				System.out.println("\nEste n�mero � positivo.");
			} else {
				System.out.println("\nEste n�mero � negativo.");
			}
			if (sub % 1 != 0) {
				System.out.println("Este n�mero � decimal");
			} else {
				System.out.println("Este n�mero � inteiro");
			}
			if (sub % 2 == 0) {
				System.out.println("Este n�mero � par");
			} else {
				System.out.println("Este n�mero � �mpar");
			}
			break;

		case "M":
			System.out.println("\nResultado multiplica��o = " + mult);

			if (mult > 0) {
				System.out.println("\nEste n�mero � positivo.");
			} else {
				System.out.println("\nEste n�mero � negativo.");
			}
			if (mult % 1 != 0) {
				System.out.println("Este n�mero � decimal");
			} else {
				System.out.println("Este n�mero � inteiro");
			}
			if (mult % 2 == 0) {
				System.out.println("Este n�mero � par");
			} else {
				System.out.println("Este n�mero � �mpar");
			}
			break;

		case "D":
			System.out.println("\nResultado divis�o = " + div);

			if (div > 0) {
				System.out.println("\nEste n�mero � positivo.");
			} else {
				System.out.println("\nEste n�mero � negativo.");
			}
			if (div % 1 != 0) {
				System.out.println("Este n�mero � decimal");
			} else {
				System.out.println("Este n�mero � inteiro");
			}
			if (div % 2 == 0) {
				System.out.println("Este n�mero � par");
			} else {
				System.out.println("Este n�mero � �mpar");
			}
			break;
		default: System.out.println("Op��o inexistente!");
		}
		scan.close();
	}
}