package com.meuprojeto.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Indique o seu turno de estudo");
		System.out.println("===========================\n");
		
		System.out.println("Digite a letra do seu turno: M - manh� >> T - tarde >> N - noite");
		String turno = scan.next();
		
		switch(turno) {
		case "M" : System.out.println("Turno manh� -> Bom dia!"); break;
		case "T" : System.out.println("Turno tarde -> Boa tarde!"); break;
		case "N" : System.out.println("Turno noite -> Boa noite!"); break;
		default : System.out.println("N�o � um valor v�lido.");
		
		scan.close();
		}
	}

}
