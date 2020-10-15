package com.agenda.wb;

import java.util.Scanner;

public class Controle {
	private Scanner leitor;

	public Controle() {
		leitor = new Scanner(System.in);
	}

	public synchronized int opcao() {
		int op = leitor.nextInt();
		leitor = leitor.reset();
		return op;
	}

	public synchronized int opcao2() {
		int op2 = leitor.nextInt();
		leitor = leitor.reset();
		return op2;
	}
	
	public synchronized String texto() {
		leitor = new Scanner(System.in);
		String t = leitor.nextLine();
		leitor = leitor.reset();
		return t;
	}
}