package com.meuprojeto.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com 5 números:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();

		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println(num1 + " é maior");
		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println(num2 + " é maior");
		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println(num3 + " é maior");
		} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println(num4 + " é maior");
		} else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			System.out.println(num5 + " é maior");
		}
	}
}
