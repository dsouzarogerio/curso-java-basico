package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Formatação número");
		System.out.println("===========================\n");
		
		System.out.println("Entre com o primeiro número:");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo número:");
		int num2 = scan.nextInt();
		System.out.println("Entre com o segundo número:");
		int num3 = scan.nextInt();
		
		int num = (num1 *100) + (num2 * 10) + num3;
		
		System.out.println("O número é: " + num);
		
		if (num < 1000) {
			System.out.println(num1 + " centena(s), " + num2 + " dezena(s)" + " e " + num3 + " unidade(s).");
		} else {
			System.out.println("Número inválido");
		}
		scan.close();
	}
}
