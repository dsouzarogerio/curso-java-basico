package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cálculo do peso ideal");
		System.out.println("======================================");
		
		System.out.println("Digite sua altura:");
		double alturaPessoa = scan.nextDouble();
		
		double calculaPeso = (72.7 * alturaPessoa) - 58;
		System.out.printf("Seu peso ideal é: " +  "%.2f", calculaPeso);
		
		scan.close();
		}

}
