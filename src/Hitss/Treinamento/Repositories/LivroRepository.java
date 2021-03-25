package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*;
import Hitss.Treinamento.Infra.*;

public class LivroRepository implements IPublicacao {

	public void Detalhes(Livro l) {
		String aberto = l.isAberto() == true ? "Sim": "N�o";
		System.out.println("");
		System.out.println("     Detalhes do Livro:");
		System.out.println("---------------------------------------------");
		System.out.println("T�tulo do Livro: " + l.getTitulo());
		System.out.println("Autor do Livro: " + l.getAutor());
		System.out.println("N� de P�ginas: " + l.getTotPaginas());
		System.out.println("P�gina Atual: " + l.getPagAtual());
		System.out.println("Livro est� aberto: " + aberto);
		System.out.println("---------------------------------------------");
		System.out.println("");
	}

	@Override
	public void abrir(Livro l) {
		l.setAberto(true);
		
	}

	@Override
	public void fechar(Livro l) {
		l.setAberto(false);
		
	}

	@Override
	public void folhear(Livro l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avancarPag(Livro l) {
		
		int total = l.getTotPaginas();
		int avancar = (l.getPagAtual() +1);
		
		if (avancar > total) {
			System.out.println("Desculpe, mais voc� j� chegou na �ltima P�gina.");
		} else {
			l.setPagAtual(l.getPagAtual() + 1);
		}
	}

	@Override
	public void voltarPag(Livro l) {
		int retorno = (l.getPagAtual() - 1);
		
		if (retorno <= 0) {
			System.out.println("Desculpe, mas voc� est� no in�cio da p�gina.");
		}
		else {
			l.setPagAtual(l.getPagAtual() - 1);
		}
	}
}
