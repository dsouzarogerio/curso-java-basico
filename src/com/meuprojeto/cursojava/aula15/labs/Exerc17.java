package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Buscando ano bissexto ou não");
		System.out.println("===========================\n");
		
		System.out.println("Entre com o ano");
		int ano = scan.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("É bissexto.");
		} else {
			System.out.println("Não é bissexto.");
		}
		scan.close();
	}
}
