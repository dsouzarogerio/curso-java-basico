package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Convers�o de metros para cent�metros");
		System.out.println("======================================");
		
		System.out.println("Digite o valor em metros:");
		double metro = scan.nextDouble();
		
		double conversao = metro * 100;
		System.out.println("Resultado da convers�o: " + conversao + "cm");
		
		scan.close();
	}

}
