package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Mostrar o maior e o menor de 3 n�meros");
		System.out.println("===========================\n");

		System.out.println("Digite o primeiro n�mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro n�mero:");
		int num3 = scan.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Num 1 � maior = " + num1);
		} else if (num1 <= num2 && num1 <= num3) {
			System.out.println("Num 1 � menor = " + num1);
		} 
		
		if (num2 >= num1 && num2 >= num3) {
			System.out.println("Num 2 � maior = " + num2);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("Num 2 � menor = " + num2);
		} 
		
		if (num3 >= num1 && num3 >= num2) {
			System.out.println("Num 3 � maior = " + num3);
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.println("Num 3 � menor = " + num3);
		}
	scan.close();
	}
}