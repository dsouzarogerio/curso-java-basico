package com.meuprojeto.cursojava.aula17.labs;

public class Exerc04 {

	public static void main(String[] args) {
		double popA = 80000;
		double popB = 200000;
		double taxaA = 0.03;
		double taxaB = 0.015;

		int ano = 0;

		while (popA < popB) {
			ano++;
			popA = popA + (popA * taxaA);
			popB = popB + (popB * taxaB);
		}

		System.out.printf("Após %d anos o país A ultrapassou B em quantidade de habitantes.", ano);

		System.out.printf("\nPopulação A: %.2f", popA);
		System.out.printf("\nPopulação B: %.2f", popB);
	}
}