package com.meuprojeto.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Entre com a sua idade:");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade.");
		} else {
			System.out.println("Não é maior de idade.");
		}
		
		//barato <= 10
		//10 < valor < 15 -> pedir desconto
		//15 <= valor 17 -> pesquisar mais
		//valor >= 17 -> muito caro
		
		System.out.println("Entre com o preço do produto:");
		double valor = scan.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Produto barato, pode comprar.");
		} else if(valor > 10 && valor < 15) {
			System.out.println("Você pode solicitar um desconto.");
		} else if(valor >= 15 && valor < 17) {
			System.out.println("Pesquise um pouco mais.");
		} else {// valor >= 17
			System.out.println("Valor está muito caro.");
		}
		scan.close();
		
	}

}
