package com.meuprojeto.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosDoTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Digite seu nome completo:");
//		String nomeCompleto = scan.nextLine();
//		System.out.println("Seu nome compelto é: " + nomeCompleto);
//		
//		System.out.println("Digite seu primeiro nome:");
//		String primeiroNome = scan.next();
//		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
//		System.out.println("Digite sua idade:");
//		int idade = scan.nextInt();
//		System.out.println("Sua idade é: " + idade);
//		
//		System.out.println("Digite sua altura:");
//		double altura = scan.nextDouble();
//		System.out.println("Sua altura é: " + altura);
		
		System.out.println("Digite o seu primeiro nome, idade, altura, quantidade de filhos e se tem pet:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		float altura = scan.nextFloat();
		byte qtdFilhos = scan.nextByte();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Filhos: " + qtdFilhos);
		System.out.println("Você tem pet? " + temPet);
		
		scan.close();
	}
}