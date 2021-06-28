package com.meuprojeto.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ler usuario e senha
		System.out.println("Entre com o nome do usuário:");
		String usuario = scan.next();
		
		System.out.println("Entre com a senha:");
		String senha = scan.next();
		
		int i = 0;
		for(i=0; i< 2; i++) {
		if (senha.equalsIgnoreCase(usuario)) {
			System.out.println("Senha inválida, digite senha diferente do nome do usuário.");
			senha = scan.next();
		} else {
			System.out.println("senha válida");
		}
	}
}}
