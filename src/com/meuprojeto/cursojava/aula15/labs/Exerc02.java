package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Mostrar se o n�mero inteiro � positivo ou negativo");
		System.out.println("===========================\n");
		
		System.out.println("Digite um n�mero inteiro:");
		int num = scan.nextInt();
		
		if (num > 0) {
			System.out.println("Este n�mero � positivo");
		} else if (num < 0){
			System.out.println("Este n�mero � negativo");
		} else {
			System.out.println("Este n�mero � neutro.");
		}
		scan.close();
		
		
	}

}
