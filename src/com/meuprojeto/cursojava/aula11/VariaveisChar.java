package com.meuprojeto.cursojava.aula11;

public class VariaveisChar {

	public static void main(String[] args) {
//		char o = 'o';
//		char i = 'i';
		
		//atribuindo valores das vari�veis em ASCII
		char o = 111;
		char i = 105;
		char interrogacao = 0x00e1; //valor UNICODE =  á
		
		System.out.println(o+i); //printa a soma do valor em ASCCII
		System.out.println(""+o+i); //"" formata para printar o valor em caracter
		System.out.println(""+o+i + interrogacao);
	}

}
