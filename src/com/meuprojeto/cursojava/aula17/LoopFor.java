package com.meuprojeto.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		// No for a variavel é criada e inicializada, é dada a condicao e é atualizada
		// na mesma expressao
		for (int i = 0; i < 5; i++) { // Incremento
			System.out.println("Valor de i: " + i);
		}
		for (int i = 5; i > 0; i--) { // Decremento
			System.out.println("Valor de i: " + i);
		}
		// for com + de uma variável
		for (int i = 0, j = 10; i <= j; i++, j--) {
			System.out.println("i = " + i + " ; " + "j = " + j);
		}
		// for com partes ausentes
		int count = 0;
		for (; count < 10;) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}
		// similar ao exmplo anterior
		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println("Valor de cont: " + cont);
		}
		// for sem corpo
		int soma = 0;
		for (int i = 1; i < 5; soma += i++)
			;

		System.out.println("O valor da soma é: " + soma);

		// for sem chaves: pode ser utilizado desde que se tenha apenas um bloco de código, 
		//porém como boa pratica de programacao, sugere-se o uso das chaves
		for (int i = 0; i < 5; i++)
			System.out.println("Valor de i: " + i);
	}
}