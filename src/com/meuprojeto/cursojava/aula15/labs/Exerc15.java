package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lados de um triângulo");
		System.out.println("===========================\n");
		
		System.out.println("Digite os lados do triângulo");
		double lado1 = scan.nextDouble();
		double lado2 = scan.nextDouble();
		double lado3 = scan.nextDouble();
		
		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)){
			System.out.println("Isto é um triângulo.");
		} if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
			System.out.println("Triângulo equilátero");
		} 
		else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			System.out.println("Triângulo isósceles.");
		} 
		else if(lado1 != lado2 || lado2 != lado3 || lado1 != lado3) {
			System.out.println("Triângulo escaleno.");
		}
		scan.close();
	}
}
