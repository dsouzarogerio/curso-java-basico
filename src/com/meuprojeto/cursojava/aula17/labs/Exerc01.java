package com.meuprojeto.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// pedir nota entre 0 e 10
		System.out.println("Digite uma nota entre 0 e 10:");
		int nota = scan.nextInt();
		
		//valida se nota � menor que 0 e maior que 10
		if (nota < 0 || nota > 10) {
			System.out.println("Digite novamente");
			nota = scan.nextInt();
		}
		//valida valores entre 0 e 10
		switch (nota) {
		case 0:
			System.out.println("nota v�lida");
			break;
		case 1:
			System.out.println("nota v�lida");
			break;
		case 2:
			System.out.println("nota v�lida");
			break;
		case 3:
			System.out.println("nota v�lida");
			break;
		case 4:
			System.out.println("nota v�lida");
			break;
		case 5:
			System.out.println("nota v�lida");
			break;
		case 6:
			System.out.println("nota v�lida");
			break;
		case 7:
			System.out.println("nota v�lida");
			break;
		case 8:
			System.out.println("nota v�lida");
			break;
		case 9:
			System.out.println("nota v�lida");
			break;
		case 10:
			System.out.println("nota v�lida");
			break;
		default:
			System.out.println("valor inv�lido");
		}
	}
}
