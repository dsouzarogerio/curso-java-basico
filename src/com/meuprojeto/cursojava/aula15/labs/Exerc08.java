package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mostrar o produto mais barato");
		System.out.println("===========================\n");
		
		System.out.println("Digite o preço do produto 1: ");
		double prod1 = scan.nextDouble(); 
		
		System.out.println("Digite o preço do produto 2: ");
		double prod2 = scan.nextDouble(); 
		
		System.out.println("Digite o preço do produto 3: ");
		double prod3 = scan.nextDouble(); 
		
		if (prod1 < prod2 & prod1 < prod3) {
			System.out.printf("O valor do produto 1 é o mais barato!");
		} else if (prod2 < prod1 & prod2 < prod3) {
			System.out.printf("O valor do produto 2 é o mais barato!");
		} else if(prod3 < prod1 & prod3 < prod2) {
			System.out.printf("O valor do produto 3 é o mais barato!");
		}
	scan.close();
	}
}
