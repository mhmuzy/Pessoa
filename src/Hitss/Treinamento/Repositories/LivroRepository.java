package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*;

public class LivroRepository {

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
}
