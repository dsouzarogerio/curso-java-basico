package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Mostrar o maior de 3 números");
		System.out.println("===========================\n");

		System.out.println("Entre com os 3 números:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 > num2 & num1 > num3) {
			System.out.println("O maior número é: " + num1);
		} else if(num2 > num1 & num2 > num3) {
			System.out.println("O maior número é: " + num2);
		} else if (num3 > num1 & num3 > num2){
			System.out.println("O maior número é: " + num3);
		}
		scan.close();
	}
}
