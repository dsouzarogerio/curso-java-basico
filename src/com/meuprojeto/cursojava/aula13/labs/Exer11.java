package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cálculos entre números inteiros e reais");
		System.out.println("======================================");
		
		System.out.println("Digite num1:");
		int num1 = scan.nextInt();
		System.out.println("Digite num2:");
		int num2 = scan.nextInt();
		System.out.println("Digite num3:");
		float num3 = scan.nextFloat();
		
		double calculo01 = (2*num1) *(num2/2);
		System.out.println("Resultado cálculo01 = " + calculo01);
		
		double calculo02 = (3*num1) + num3;
		System.out.println("Resultado cálculo02 = " + calculo02);
		
		double calculo03 = Math.pow(num3, 3);
		System.out.println("Resultado cálculo03 = " + calculo03);
		
		scan.close();
		}
}