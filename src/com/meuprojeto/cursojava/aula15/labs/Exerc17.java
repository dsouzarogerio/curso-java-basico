package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Buscando ano bissexto ou n�o");
		System.out.println("===========================\n");
		
		System.out.println("Digite um n�mero de 1 a 5 e descubra se o ano foi bissexto ou n�o");
		int numero = scan.nextInt();
		switch(numero) {
		case 1: System.out.println("1996 - bissexto"); break;
		case 2: System.out.println("2003 - n�o - bissexto"); break;
		case 3: System.out.println("2004 - bissexto"); break;
		case 4: System.out.println("2100 - n�o - bissexto"); break;
		case 5: System.out.println("2020 - bissexto"); break;
		default: System.out.println("N�mero inv�lido");
		}
		scan.close();
	}

}
