package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Cálculo folha de pagamento");
		System.out.println("===========================\n");

		System.out.println("Entre com o valor do salário/hora:");
		double vrHora = scan.nextDouble();

		System.out.println("Digite as horas trabalhadas no mês:");
		double hsTrab = scan.nextDouble();

		double salarioBruto = vrHora * hsTrab;
		System.out.printf("Valor do salário bruto (R$): " + "%.2f", salarioBruto);

		// Regras desconto IR
		double ir1 = salarioBruto / 100 * 0;
		double ir2 = salarioBruto / 100 * 5;
		double ir3 = salarioBruto / 100 * 10;
		double ir4 = salarioBruto / 100 * 20;

		double sindicato = salarioBruto / 100 * 3;

		double fgts = salarioBruto / 100 * 11;

		double inss = salarioBruto / 100 * 10;

		if (salarioBruto <= 900) {
			System.out.printf("\nDesconto do IR (R$): " + "%.2f", ir1);
			System.out.printf("\nDesconto Sindicato (R$): " + "%.2f", sindicato);
			System.out.printf("\nDesconto do INSS (R$): " + "%.2f", inss);
			System.out.printf("\nFGTS (R$): " + "%.2f", fgts);

			double descontos = ir1 + sindicato + inss;
			System.out.printf("\nTotal de descontos (R$): " + "%.2f", descontos);

			double salLiquido = salarioBruto - descontos;
			System.out.printf("\nSalário Liquido: " + "%.2f", salLiquido);
		}
		
		else if (salarioBruto > 900 && salarioBruto <= 1500) {
			System.out.printf("\nDesconto do IR (R$): " + "%.2f", ir2);
			System.out.printf("\nDesconto Sindicato (R$): " + "%.2f", sindicato);
			System.out.printf("\nDesconto do INSS (R$): " + "%.2f", inss);
			System.out.printf("\nFGTS (R$): " + "%.2f", fgts);

			double descontos = ir2 + sindicato + inss;
			System.out.printf("\nTotal de descontos (R$): " + "%.2f", descontos);
			
			double salLiquido = salarioBruto - descontos;
			System.out.printf("\nSalário Liquido: " + "%.2f", salLiquido);
		}
		else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			System.out.printf("\nDesconto do IR (R$): " + "%.2f", ir3);
			System.out.printf("\nDesconto Sindicato (R$): " + "%.2f", sindicato);
			System.out.printf("\nDesconto do INSS (R$): " + "%.2f", inss);
			System.out.printf("\nFGTS (R$): " + "%.2f", fgts);

			double descontos = ir3 + sindicato + inss;
			System.out.printf("\nTotal de descontos (R$): " + "%.2f", descontos);
			
			double salLiquido = salarioBruto - descontos;
			System.out.printf("\nSalário Liquido: " + "%.2f", salLiquido);
		}
		else if (salarioBruto >2500) {
			System.out.printf("\nDesconto do IR (R$): " + "%.2f", ir4);
			System.out.printf("\nDesconto Sindicato (R$): " + "%.2f", sindicato);
			System.out.printf("\nDesconto do INSS (R$): " + "%.2f", inss);
			System.out.printf("\nFGTS (R$): " + "%.2f", fgts);

			double descontos = ir4 + sindicato + inss;
			System.out.printf("\nTotal de descontos (R$): " + "%.2f", descontos);
			
			double salLiquido = salarioBruto - descontos;
			System.out.printf("\nSalário Liquido: " + "%.2f", salLiquido);
		}
		scan.close();
	}
}