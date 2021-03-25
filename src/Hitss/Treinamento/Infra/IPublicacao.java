package Hitss.Treinamento.Infra;

import Hitss.Treinamento.Classes.*;

public interface IPublicacao {
	void abrir(Livro l);
	void fechar(Livro l);
	void folhear(Livro l);
	void avancarPag(Livro l);
	void voltarPag(Livro l);
}
