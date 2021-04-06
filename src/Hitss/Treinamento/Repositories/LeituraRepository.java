package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*; /// *** Importando a Classe

public class LeituraRepository { /// *** Criação do Repositório de Leitura
	
	public void EfetuarLeitura(Pessoa p, Livro l, Leitura leit) { /// *** Inicialização do Método de 
		/// *** Efetuar Leitura
		leit = new Leitura(); /// *** A Instância da Entidade de Leitura
		leit.setLivro(l); /// *** Atributo Livro da Entidade Leitura Recebe a Entidade Livro
		leit.setPessoa(p); /// *** Atributo Pessoa da Entidade Leitura Recebe a Entidade Pessoa
		
		System.out.println(""); /// *** Dá uma Quebrada de Linha
		System.out.println("Pessoa " + leit.getPessoa().getNome() + " Lê o livro " + leit.getLivro().getTitulo());
		/// *** Informação Transmitida Para o(a) Usuário(a)
	} /// *** Finalização do Método
} /// *** Finalçização do Repositório
