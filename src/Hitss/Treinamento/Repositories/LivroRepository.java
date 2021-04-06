package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*; /// *** Implementa��o da Classe
import Hitss.Treinamento.Infra.*; /// *** Implementa��o da Infra

public class LivroRepository implements IPublicacao { /// *** Processo de Heran�a do Reposit�rio de 
	/// *** Livro Herdada Pela Interface Publica��o
	public void Detalhes(Livro l) { /// *** M�todo Mostrar Detalhes do Livro
		String aberto = l.isAberto() == true ? "Sim": "N�o"; /// *** Declara��o da Vari�vel Que Mostra se 
		/// *** O Livro est� ou n�o aberto se estiver vai receber Sim, caso contr�rio vai receber N�o
		System.out.println(""); /// *** Da uma quebrada de linha
		System.out.println("     Detalhes do Livro:"); /// *** T�tulo da Apresenta��o da Resposta para o(a) 
		/// *** Usu�rio(a)
		System.out.println("---------------------------------------------"); /// *** Conceito de Perfumaria
		System.out.println("T�tulo do Livro: " + l.getTitulo()); /// *** Mostrar T�tulo do Livro
		System.out.println("Autor do Livro: " + l.getAutor()); /// *** Mostrar Autor do Livro
		System.out.println("N� de P�ginas: " + l.getTotPaginas()); /// *** Mostrar Total de P�ginas
		System.out.println("P�gina Atual: " + l.getPagAtual()); /// *** Mostrar P�gina Atual
		System.out.println("Livro est� aberto: " + aberto); /// *** Mostrar a Resposta se o Livro est� aberto ou 
		/// *** N�o
		System.out.println("---------------------------------------------"); /// *** Conceito de Perfumaria
		System.out.println(""); /// *** D� uma Quebrada de Linha
	} /// *** Finaliza��o do M�todo

	@Override
	public void abrir(Livro l) { /// *** Inicializa��o do M�todo de Abrir o Livro
		l.setAberto(true); /// *** Atributo Aberto do Livro Recebe Verdadeiro para Definir que o Livro est� aberto
		System.out.println(""); /// *** D� uma quebrada de Linha
		System.out.println("O Livro " + l.getTitulo() + " Est� Aberto."); /// *** Mostrar a Resposta ao Usu�rio
	} /// *** Finaliza��o do M�todo

	@Override
	public void fechar(Livro l) { /// *** Inicializa��o do M�todo de Fechar o Livro
		l.setAberto(false); /// *** O Atributo do Livro Aberto Recebe False para Definir que o Livro est� Fechado
		System.out.println(""); /// *** D� uma quebrada de linha
		System.out.println("O Livro " + l.getTitulo() + " Est� Fechado."); /// *** Mostrar a Resposya ao Usu�rio
	} /// *** Finaliza��o do M�todo

	@Override
	public void folhear(Livro l) { /// *** Inicializa��o do M�todo de Folhear o Livro
		System.out.println(""); /// *** D� uma quebrada de linha
		System.out.println("O Livro est� na P�gina " + l.getPagAtual()); /// *** Mostrar a Informa��o ao 
		/// *** Usu�rio
	} /// *** Finaliza��o do M�todo

	@Override
	public void avancarPag(Livro l) { /// *** Inicializa��o do M�todo de Avan�ar P�ginas
		
		int total = l.getTotPaginas(); /// *** Declara��o da Vari�vel que Mostra o Total de P�ginas do Livro
		int avancar = (l.getPagAtual() +1); /// *** Declara��o da Vari�vel que Mostra a P�gina que ficou depois 
		/// *** De avan�ar
		
		if (avancar > total) { /// *** Se vari�vel de Avan�ar For maior que a vari�vel Total
			System.out.println(""); /// *** D� uma quebrada de linha
			System.out.println("Desculpe, mais voc� j� chegou na �ltima P�gina."); /// *** Mostrar a Informa��o ao 
			/// *** Usu�rio de que chegou na �ltima P�gina
		} else { /// *** Caso Contr�rio
			l.setPagAtual(l.getPagAtual() + 1); /// *** O Livro Avan�a a P�gina
			System.out.println(""); /// *** D� uma quebrada de linha
			System.out.println("O Livro foi para a p�gina: " +  l.getPagAtual()); /// *** Mostra a Informa��o ao Usu�rio da 
			/// *** P�gina aonde est� agora
		} /// *** Fim do If
	} /// *** Fim do M�todo

	@Override
	public void voltarPag(Livro l) { /// *** Inicializa��o do M�todo de Voltar a P�gina do Livro
		int retorno = (l.getPagAtual() - 1); /// *** Declara��o da Vari�vel que Mostra a P�gina do Livro onde est� Depois de 
		/// *** Retorna-la 
		if (retorno <= 0) { /// *** Se a Vari�vel Retrono For menor ou igual a 0
			System.out.println(""); /// *** D� uma quebrada de linha
			System.out.println("Desculpe, mas voc� est� no in�cio da p�gina."); /// *** O Programa Informa ao Usu�rio que o livro 
			/// *** Est� no in�cio da P�gina
		} 
		else { /// *** Caso Contr�rio
			l.setPagAtual(l.getPagAtual() - 1); /// *** Retornar a P�gina
			System.out.println(""); /// *** Dp� uma quebrada de linha
			System.out.println("O Livro foi para a p�gina: " +  l.getPagAtual()); /// *** O Programa Informa ao Usu�rio a P�gina 
			/// *** Onde est� agora depois de retorn�-la
		} /// *** Fim do If
	} /// *** Finaliza��o do M�todo
} /// *** Fim do Reposit�rio
