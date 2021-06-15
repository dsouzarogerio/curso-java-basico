package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");	
		
		int numero = scan.nextInt();
		
		System.out.println("O número digitado foi:  " + numero);
	
		scan.close();
	}

}
