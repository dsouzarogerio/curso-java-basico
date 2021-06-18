package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Caixa Eletrônico");
		System.out.println("===========================\n");

		System.out.println("Digite o valor do saque:");
		int valorSaque = scan.nextInt();

		if (valorSaque >= 10 && valorSaque <= 600) {
			System.out.println("Valor de saque disponível = (R$)" + valorSaque + "\n");

			// Verificações de notas
			int n1 = valorSaque / 100;
			int n2 = (valorSaque % 100) / 50;
			int n3 = ((valorSaque % 100) % 50) / 10;
			int n4 = ((valorSaque % 100) % 50) % 10 / 5;
			int n5 = ((valorSaque % 100) % 50) % 10 % 5 / 1;

			if (n1 >= 1 && n1<= 6) {
				System.out.println("Quantidade de notas de 100 = " + n1);
			}
			if (n2 >= 1) {
				System.out.println("Quantidade de notas de 50 = " + n2);
				}
			if (n3 >= 1 && n3 <= 4) {
			System.out.println("Quantidade de notas de 10 = " + n3);
			}
			if (n4 >= 1) {
			System.out.println("Quantidade de notas de 5 = " + n4);
			}
			if (n5 >= 1 && n5 <= 4)
			System.out.println("Quantidade de notas de 1 = " + n5);
		} 
		
		else {
			System.out.println("Valor não disponível para saques menores de R$ 10,00 e acima de R$ 600,00.");
		}
		scan.close();
	}
}