package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("ALfaBeTo = Consoante ou vogal");
		System.out.println("===========================\n");

		System.out.println("Digite uma letra do alfabeto:");
		String alfabeto = scan.next();

		if (alfabeto.equalsIgnoreCase("a")) {
			System.out.printf("A letra " + alfabeto + " é uma vogal.");
		} else if (alfabeto.equalsIgnoreCase("e")) {
			System.out.printf("A letra " + alfabeto + " é uma vogal.");
		} else if (alfabeto.equalsIgnoreCase("i")) {
			System.out.printf("A letra " + alfabeto + " é uma vogal.");
		} else if (alfabeto.equalsIgnoreCase("o")) {
			System.out.printf("A letra " + alfabeto + " é uma vogal.");
		} else if (alfabeto.equalsIgnoreCase("u")) {
			System.out.printf("A letra " + alfabeto + " é uma vogal.");
		} else {
			System.out.printf("A letra " + alfabeto + " é uma consoante.");
		}
		scan.close();
	}

}
