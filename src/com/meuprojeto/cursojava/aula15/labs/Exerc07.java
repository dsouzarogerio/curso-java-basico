package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Mostrar o maior e o menor de 3 n�meros");
		System.out.println("===========================\n");

		System.out.println("Digite 3 numeros:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 > num2 & num1 > num3) {
			System.out.println("O maior n�mero �: " + num1);
		} else if (num1 < num2 & num1 < num3) {
			System.out.println("O menor n�mero �: " + num1);
		} 
		
		if (num2 > num1 & num2 > num3) {
			System.out.println("O maior n�mero �: " + num2);
		} else if (num2 < num1 & num2 < num3) {
			System.out.println("O menor n�mero �: " + num2);
		} 
		
		if (num3 > num1 & num3 > num2) {
			System.out.println("O maior n�mero �: " + num3);
		} else if (num3 < num1 & num3 < num2) {
			System.out.println("O menor n�mero �: " + num3);
		}
	scan.close();
	}
}