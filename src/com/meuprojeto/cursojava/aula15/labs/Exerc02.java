package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Mostrar se o número inteiro é positivo ou negativo");
		System.out.println("===========================\n");
		
		System.out.println("Digite um número inteiro:");
		int num = scan.nextInt();
		
		if (num > 0) {
			System.out.println("Este número é positivo");
		} else if (num < 0){
			System.out.println("Este número é negativo");
		} else {
			System.out.println("Este número é neutro.");
		}
		scan.close();
		
		
	}

}
