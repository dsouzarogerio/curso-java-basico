package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("C�lculo salarial");
		System.out.println("======================================");
		
		System.out.println("Digite o valor do sal�rio por hora:");
		double salHora = scan.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas no M�s:");
		double hsTrabahadasMes = scan.nextDouble();
		
		double calculoSalario = salHora * hsTrabahadasMes;
		System.out.println("Valor do sal�rio no m�s = " + calculoSalario);
		
		scan.close();
	}

}
