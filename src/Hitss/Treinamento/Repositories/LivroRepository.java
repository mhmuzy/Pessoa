package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*; /// *** Implementação da Classe
import Hitss.Treinamento.Infra.*; /// *** Implementação da Infra

public class LivroRepository implements IPublicacao { /// *** Processo de Herança do Repositório de 
	/// *** Livro Herdada Pela Interface Publicação
	public void Detalhes(Livro l) { /// *** Método Mostrar Detalhes do Livro
		String aberto = l.isAberto() == true ? "Sim": "Não"; /// *** Declaração da Variável Que Mostra se 
		/// *** O Livro está ou não aberto se estiver vai receber Sim, caso contrário vai receber Não
		System.out.println(""); /// *** Da uma quebrada de linha
		System.out.println("     Detalhes do Livro:"); /// *** Título da Apresentação da Resposta para o(a) 
		/// *** Usuário(a)
		System.out.println("---------------------------------------------"); /// *** Conceito de Perfumaria
		System.out.println("Título do Livro: " + l.getTitulo()); /// *** Mostrar Título do Livro
		System.out.println("Autor do Livro: " + l.getAutor()); /// *** Mostrar Autor do Livro
		System.out.println("Nº de Páginas: " + l.getTotPaginas()); /// *** Mostrar Total de Páginas
		System.out.println("Página Atual: " + l.getPagAtual()); /// *** Mostrar Página Atual
		System.out.println("Livro está aberto: " + aberto); /// *** Mostrar a Resposta se o Livro está aberto ou 
		/// *** Não
		System.out.println("---------------------------------------------"); /// *** Conceito de Perfumaria
		System.out.println(""); /// *** Dá uma Quebrada de Linha
	} /// *** Finalização do Método

	@Override
	public void abrir(Livro l) { /// *** Inicialização do Método de Abrir o Livro
		l.setAberto(true); /// *** Atributo Aberto do Livro Recebe Verdadeiro para Definir que o Livro está aberto
		System.out.println(""); /// *** Dá uma quebrada de Linha
		System.out.println("O Livro " + l.getTitulo() + " Está Aberto."); /// *** Mostrar a Resposta ao Usuário
	} /// *** Finalização do Método

	@Override
	public void fechar(Livro l) { /// *** Inicialização do Método de Fechar o Livro
		l.setAberto(false); /// *** O Atributo do Livro Aberto Recebe False para Definir que o Livro está Fechado
		System.out.println(""); /// *** Dá uma quebrada de linha
		System.out.println("O Livro " + l.getTitulo() + " Está Fechado."); /// *** Mostrar a Resposya ao Usuário
	} /// *** Finalização do Método

	@Override
	public void folhear(Livro l) { /// *** Inicialização do Método de Folhear o Livro
		System.out.println(""); /// *** Dá uma quebrada de linha
		System.out.println("O Livro está na Página " + l.getPagAtual()); /// *** Mostrar a Informação ao 
		/// *** Usuário
	} /// *** Finalização do Método

	@Override
	public void avancarPag(Livro l) { /// *** Inicialização do Método de Avançar Páginas
		
		int total = l.getTotPaginas(); /// *** Declaração da Variável que Mostra o Total de Páginas do Livro
		int avancar = (l.getPagAtual() +1); /// *** Declaração da Variável que Mostra a Página que ficou depois 
		/// *** De avançar
		
		if (avancar > total) { /// *** Se variável de Avançar For maior que a variável Total
			System.out.println(""); /// *** Dá uma quebrada de linha
			System.out.println("Desculpe, mais você já chegou na última Página."); /// *** Mostrar a Informação ao 
			/// *** Usuário de que chegou na última Página
		} else { /// *** Caso Contrário
			l.setPagAtual(l.getPagAtual() + 1); /// *** O Livro Avança a Página
			System.out.println(""); /// *** Dá uma quebrada de linha
			System.out.println("O Livro foi para a página: " +  l.getPagAtual()); /// *** Mostra a Informação ao Usuário da 
			/// *** Página aonde está agora
		} /// *** Fim do If
	} /// *** Fim do Método

	@Override
	public void voltarPag(Livro l) { /// *** Inicialização do Método de Voltar a Página do Livro
		int retorno = (l.getPagAtual() - 1); /// *** Declaração da Variável que Mostra a Página do Livro onde está Depois de 
		/// *** Retorna-la 
		if (retorno <= 0) { /// *** Se a Variável Retrono For menor ou igual a 0
			System.out.println(""); /// *** Dá uma quebrada de linha
			System.out.println("Desculpe, mas você está no início da página."); /// *** O Programa Informa ao Usuário que o livro 
			/// *** Está no início da Página
		} 
		else { /// *** Caso Contrário
			l.setPagAtual(l.getPagAtual() - 1); /// *** Retornar a Página
			System.out.println(""); /// *** Dpá uma quebrada de linha
			System.out.println("O Livro foi para a página: " +  l.getPagAtual()); /// *** O Programa Informa ao Usuário a Página 
			/// *** Onde está agora depois de retorná-la
		} /// *** Fim do If
	} /// *** Finalização do Método
} /// *** Fim do Repositório
