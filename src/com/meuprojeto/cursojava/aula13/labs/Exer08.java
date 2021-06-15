package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cálculo salarial");
		System.out.println("======================================");
		
		System.out.println("Digite o valor do salário por hora:");
		double salHora = scan.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas no Mês:");
		double hsTrabahadasMes = scan.nextDouble();
		
		double calculoSalario = salHora * hsTrabahadasMes;
		System.out.println("Valor do salário no mês = " + calculoSalario);
		
		scan.close();
	}

}
