package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Equação do segundo grau");
		System.out.println("===========================\n");

		System.out.println("Informe o valor de a:");
		double a = scan.nextDouble();

		if (a == 0) {
			System.out.println("Programa encerrado.");
		} else {
			System.out.println("Informe o valor de b:");
			double b = scan.nextDouble();

			System.out.println("Informe o valor de c:");
			double c = scan.nextDouble();

			// Cálculo de Delta
			double delta = Math.pow(b, 2) - 4 * a * c;
			System.out.println("valor de delta = " + delta);

			// Calculo de X1 e X2
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);

			if (delta < 0) {
				System.out.println("Esta equação não possui raizes reais e será encerrada.");
			} 
			else if (delta == 0) {
				System.out.println("O valor de x = " + x1);
			} 
			else if (delta > 0) {
				System.out.println("O valor de x1 = " + x1);
				System.out.println("O valor de x2 = " + x2);
			}
		}
		scan.close();
	}
}