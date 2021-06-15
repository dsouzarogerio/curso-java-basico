package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cálculo da área do quadrado");
		System.out.println("======================================");
		
		System.out.println("Digite o valor do lado do quadrado");
		double ladoQuadrado = scan.nextDouble();
		
		double areaQuadrado = Math.pow(ladoQuadrado, 2);
		System.out.println("Resultado da área do quadrado = " + areaQuadrado);
		
		System.out.println("Valor da área do quadrado em dobro = " + (2 * areaQuadrado ));
		
		scan.close();
		}

}
