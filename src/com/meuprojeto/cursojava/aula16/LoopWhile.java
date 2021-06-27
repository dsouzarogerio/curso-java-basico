package com.meuprojeto.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; //variaveis usadas em programacao para contadores: "i", "cont" ou "count"
		int max = 10;
		
		System.out.println("Contando até: " + max);
		
		while(i <= max) {
			System.out.println("Valor de i: " + i);
			i++; //<=> i = i + 1; ou i +=1;
		}
		System.out.println("Valor de i fora do loop while: " + i); //valor de i fora do loop == 11
	do {																		// Principal diferença entre os loops while e do - while
		i++;																	//	while - avalia a condicao primeiro e depois executa o bloco de codigo	
		System.out.println("Valor de i: " + i);					//Do - while - Primeiro executa o bloco de codigo e depois avalia a condicao
	} while (i < 11);
	System.out.println(i); //Novo valor de i após o loop (do - while)
	}

}
