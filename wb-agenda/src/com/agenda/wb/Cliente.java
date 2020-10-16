package com.agenda.wb;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cliente implements Serializable{
	public String id;
	public String nome;
	public String telefone;
	public String nascimento;
	public Integer mesNasc;
	public Integer anoNasc;
	public Integer idade;
	public String genero;
	
	@Override
	public String toString() {
		String delimitador = "########################";
		String info = "id: " + id + "\nNome: " + nome + "\nTelefone: " + telefone + "\nData de Nascimento: " + nascimento+  "\nIdade: " + idade + "\nGênero: " + genero;
		return "\n" + delimitador + "\n" + info + "\n" + delimitador + "\n";
	}
}