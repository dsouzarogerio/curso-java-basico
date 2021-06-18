package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Exibir orientação sexual -> M = Masculino, F = Feminino ou O = Outra");
		System.out.println("===========================\n");

		String genero = scan.next();

		if (genero.equalsIgnoreCase("F")) {
			System.out.println("Feminino.");
		} else if (genero.equalsIgnoreCase("M")) {
			System.out.println("Masculino.");
		} else if (genero.equalsIgnoreCase("O")) {
			System.out.println("Outra orientação.");
		} else {
			System.out.println("Orientação não encontrada.");
		}
		scan.close();
	}
}
