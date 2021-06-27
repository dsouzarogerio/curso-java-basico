package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Promo��o de carnes Tabajara");
		System.out.println("===========================\n");

		// calculo do valor
		double qtdCarne = 1;
		double vrKilo = 1;
		double valorCarne = qtdCarne * vrKilo;
		double cartao = (valorCarne / 100) * 5;
		double vrComDesc = valorCarne - cartao;

		System.out.println("Tipo de carne:");
		String tipoCarne = scan.next();
		switch (tipoCarne) {
		case "F": System.out.println("Fil� Duplo"); break;
		case "A": System.out.println("Alcatra"); break;
		case "P" : System.out.println("Picanha"); break;
		default : System.out.println("Produto inexistente.");
		}
		System.out.println("Entre com a quantidade (Kg):");
		qtdCarne = scan.nextDouble();

		System.out.println("Entre com o valor do kilo (R$)");
		vrKilo = scan.nextDouble();

		if (qtdCarne <= 5) {
			valorCarne = qtdCarne * vrKilo;
			System.out.printf("\nValor sem desconto = (R$)" + "%.2f", valorCarne);
		} else if (qtdCarne > 5) {
			valorCarne = qtdCarne * vrKilo;
			System.out.printf("\nValor sem desconto = (R$)" + "%.2f", valorCarne);
		}
		System.out.println("\nTipo de pagamento");
		String tipoPagamento = scan.next();
		switch (tipoPagamento) {
		case "C": System.out.println("Pagamento no cart�o Tabajara"); break;
		case "D" : System.out.println("Pagamento em dinheiro"); break;
		case "O" : System.out.println("Outros meios de pagamento: PIX e Cart�o de cr�dito"); break;
		default : System.out.println("N�o aceitamos este meio de pagamento.");
		}
		
		if (tipoPagamento.equalsIgnoreCase("C")) {
			cartao = (valorCarne / 100) * 5;
			vrComDesc = valorCarne - cartao;
			System.out.printf("\nValor com desconto no Cart�o Tabajara = (R$)" + "%.2f", vrComDesc);
		}
		scan.close();
	}
	}
