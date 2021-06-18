package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Cálculo de dois números");
		System.out.println("===========================\n");

		System.out.println(
				"Escolha o tipo de cálculo: S -> soma // Sub -> subtração // M -> multiplicação // D -> divisão");
		String calculo = scan.next();

		System.out.println("\nDigite o primeiro número:");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo número:");
		double num2 = scan.nextDouble();

		// Cálculo das operações
		double soma = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;

		switch (calculo) {
		case "S":
			System.out.println("\nResultado soma = " + soma);
			if (soma > 0) {
				System.out.println("\nEste número é positivo.");
			} else {
				System.out.println("\nEste número é negativo.");
			}
			if (soma % 1 != 0) {
				System.out.println("Este número é decimal");
			} else {
				System.out.println("Este número é inteiro");
			}
			if (soma % 2 == 0) {
				System.out.println("Este número é par");
			} else {
				System.out.println("Este número é ímpar");
			}
			break;

		case "Sub":
			System.out.println("\nResultado subtração = " + sub);
			if (sub > 0) {
				System.out.println("\nEste número é positivo.");
			} else {
				System.out.println("\nEste número é negativo.");
			}
			if (sub % 1 != 0) {
				System.out.println("Este número é decimal");
			} else {
				System.out.println("Este número é inteiro");
			}
			if (sub % 2 == 0) {
				System.out.println("Este número é par");
			} else {
				System.out.println("Este número é ímpar");
			}
			break;

		case "M":
			System.out.println("\nResultado multiplicação = " + mult);

			if (mult > 0) {
				System.out.println("\nEste número é positivo.");
			} else {
				System.out.println("\nEste número é negativo.");
			}
			if (mult % 1 != 0) {
				System.out.println("Este número é decimal");
			} else {
				System.out.println("Este número é inteiro");
			}
			if (mult % 2 == 0) {
				System.out.println("Este número é par");
			} else {
				System.out.println("Este número é ímpar");
			}
			break;

		case "D":
			System.out.println("\nResultado divisão = " + div);

			if (div > 0) {
				System.out.println("\nEste número é positivo.");
			} else {
				System.out.println("\nEste número é negativo.");
			}
			if (div % 1 != 0) {
				System.out.println("Este número é decimal");
			} else {
				System.out.println("Este número é inteiro");
			}
			if (div % 2 == 0) {
				System.out.println("Este número é par");
			} else {
				System.out.println("Este número é ímpar");
			}
			break;
		default: System.out.println("Opção inexistente!");
		}
		scan.close();
	}
}