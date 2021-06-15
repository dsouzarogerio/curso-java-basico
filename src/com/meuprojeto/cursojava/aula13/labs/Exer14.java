package com.meuprojeto.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Tempo aproximado de download");
		System.out.println("======================================");
		
		System.out.println("Digite o tamanho do arquivo MB:");
		int tamArquivo = scan.nextInt();
		
		int arqMbits = tamArquivo * 8;
		System.out.println("MByte convertido em Mbits = " + arqMbits + "Mbits\n");
		
		System.out.println("======================================");
	
		System.out.println("Digite a velocidade do link de internet por segundo:");
		int velLink = scan.nextInt();
		
		System.out.println("\n======================================\n");

		double calculoTempoSeg = arqMbits / velLink;
		System.out.println("Tempo de download em segundos = " + calculoTempoSeg + "segs\n");
		
		double convTempoMin = calculoTempoSeg /60;
		System.out.printf("Tempo download em minutos = " + "%.4f", convTempoMin);
		
		scan.close();
	}

}
 