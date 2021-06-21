package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 0;

		System.out.println("Questionário de investigação");
		System.out.println("===========================\n");

		System.out.println("Responda SIM ou Não para as perguntas abaixo:");

		System.out.println("\nTelefonou para a vítima?");
		String resposta1 = scan.next();
		switch (resposta1) {
		case "SIM":
			System.out.println("Sua resposta é SIM");
			break;
		case "NÃO":
			System.out.println("Sua resposta é NÃO");
			break;
		default:
			System.out.println("Opção inexistente.");
		}

		System.out.println("\nEsteve no local do crime?");
		String resposta2 = scan.next();
		switch (resposta2) {
		case "SIM":
			System.out.println("Sua resposta é SIM");
			break;
		case "NÃO":
			System.out.println("Sua resposta é NÃO");
			break;
		default:
			System.out.println("Opção inexistente.");
		}

		System.out.println("\nMora perto da vítima?");
		String resposta3 = scan.next();
		switch (resposta3) {
		case "SIM":
			System.out.println("Sua resposta é SIM");
			break;
		case "NÃO":
			System.out.println("Sua resposta é NÃO");
			break;
		default:
			System.out.println("Opção inexistente.");
		}

		System.out.println("\nDevia para a vítima?");
		String resposta4 = scan.next();
		switch (resposta4) {
		case "SIM":
			System.out.println("Sua resposta é SIM");
			break;
		case "NÃO":
			System.out.println("Sua resposta é NÃO");
			break;
		default:
			System.out.println("Opção inexistente.");
		}
		
		System.out.println("\nJá trabalhou com a vítima?");
		String resposta5 = scan.next();
		switch (resposta5) {
		case "SIM":
			System.out.println("Sua resposta é SIM");
			break;
		case "NÃO":
			System.out.println("Sua resposta é NÃO");
			break;
		default:
			System.out.println("Opção inexistente.");
		}

		// Se resposta SIM == 5 -> assassino
		// Se resposta entre SIM 3 e 4 -> cumplice
		// Se resposta == 2 SIM-> suspeita
		// Se resposta SIM entre 0 e 1 -> inocente

		if (resposta1.equals("SIM")) {
			cont++;
		}
		if (resposta2.equals("SIM")) {
			cont++;
		}
		if (resposta3.equals("SIM")) {
			cont++;
		}
		if (resposta4.equals("SIM")) {
			cont++;
		}
		if (resposta5.equals("SIM")) {
			cont++;
		}
		
		System.out.println("Contabilização de respostas positivas = " + cont);

		if (cont == 5) {
			System.out.println("ASSASSINO");
		} else if (cont >= 3 && cont <= 4) {
			System.out.println("CÚMPLICE");
		} else if (cont == 2) {
			System.out.println("SUSPEITA");
		} else {
			System.out.println("INOCENTE");
		}
		scan.close();
	}
}