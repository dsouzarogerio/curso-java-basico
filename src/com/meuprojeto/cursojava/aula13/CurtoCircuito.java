package com.meuprojeto.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & 
				verdadeiro; //analisa toda a expressão para executar o resultado
		boolean resultado2 = falso &&
				verdadeiro; //curto circuito -> executa o resultado a partir da primeira expressão 
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		//ordem de precedencia
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
	}

}
