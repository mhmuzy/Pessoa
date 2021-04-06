package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*; /// *** Importando a Classe

public class LeituraRepository { /// *** Cria��o do Reposit�rio de Leitura
	
	public void EfetuarLeitura(Pessoa p, Livro l, Leitura leit) { /// *** Inicializa��o do M�todo de 
		/// *** Efetuar Leitura
		leit = new Leitura(); /// *** A Inst�ncia da Entidade de Leitura
		leit.setLivro(l); /// *** Atributo Livro da Entidade Leitura Recebe a Entidade Livro
		leit.setPessoa(p); /// *** Atributo Pessoa da Entidade Leitura Recebe a Entidade Pessoa
		
		System.out.println(""); /// *** D� uma Quebrada de Linha
		System.out.println("Pessoa " + leit.getPessoa().getNome() + " L� o livro " + leit.getLivro().getTitulo());
		/// *** Informa��o Transmitida Para o(a) Usu�rio(a)
	} /// *** Finaliza��o do M�todo
} /// *** Final�iza��o do Reposit�rio
