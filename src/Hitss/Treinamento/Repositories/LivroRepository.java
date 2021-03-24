package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*;

public class LivroRepository {

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
}
