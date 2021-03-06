package Hitss.Treinamento.Classes;

public class Livro { /// *** Declara??o da Entidade Livro
	
	private String titulo; /// *** Atributo T?tulo
	private String autor; /// *** Atributo Autor
	private int totPaginas; /// *** Atributo Total de P?ginas
	private int pagAtual; /// *** Atributo P?gina Atual
	private boolean aberto; /// *** Atributo Aberto
	
	public String getTitulo() { /// *** M?todo GetTitulo
		return titulo;
	}
	public void setTitulo(String titulo) { /// *** M?todo SetTitulo
		this.titulo = titulo;
	}
	public String getAutor() { /// *** M?todo GetAutor
		return autor;
	}
	public void setAutor(String autor) { /// *** M?todo SetAutor
		this.autor = autor;
	}
	public int getTotPaginas() { /// *** M?todo GetPaginas
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) { /// *** M?todo SetPaginas
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() { /// *** M?todo GetPaginaAtual
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) { /// *** M?todo SetPaginaAtual
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() { /// *** M?todo IsAberto
		return aberto;
	}
	public void setAberto(boolean aberto) { /// *** M?todo SetAberto
		this.aberto = aberto;
	}
	
	
}
