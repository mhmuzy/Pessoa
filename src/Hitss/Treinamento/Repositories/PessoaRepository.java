package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*; /// *** Importando as Classes

public class PessoaRepository { /// *** Inicialização do Repositório Pessoa

	public void Aniversario(Pessoa p) { /// *** Inicialização do Método Informar 
		/// *** O Aniversário da Pessoa
		System.out.println(""); /// *** Da uma quebrada de linha
		System.out.println("Feliz Aniversário " +  p.getNome() + "!"); /// *** Mostra a 
		/// *** Informação ao Usuário de Feliz Aniversário
	} /// *** Finalização do Método
} /// *** Finalização do Repositório
