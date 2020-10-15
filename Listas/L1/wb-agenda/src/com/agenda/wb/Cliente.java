package com.agenda.wb;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cliente implements Serializable{
	public String id;
	public String nome;
	public String telefone;
	public String nascimento;
	public String genero;
	
	@Override
	public String toString() {
		String delimitador = "########################";
		String info = "id: " + id + "\nNome: " + nome + "\nTelefone: " + telefone + "\nData de Nascimento: " + nascimento + "\nGênero: " + genero;
		return "\n" + delimitador + "\n" + info + "\n" + delimitador + "\n";
	}
}