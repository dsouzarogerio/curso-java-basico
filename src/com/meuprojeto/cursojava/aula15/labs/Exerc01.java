package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mostrar o maior n�mero entre dois n�meros");
		System.out.println("===========================\n");
		
		System.out.println("Entre com o primeiro n�mero:");
		int num1 = scan.nextInt();

		System.out.println("Entre com o segundo n�mero:");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro n�mero � maior: " + num1);
		}else {
			System.out.println("O segundo n�mero � maior: " + num2);
		}
		scan.close();
	}

}
