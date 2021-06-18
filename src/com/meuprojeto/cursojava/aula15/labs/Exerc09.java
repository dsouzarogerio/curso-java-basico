package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Números em ordem descrescente");
		System.out.println("===========================\n");

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		// mostar os números em ordem descrescente

		if (num1 >= num2 && num1 >= num3) {
			if (num2 >= num3) {
				System.out.println("Descrescente: " + num1 + num2 + num3);
			} else {
				System.out.println("Descrescente: " + num1 + num3 + num2);
			}
		}
		if (num2 >= num1 && num2 >= num3) {
			if (num1 >= num2) {
				System.out.println("Descrescente: " + num2 + num1 + num3);
			} else {
				System.out.println("Descrescente: " + num2 + num3 + num1);
			}
		}
		if (num3 >= num1 && num3 >= num2) {
			if (num1 >= num2) {
				System.out.println("Descrescente: " + num3 + num1 + num2);
			} else {
				System.out.println("Descrescente: " + num3 + num2 + num1);
			}
		}
		scan.close();
	}
}