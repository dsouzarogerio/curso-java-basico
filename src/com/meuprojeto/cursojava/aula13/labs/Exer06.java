package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cálculo da área de um círculo");
		System.out.println("======================================");
		
		System.out.println("Digite o valor do raio:");
		double raio = scan.nextDouble();
		
		double areaCirculo = Math.PI  * (Math.pow(raio,2));
		System.out.printf("Resultado do cáluclo de área do círculo = " + "%.2f", areaCirculo);
		
		scan.close();
	}

}
