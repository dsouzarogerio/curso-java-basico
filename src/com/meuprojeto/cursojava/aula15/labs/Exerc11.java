package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Reajuste salarial");
		System.out.println("===========================\n");
		
		System.out.println("Entre com o valor do seu salário:");
		double salario = scan.nextDouble();
		
		if(salario <= 280) {
			double reajuste = salario/100 * 20;
			double salarioAtual = salario + reajuste;
			
			System.out.printf("Valor do salário antes do reajuste (R$): " + "%.2f", salario);
			System.out.println("\nPercentual de ajuste: 20%");
			System.out.printf("Valor do reajuste (R$): " + "%.2f", reajuste);
			System.out.printf("\nSalario reajustado (R$): " + "%.2f", salarioAtual);
			
		} else if (salario > 280 && salario <= 700) {
			double reajuste = salario/100 * 15;
			double salarioAtual = salario + reajuste;
			
			System.out.printf("Valor do salário antes do reajuste (R$): " + "%.2f", salario);
			System.out.println("\nPercentual de ajuste: 15%");
			System.out.printf("Valor do reajuste (R$): " + "%.2f", reajuste);
			System.out.printf("\nSalário reajustado (R$): " + "%.2f",salarioAtual);
			
		} else if(salario > 700 && salario <= 1500) {
			double reajuste = salario/100 * 10;
			double salarioAtual = salario + reajuste;
			
			System.out.printf("Valor do salario antes do reajuste (R$): " + "%.2f", salario);
			System.out.println("\nPercentual de ajuste: 10%.");
			System.out.printf("Valor do reajuste (R$): " + "%.2f", reajuste);
			System.out.printf("\nSalário reajustado (R$): " + "%.2f", salarioAtual);
			
		}  else if(salario > 1500) {
			double reajuste = salario/100 * 5;
			double salarioAtual = salario + reajuste;
			
			System.out.printf("Valor do salario antes do reajuste (R$): " + "%.2f", salario);
			System.out.println("\nPercentual de ajuste: 5%.");
			System.out.printf("Valor do reajuste (R$): " + "%.2f", reajuste);
			System.out.printf("\nSalário reajustado (R$): " + "%.2f", salarioAtual);
			
		}
		scan.close();
	}

}
