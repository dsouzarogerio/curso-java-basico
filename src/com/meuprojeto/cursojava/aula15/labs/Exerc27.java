package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Ofertas na Fruteria");
		System.out.println("===========================\n");

		// selecionar o tipo de produto
		System.out.println("Entre com a qtd kg morango");
		double qtdKgMorango = scan.nextDouble();

		System.out.println("Entre com a qtd kg maçã");
		double qtdKgMaca = scan.nextDouble();

		double precoKgMorango = 0;

		if (qtdKgMorango <= 5) {
			precoKgMorango = 2.5;
		} else {
			precoKgMorango = 2.2;
		}

		double precoKgMaca = 0;

		if (qtdKgMaca <= 5) {
			precoKgMaca = 1.8;
		} else {
			precoKgMaca = 1.5;
		}

		double precoTotalMorango = qtdKgMorango * precoKgMorango;
		double precoTotalMaca = qtdKgMaca * precoKgMaca;

		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = precoParcial;

		if ((qtdKgMorango + qtdKgMaca > 8) || precoParcial > 25) {
			precoTotal = precoParcial - (precoParcial / 100) * 10;
		}
		System.out.println("Preço Total = " + precoTotal);

		scan.close();
	}
}
