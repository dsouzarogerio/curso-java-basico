package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("C�lculo da m�dia de 04 n�meros");
		System.out.println("======================================");
		
		System.out.println("Digita nota1:");
		double nota1 = scan.nextDouble();
		System.out.println("Digita nota2:");
		double nota2 = scan.nextDouble();
		System.out.println("Digita nota3:");
		double nota3 = scan.nextDouble();
		System.out.println("Digita nota4:");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("C�lculo da m�dia = " + media);
		
		scan.close();
	}

}
