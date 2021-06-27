package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Combust�vel com desconto");
		System.out.println("===========================\n");

		System.out.println("Tipo de combust�vel:");
		// Selecionar o tipo de combusivel
		String tipoComb = scan.next();

		System.out.println("Quantidade de litros de combust�vel:");
		double qtdLitros = scan.nextDouble();

		switch (tipoComb) {
		case "A":
			System.out.println("�lcool");
			
			// calcula valor a ser pago no Alcool
			double vrPagoAlcool = qtdLitros * 1.90;
			System.out.printf("Valor sem desconto = (R$)" + "%.2f", vrPagoAlcool);

			// condi��es de desconto alcool
			if (qtdLitros <= 20) {
				double vrDesconto = (vrPagoAlcool / 100) * 3;
				double vrComDescA = vrPagoAlcool - vrDesconto;
				System.out.printf("\nValor do desconto (-) = (R$)" + "%.2f", vrDesconto);
				System.out.printf("\nValor a ser pago = (R$)" + "%.2f", vrComDescA);
			} else if (qtdLitros > 20) {
				double vrDesconto = (vrPagoAlcool / 100) * 5;
				double vrComDescA = vrPagoAlcool - vrDesconto;
				System.out.printf("\nValor do desconto (-) = (R$)" + "%.2f", vrDesconto);
				System.out.printf("\nValor a ser pago = (R$)" + "%.2f", vrComDescA);
			}
			break;
		case "G":
			System.out.println("Gasolina");
			
			// calcula valor combust�vel
			double vrPagoGas = qtdLitros * 2.50;
			System.out.printf("Valor sem desconto = (R$)" + "%.2f", vrPagoGas);

			// condi��es de desconto gasolina
			if (qtdLitros <= 20) {
				double vrDesconto = (vrPagoGas / 100) * 4;
				double vrComDescG = vrPagoGas - vrDesconto;
				System.out.printf("\nValor do desconto (-) = (R$)" + "%.2f", vrDesconto);
				System.out.printf("\nValor a ser pago = (R$)" + "%.2f", vrComDescG);
			} else if (qtdLitros > 20) {
				double vrDesconto = (vrPagoGas / 100) * 6;
				double vrComDescG = vrPagoGas - vrDesconto;
				System.out.printf("\nValor do desconto (-) = (R$)" + "%.2f", vrDesconto);
				System.out.printf("\nValor a ser pago = (R$)" + "%.2f", vrComDescG);
			}
			break;
		default:
			System.out.println("Tipo de combust�vel n�o existe.");
		}
		scan.close();
	}
}
