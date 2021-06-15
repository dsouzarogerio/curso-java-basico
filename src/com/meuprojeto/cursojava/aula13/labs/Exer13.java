package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cálculo seu salário");
		System.out.println("======================================");
		
		System.out.println("Qual o valor do seu salário por hora (R$)?");
		double salHora = scan.nextDouble();
		System.out.println("Quantas horas você trabalha por mês(hs)?");
		int hsTrabalhadas = scan.nextInt();
		
		double calculoSalBruto = salHora * hsTrabalhadas;
		System.out.println("Valor do salário bruto: " + "R$" + calculoSalBruto);
		
		double descInss = (calculoSalBruto * 5/100);
		double descIR = (calculoSalBruto * 8/100);
		double descSind = (calculoSalBruto * 5/100);
		
		System.out.println("Desconto INSS: " + "R$" + descInss);
		System.out.println("Desconto IR: " + "R$" + descIR);
		System.out.println("Desconto Sindicato: " + "R$" + descSind);
		
		double salLiquido = calculoSalBruto - descInss - descIR - descSind;
		
		System.out.printf("Valor do salário líquido = " + "R$" + "%.2f", salLiquido);
		
		scan.close();
	}

}
