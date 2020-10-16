package com.agenda.wb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class App{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		// caminho para onde eu vou salvar o cadastro de clientes
		String caminho = "\\Desktop\\clientes.ser";
		
		// iniciando o controle para receber as informações pelo teclado
		Controle controle = new Controle();

		// lista para armazenar todos os cadastros de cada cliente
		List<Cliente> cadastros = new ArrayList<>();

		// vari�vel de controle para sair do sistema quando escolhido
		int escolha = 0;
		int aux;

		
		// estrutura de repetição que irá manter o sistema ativo,
		// enquanto for desejado
		while (escolha != 7) {
			Menu.mostrarMenu();
			escolha = controle.opcao();

			// se a opção digitada for 1, o usuário escolheu
			// cadastrar um cliente
			if (escolha == 1) {
				Cliente c = new Cliente();
				c.id = Integer.toString(cadastros.size() + 1);
				System.out.println("Por favor insira o nome do cliente:");
				c.nome = controle.texto();
				System.out.println("Por favor insira o telefone:\n");
				c.telefone = controle.texto();
				System.out.println("Por favor insira a data de nascimento:\n");
				c.genero = controle.texto();
				cadastros.add(c);
			}
			
			if (escolha == 2) {
				System.out.println("Digite o id do cadastro\n");
				aux = controle.opcao2();
				
				Cliente pessoa = new Cliente();
				pessoa.id = Integer.toString(cadastros.size() + 1);
				System.out.println("Digite o nome:\n");
				pessoa.nome = controle.texto();
				
				System.out.println("Digite a data de nascimento:\n");
				pessoa.nascimento = controle.texto();
				
				System.out.println("Digite o telefone\n");
				pessoa.telefone = controle.texto();
				
				System.out.println("Digite o sexo:\n");
				pessoa.genero = controle.texto();
				cadastros.set(aux-1, pessoa); 
				
				System.out.println("Cadastro editado!\n");
			}

			if (escolha == 3) {
				System.out.println("Digite o id do cadastro\n");
				aux = controle.opcao();
				System.out.println("cad: " + cadastros.get(aux-1));
				cadastros.remove(aux-1);
				System.out.println("Cadastro removido!\n");
			}
			
			// se a opção for 4, a escolha foi listar a lista com todos os
			// clientes
			if (escolha == 4) {
				// expressao lambda, 'pessoa' aqui é uma variável
				// poderia receber qualquer nome como: x, y, clientes, etc...
				cadastros.forEach(pessoa -> System.out.println(pessoa));
				if(cadastros.isEmpty()) {
					System.out.println("Não há cadastros :(");
				}
			}
			
			// serializar um objeto é transforma-lo numa representação
			// binária, dai é possível salvar/escrever este objeto
			// em disco rigido (HD).
			if(escolha == 5) {
				FileOutputStream canal = new FileOutputStream(caminho);
				ObjectOutputStream escritor = new ObjectOutputStream(canal);
				escritor.writeObject(cadastros);
				escritor.close();
				System.out.println("Cadastros de clientes salvo com sucesso!");
			}
			
			if(escolha == 6) {
				FileInputStream canal = new FileInputStream(caminho);
				ObjectInputStream leitor = new ObjectInputStream(canal);
				// casting / cast -> casca
				cadastros = (List<Cliente>) leitor.readObject();
				leitor.close();
				System.out.println("Cadastros lidos com sucesso!");
			}
		}
		System.out.println("Obrigado e ate a proxima");
	}
}