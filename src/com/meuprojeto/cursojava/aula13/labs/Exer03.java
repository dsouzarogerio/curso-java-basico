package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Faça o cálculo da soma entre dois números");
		System.out.println("======================================");
		
		System.out.println("Digite o valor 1: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Digite o valor 2: ");
		int valor2 = scan.nextInt();
		
		int resultado = valor1 + valor2;
		System.out.println("valor1 + valor2 = " + resultado);
		
		scan.close();
		}

}
