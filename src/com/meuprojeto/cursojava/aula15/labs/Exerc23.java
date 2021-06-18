package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Número inteiro ou decimal");
		System.out.println("===========================\n");

		System.out.println("Digite um número");
		
		double num = scan.nextDouble();
		
		if (num % 1 != 0) {
			System.out.println("é decimal");
		} else {
			System.out.println("é inteiro");
		}
		scan.close();
	}

}
