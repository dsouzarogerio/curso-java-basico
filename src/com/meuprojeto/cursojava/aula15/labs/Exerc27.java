package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Ofertas na Fruteria");
		System.out.println("===========================\n");

		// selecionar o tipo de produto
		System.out.println("Entre com o tipo do produto");
		String produto = scan.next();

		System.out.println("Entre com a quantidade em kg");
		double qtdKg = scan.nextDouble();
		double vrProduto = qtdKg * 1;

		if (produto.equalsIgnoreCase("Maçã"))
			if (qtdKg <= 5) {
				vrProduto = qtdKg * 1.80;
				System.out.println("Valor da compra = " + vrProduto);
			} else if (qtdKg > 5 && qtdKg <= 8) {
				vrProduto = qtdKg * 1.50;
				System.out.println("Valor da compra = " + vrProduto);
			} else if (qtdKg > 8 || vrProduto >= 25) {
				vrProduto = qtdKg * 1.50;
				double desconto = (vrProduto / 100) * 10;
				double vrTotal = vrProduto - desconto;
				System.out.println("Valor total com desconto = " + vrTotal);
			}

		if (produto.equalsIgnoreCase("Morango")) {
			if (qtdKg <= 5) {
				vrProduto = qtdKg * 2.50;
				System.out.println("Valor da compra = " + vrProduto);
			} else if (qtdKg > 5 && qtdKg < 8) {
				vrProduto = qtdKg * 2.20;
				System.out.println("Valor da compra = " + vrProduto);
			} else if (qtdKg > 8 || vrProduto >= 25) {
				vrProduto = qtdKg * 2.20;
				double desconto = (vrProduto / 100) * 10;
				double vrTotal = vrProduto - desconto;
				System.out.println("Valor total com desconto = " + vrTotal);
			}
			scan.close();
		}
	}
}
