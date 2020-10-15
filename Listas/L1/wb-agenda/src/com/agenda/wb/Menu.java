package com.agenda.wb;

public class Menu {
	// métodos static, s�o métodos que não precisam de um objeto
	// para serem executados!
	// métodos static pertencem a classe
	// static é um modificador de comportamento
	public static void mostrarMenu() {
		System.out.println("\n*********************");
		System.out.println("Selecione a opcao desejada:");
		System.out.println("1. Cadastrar cliente");
		System.out.println("2. Editar cliente");
		System.out.println("3. Excluir cliente");
		System.out.println("4. Listar clientes");
		System.out.println("5. Salvar/Persistir");
		System.out.println("6. Carregar");
		System.out.println("7. Sair");
		System.out.println("*********************\n");
	}
}