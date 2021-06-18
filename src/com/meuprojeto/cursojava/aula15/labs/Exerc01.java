package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mostrar o maior número entre dois números");
		System.out.println("===========================\n");
		
		System.out.println("Entre com o primeiro número:");
		int num1 = scan.nextInt();

		System.out.println("Entre com o segundo número:");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro número é maior: " + num1);
		}else {
			System.out.println("O segundo número é maior: " + num2);
		}
		scan.close();
	}

}
