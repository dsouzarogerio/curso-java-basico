package com.meuprojeto.cursojava.aula15.labs;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Data válida ou não");
		System.out.println("===========================\n");

		try {
			// formato data dd/mm/aaaa
			System.out.println("Digite a data no formato dd/mm/aaaa");
			String data = scan.next();

			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dataF = LocalDate.parse(data, formato);

			System.out.println(formato.format(dataF) + "formato válido");
			
		} catch (Exception e) {
			System.out.println("Formato inválido");
		}
		scan.close();
	}
}
