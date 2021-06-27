package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mostrar o produto mais barato");
		System.out.println("===========================\n");
		
		System.out.println("Digite o preço 1: ");
		double preco1 = scan.nextDouble(); 
		
		System.out.println("Digite o preço 2: ");
		double preco2 = scan.nextDouble(); 
		
		System.out.println("Digite o preço 3: ");
		double preco3 = scan.nextDouble(); 
		
		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.printf("O preço 1 é o mais barato = " + preco1);
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.printf("O preço 2 é o mais barato = " + preco2);
		} else if(preco3 <= preco1 && preco3 < preco2) {
			System.out.printf("O preço 3 é o mais barato = " + preco3);
		}
	scan.close();
	}
}
