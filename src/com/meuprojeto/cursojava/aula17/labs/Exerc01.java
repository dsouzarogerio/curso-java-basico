package com.meuprojeto.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// pedir nota entre 0 e 10
		System.out.println("Digite uma nota entre 0 e 10:");
		int nota = scan.nextInt();
		
		//valida se nota é menor que 0 e maior que 10
		if (nota < 0 || nota > 10) {
			System.out.println("Digite novamente");
			nota = scan.nextInt();
		}
		//valida valores entre 0 e 10
		switch (nota) {
		case 0:
			System.out.println("nota válida");
			break;
		case 1:
			System.out.println("nota válida");
			break;
		case 2:
			System.out.println("nota válida");
			break;
		case 3:
			System.out.println("nota válida");
			break;
		case 4:
			System.out.println("nota válida");
			break;
		case 5:
			System.out.println("nota válida");
			break;
		case 6:
			System.out.println("nota válida");
			break;
		case 7:
			System.out.println("nota válida");
			break;
		case 8:
			System.out.println("nota válida");
			break;
		case 9:
			System.out.println("nota válida");
			break;
		case 10:
			System.out.println("nota válida");
			break;
		default:
			System.out.println("valor inválido");
		}
	}
}
