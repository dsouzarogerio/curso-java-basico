package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");	
		
		int numero = scan.nextInt();
		
		System.out.println("O n�mero digitado foi:  " + numero);
	
		scan.close();
	}

}
