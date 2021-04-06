package Hitss.Treinamento.Infra;

import Hitss.Treinamento.Classes.*; /// *** Implementação da Classe

public interface IPublicacao { /// *** Criação da Interface de Publicação
	void abrir(Livro l); /// *** Método Abrir Livro
	void fechar(Livro l); /// *** Método Fechar Livro
	void folhear(Livro l); /// *** Método Folhear Livro
	void avancarPag(Livro l); /// *** Método de Avançar Páginas
	void voltarPag(Livro l); /// *** Método de Voltar Páginas
} /// *** Finalização da Interface
