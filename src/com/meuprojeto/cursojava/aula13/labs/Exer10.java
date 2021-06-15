package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Conversão de temperatura de Celsius para Farenheit");
		System.out.println("======================================");
		
		System.out.println("Digite o valor da temperatura em Celsius");
		int valorCelsius = scan.nextInt();
		int convParaFarenheit = 32 + (valorCelsius * 9 / 5);
		System.out.println("Conversão de Celsius para Farenheit = " + convParaFarenheit + "°F");
		
		scan.close();
		
	}

}
