package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*;

public class LeituraRepository {
	
	public void EfetuarLeitura(Pessoa p, Livro l, Leitura leit) {
		
		leit = new Leitura();
		leit.setLivro(l);
		leit.setPessoa(p);
		
		System.out.println("");
		System.out.println("Pessoa " + leit.getPessoa() + "Lê o livro " + leit.getLivro());
	}
}
