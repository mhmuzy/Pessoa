package Hitss.Treinamento.Infra;

import Hitss.Treinamento.Classes.*; /// *** Implementa��o da Classe

public interface IPublicacao { /// *** Cria��o da Interface de Publica��o
	void abrir(Livro l); /// *** M�todo Abrir Livro
	void fechar(Livro l); /// *** M�todo Fechar Livro
	void folhear(Livro l); /// *** M�todo Folhear Livro
	void avancarPag(Livro l); /// *** M�todo de Avan�ar P�ginas
	void voltarPag(Livro l); /// *** M�todo de Voltar P�ginas
} /// *** Finaliza��o da Interface
