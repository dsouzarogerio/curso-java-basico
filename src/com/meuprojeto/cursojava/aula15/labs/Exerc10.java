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
		case "m" : 
		case "M" : System.out.println("Turno manh� -> Bom dia!"); break;
		case "v" : 
		case "V" : System.out.println("Turno tarde -> Boa tarde!"); break;
		case "n" : 
		case "N" : System.out.println("Turno noite -> Boa noite!"); break;
		default : System.out.println("N�o � uma op��o v�lida.");
		
		scan.close();
		}
	}

}
