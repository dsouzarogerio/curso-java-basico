package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Conversão de temperatura de Farenheit para Celsius");
		System.out.println("======================================");
		
		System.out.println("Digite o valor da temperatura em Farenheit");
		double tempFarenheit = scan.nextDouble();
		
		double convCelsius = (5 * (tempFarenheit - 32) / 9);
		System.out.printf("O valor da temperatura Farenheit de " + tempFarenheit + "°F " 
									+ "em Celsius = " + convCelsius + "°C");	
		
		scan.close();
	}
}