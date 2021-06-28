package com.meuprojeto.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de habitantes do pa�s A:");
		double popA = scan.nextDouble();
		if(popA < 0) {
			System.out.println("Valor inv�lido, repita novamente:");
			popA = scan.nextDouble();
		}
		
		System.out.println("Entre com a quantidade de habitantes do pa�s B:");
		double popB = scan.nextDouble();
		if(popB < 0) {
			System.out.println("Valor inv�lido, repita novamente:");
			popB = scan.nextDouble();
		}
		
		System.out.println("Entre com a taxa de crescimento do pa�s A:");
		double taxaA = (scan.nextDouble()) / 100;
		
		System.out.println("Entre com a taxa de crescimento do pa�s B:");
		double taxaB = (scan.nextDouble()) / 100;

		int ano = 0;

		while (popA < popB) {
			ano++;
			popA = popA + (popA * taxaA);
			popB = popB + (popB * taxaB);
		}

		System.out.printf("Ap�s %d anos o pa�s A ultrapassou B em quantidade de habitantes.", ano);

		System.out.printf("\nPopula��o A: %.2f", popA);
		System.out.printf("\nPopula��o B: %.2f", popB);
	}
}