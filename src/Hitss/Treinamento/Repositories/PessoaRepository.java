package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*; /// *** Importando as Classes

public class PessoaRepository { /// *** Inicializa��o do Reposit�rio Pessoa

	public void Aniversario(Pessoa p) { /// *** Inicializa��o do M�todo Informar 
		/// *** O Anivers�rio da Pessoa
		System.out.println(""); /// *** Da uma quebrada de linha
		System.out.println("Feliz Anivers�rio " +  p.getNome() + "!"); /// *** Mostra a 
		/// *** Informa��o ao Usu�rio de Feliz Anivers�rio
	} /// *** Finaliza��o do M�todo
} /// *** Finaliza��o do Reposit�rio
