package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Formata��o n�mero");
		System.out.println("===========================\n");
		
		System.out.println("Entre com o primeiro n�mero:");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo n�mero:");
		int num2 = scan.nextInt();
		System.out.println("Entre com o segundo n�mero:");
		int num3 = scan.nextInt();
		
		int num = (num1 *100) + (num2 * 10) + num3;
		
		System.out.println("O n�mero �: " + num);
		
		if (num < 1000) {
			System.out.println(num1 + " centena(s), " + num2 + " dezena(s)" + " e " + num3 + " unidade(s).");
		} else {
			System.out.println("N�mero inv�lido");
		}
		scan.close();
	}
}
