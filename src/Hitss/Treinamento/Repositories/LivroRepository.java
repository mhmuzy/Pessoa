package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*;
import Hitss.Treinamento.Infra.*;

public class LivroRepository implements IPublicacao {

	public void Detalhes(Livro l) {
		String aberto = l.isAberto() == true ? "Sim": "Não";
		System.out.println("");
		System.out.println("     Detalhes do Livro:");
		System.out.println("---------------------------------------------");
		System.out.println("Título do Livro: " + l.getTitulo());
		System.out.println("Autor do Livro: " + l.getAutor());
		System.out.println("Nº de Páginas: " + l.getTotPaginas());
		System.out.println("Página Atual: " + l.getPagAtual());
		System.out.println("Livro está aberto: " + aberto);
		System.out.println("---------------------------------------------");
		System.out.println("");
	}

	@Override
	public void abrir(Livro l) {
		l.setAberto(true);
		System.out.println("");
		System.out.println("O Livro " + l.getTitulo() + " Está Aberto.");
	}

	@Override
	public void fechar(Livro l) {
		l.setAberto(false);
		System.out.println("");
		System.out.println("O Livro " + l.getTitulo() + " Está Fechado.");
	}

	@Override
	public void folhear(Livro l) {
		System.out.println("");
		System.out.println("O Livro está na Página " + l.getPagAtual());
	}

	@Override
	public void avancarPag(Livro l) {
		
		int total = l.getTotPaginas();
		int avancar = (l.getPagAtual() +1);
		
		if (avancar > total) {
			System.out.println("");
			System.out.println("Desculpe, mais você já chegou na última Página.");
		} else {
			l.setPagAtual(l.getPagAtual() + 1);
			System.out.println("");
			System.out.println("O Livro foi para a página: " +  l.getPagAtual());
		}
	}

	@Override
	public void voltarPag(Livro l) {
		int retorno = (l.getPagAtual() - 1);
		
		if (retorno <= 0) {
			System.out.println("");
			System.out.println("Desculpe, mas você está no início da página.");
		}
		else {
			l.setPagAtual(l.getPagAtual() - 1);
			System.out.println("");
			System.out.println("O Livro foi para a página: " +  l.getPagAtual());
		}
	}
}
