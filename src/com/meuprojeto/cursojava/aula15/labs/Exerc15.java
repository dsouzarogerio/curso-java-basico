package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lados de um tri�ngulo");
		System.out.println("===========================\n");
		
		System.out.println("Digite os lados do tri�ngulo");
		double lado1 = scan.nextDouble();
		double lado2 = scan.nextDouble();
		double lado3 = scan.nextDouble();
		
		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)){
			System.out.println("Isto � um tri�ngulo.");
		} if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
			System.out.println("Tri�ngulo equil�tero");
		} 
		else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			System.out.println("Tri�ngulo is�sceles.");
		} 
		else if(lado1 != lado2 || lado2 != lado3 || lado1 != lado3) {
			System.out.println("Tri�ngulo escaleno.");
		}
		scan.close();
	}
}
