package com.meuprojeto.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com 5 números:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		
		int soma = num1 + num2 + num3 + num4 + num5;
		double media = soma / 5;
		
		System.out.println("total da soma: " + soma);
		System.out.println("valor média: " + media);
	}

}
