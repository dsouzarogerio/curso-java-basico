package com.meuprojeto.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado/2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);

		String primeiraFrase = "Esta é";
		String segundaFrase = " uma string concatenada.";
		String terceiraFrase = primeiraFrase + segundaFrase;
		System.out.println(terceiraFrase);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		//5
		System.out.println(resultado++); //imprime o resultado antes de somar +1 a variável
		//mesma coisa que:
//		System.out.println(resultado);
//		resultado = resultado +1;
//		resultado +=1;
		
		System.out.println(++resultado); //imprime o resultado depois que soma +1 a variável
		//mesma coisa que:
//		resultado +=1;
//		System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);
	}

}
