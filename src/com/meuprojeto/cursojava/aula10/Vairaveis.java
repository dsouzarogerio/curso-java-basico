package com.meuprojeto.cursojava.aula10;

public class Vairaveis {

	public static void main(String[] args) {
		
		//Segue a convencao
		int idade = 25;
		String nomePessoa = "Janaina";
		String nomeCachorro = "Shakira";
		String ano2021 = "2021";

		//Aceitas, mas não utilizadas
		int _idade;
		int $idade;
		
		//Não convencionais em Java
		String nome_cachorro;
		String NomeCachorro;
		String Nomecachorro;
//		String nomeCachorro; -> variável duplicada
		
		//compilacao e execucao do programa
		idade = 41; //atribuicao de novo valor para a variavel idade
		
		System.out.println("Nome da pessoa: " + nomePessoa);
		System.out.println("Nome do cachorro(a): " + nomeCachorro);
		System.out.println("Idade da pessoa: " + idade);
		System.out.println("Ano: " + ano2021);
		
		//é uma má prática, não escolher variáveis que facilite o 
		//entendimento na leitura do código
		int a = 30;
		String b = "Rogério";
	}
}
