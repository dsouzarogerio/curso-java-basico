package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("N�mero inteiro ou decimal");
		System.out.println("===========================\n");

		System.out.println("Digite um n�mero");
		
		double num = scan.nextDouble();
		
		if (num % 1 != 0) {
			System.out.println("� decimal");
		} else {
			System.out.println("� inteiro");
		}
		scan.close();
	}

}
