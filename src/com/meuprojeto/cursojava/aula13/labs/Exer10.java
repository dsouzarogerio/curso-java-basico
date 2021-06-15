package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Conversão de temperatura de Celsius para Farenheit");
		System.out.println("======================================");
		
		System.out.println("Digite o valor da temperatura em Celsius");
		double valorCelsius = scan.nextDouble();
		double convParaFarenheit = 32 + (valorCelsius * 9 / 5);
		System.out.println("O valor da temperatura Celsius de " + valorCelsius + "°C " 
				+ "em Farenheit = " +  convParaFarenheit + "°F");	
		
		scan.close();
		
	}

}
