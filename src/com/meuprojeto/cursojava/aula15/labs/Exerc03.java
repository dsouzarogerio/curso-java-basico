package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Exibir orienta��o sexual -> M = Masculino, F = Feminino ou O = Outra");
		System.out.println("===========================\n");

		String genero = scan.next();

		if (genero.equalsIgnoreCase("F")) {
			System.out.println("Feminino.");
		} else if (genero.equalsIgnoreCase("M")) {
			System.out.println("Masculino.");
		} else if (genero.equalsIgnoreCase("O")) {
			System.out.println("Outra orienta��o.");
		} else {
			System.out.println("Orienta��o n�o encontrada.");
		}
		scan.close();
	}
}
