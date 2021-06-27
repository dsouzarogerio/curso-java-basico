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

		int percentualIR = 0;

		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}

		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double sindicato = (salarioBruto / 100) * 3;
		double totalDescontos = ir + sindicato + inss;
		double salLiquido = salarioBruto - totalDescontos;

		System.out.println("Salário Bruto (" + vrHora + " * " + hsTrab + ") ----------:R$" + salarioBruto);
		System.out.println("( - ) IR (" + percentualIR + "%) --------------------------:R$" + ir);
		System.out.println("( - ) INSS ( 10%) ----------------------------------------: R$" + inss);
		System.out.println("( - )Sindicato  ---------------------------------------------:R$" + sindicato);
		System.out.println("FGTS ------------------------------------------------------:R$" + fgts);
		System.out.println("Total de descontos -----------------------------------------:R$" + totalDescontos);
		System.out.println("Salário Liquido:---------------------------------------------:R$" + salLiquido);
	
		scan.close();
	}
}