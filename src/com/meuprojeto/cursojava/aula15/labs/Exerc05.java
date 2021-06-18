package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Boletim escolar = duas notas e a média");
		System.out.println("===========================\n");
		
		System.out.println("Entre com a 1ª nota:");
		double  nota1 = scan.nextDouble();
		
		System.out.println("Entre com a 1ª nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		System.out.println("Nota média = "  + media);
		
		if(media >= 7 && media < 10) {
			System.out.println("Aprovado(a)! :)");
		} else if(media < 7) {
			System.out.println("Reprovado(a) :(");
		} else if (media == 10) {
			System.out.println("Aprovado(a) com distinção!!!");
		} else {
			System.out.println("Nota não corresponde ao escopo.");
		}
		scan.close();
	}

}
