package com.meuprojeto.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ler e validar informações
		System.out.println("-----\tEntre com as informações:\t-----");

		int i = 0;
		for (i = 0; i < 2; i++) {
			System.out.println("Digite seu nome:");
			String nome = scan.next();
			if (nome.length() < 3) {
				System.out.println("Informação inválida");
			}
			System.out.println("Entre com a sua idade");
			int idade = scan.nextInt();
			if (idade < 0 || idade >= 150) {
				System.out.println("valor inválido");
			}
			System.out.println("Entre com o valor do salário");
			double salario = scan.nextDouble();
			if (salario <= 0) {
				System.out.println("valor inválido");
			}
			System.out.println("Digite o sexo: m -> masculino ou f -> feminino");
			String sexo = scan.next();
			if (sexo.equalsIgnoreCase("m")) {
				System.out.println("Masculinho");
			} else if (sexo.equalsIgnoreCase("f")) {
				System.out.println("Feminino");
			} else {
				System.out.println("valor inválido");
			}
			System.out.println("Entre com o seu estado civil s -> solteiro(a)/ c -> casado(a)/ "
					+ "v -> viuvo(a)/ d -> divorciado(a)");
			String estadoCivil = scan.next();
			switch (estadoCivil) {
			case "s":
				System.out.println("Solteiro(a)");
				break;
			case "c":
				System.out.println("Casado(a)");
				break;
			case "v":
				System.out.println("Viúvo(a)");
				break;
			case "d":
				System.out.println("Divorciado(a)");
				break;
			default:
				System.out.println("valor inválido");
				break;
			}
		}
	}
}