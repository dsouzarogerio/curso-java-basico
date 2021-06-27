package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Mostrar o maior e o menor de 3 números");
		System.out.println("===========================\n");

		System.out.println("Digite o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro número:");
		int num3 = scan.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Num 1 é maior = " + num1);
		} else if (num1 <= num2 && num1 <= num3) {
			System.out.println("Num 1 é menor = " + num1);
		} 
		
		if (num2 >= num1 && num2 >= num3) {
			System.out.println("Num 2 é maior = " + num2);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("Num 2 é menor = " + num2);
		} 
		
		if (num3 >= num1 && num3 >= num2) {
			System.out.println("Num 3 é maior = " + num3);
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.println("Num 3 é menor = " + num3);
		}
	scan.close();
	}
}