package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cálculo da área de um círculo");
		System.out.println("======================================");
		
		System.out.println("Digite o valor do raio:");
		double raio = scan.nextDouble();
		
		double areaCirculo = 3.14 * (Math.pow(raio,2));
		System.out.println("Resultado do cáluclo de área do círculo = " + areaCirculo);
		
		scan.close();
	}

}
