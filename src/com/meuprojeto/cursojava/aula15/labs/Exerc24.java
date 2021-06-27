package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("C�lculo de dois n�meros");
		System.out.println("===========================\n");

		System.out.println("Digite o primeiro n�mero:");
		double num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		double num2 = scan.nextInt();

		System.out.println("Escolha o tipo de opera��o ( + - * /):");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "*": resultado = num1 * num2; break;
		case "/": resultado = num1 / num2; break;
		default: System.out.println("Op��o inv�lida!"); valida = false;
		}
		if (valida) {
			if (resultado >= 0) {
				System.out.println("resultado positivo");
			} else {
				System.out.println("resultado negativo");
			} 
			if(resultado % 2 == 0) {
				System.out.println("resultado par");
			} else {
				System.out.println("resultado �mpar");
			}
			if (resultado % 1 > 0) {
				System.out.println("resultado decimal");
			} else {
				System.out.println("resultado inteiro");
			}
		}
		scan.close();
	}
}