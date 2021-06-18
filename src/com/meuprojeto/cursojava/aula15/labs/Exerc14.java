package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Boletim escolar");
		System.out.println("===========================\n");

		System.out.println("Digite a nota 1: ");
		double nota1 = scan.nextDouble();

		System.out.println("Digite a nota 2: ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;
		System.out.println("Média: " + media);

		// Regras de mensagem
		String mensagem1 = "APROVADO";
		String mensagem2 = "REPROVADO";

		if (media >= 9 && media <= 10) {
			System.out.println("Conceito A -> " + mensagem1);
		} else if (media >= 7.5 && media < 9) {
			System.out.println("Conceito B -> " + mensagem1);
		} else if (media >= 6 && media < 7.5) {
			System.out.println("Conceito C -> " + mensagem1);
		} else if (media >= 4 && media < 6) {
			System.out.println("Conceito D -> " + mensagem2);
		} else if (media >= 0 && media < 4) {
			System.out.println("Conceito E -> " + mensagem2);
		}
		scan.close();
	}
}