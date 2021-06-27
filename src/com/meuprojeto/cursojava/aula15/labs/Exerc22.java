package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Número par ou ímpar");
		System.out.println("===========================\n");

		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("Este número é par.");
		} else {
			System.out.println("Este número é ímpar.");
		}
		scan.close();
	}

}
