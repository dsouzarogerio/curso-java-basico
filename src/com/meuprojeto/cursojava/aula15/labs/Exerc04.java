package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("ALfaBeTo = Consoante ou vogal");
		System.out.println("===========================\n");

		System.out.println("Digite uma letra do alfabeto:");
		String alfabeto = scan.next();

		/*
		 * if (alfabeto.equalsIgnoreCase("a") || alfabeto.equalsIgnoreCase("e") ||
		 * alfabeto.equalsIgnoreCase("i") || alfabeto.equalsIgnoreCase("o") ||
		 * alfabeto.equalsIgnoreCase("u")) { System.out.printf("vogal."); } else {
		 * System.out.println("consoante."); }
		 */

		if (alfabeto.length() > 1) {
			System.out.println("Não é uma letra válida.");
		} else {
			switch (alfabeto) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("vogal");
				break;
			default:
				System.out.println("consoante");
			}
		}
		scan.close();
	}

}
