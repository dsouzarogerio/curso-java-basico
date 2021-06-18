package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Formatação número");
		System.out.println("===========================\n");
		
		System.out.println("Entre com as 3 notas:");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 7 && media < 10) {
			System.out.println(media + " APROVADO(A).");
		} else if(media < 7) {
			System.out.println(media + " REPROVADO(A).");
		}if(media == 10) {
			System.out.println(media + " APROVADO(A) COM DISTINÇÃO!");
		}
		scan.close();
	}

}
