package Hitss.Treinamento.Infra;

import java.util.Scanner; /// *** Assembly

import javax.sound.midi.Soundbank; /// *** Assembly

import Hitss.Treinamento.Repositories.*; /// *** Repositórios
import Hitss.Treinamento.Classes.*; /// *** Entidades

public class Controller { /// *** Controllers
	
	public void BuscarAniversario() { /// *** Método Buscar Pessoa que faz Aniversário
		try { /// *** Inicialização do Tratamento
			
		
		int[] Codigo = new int[5]; /// *** Vetor Código da Pessoa
		Codigo[1] = 1; /// *** Código da Pessoa 1
		Codigo[2] = 2; /// *** Código da Pessoa 2
		Codigo[3] = 3; /// *** Código da Pessoa 3
		Codigo[4] = 4; /// *** Código da Pessoa 4
		
		String[] Nome = new String[5]; /// *** Vetor Nome da Pessoa
		Nome[1] = "José Claudio da Silva Moraes"; /// *** Nome da Pessoa 1
		Nome[2] = "Armando Batista"; /// *** Nome da Pessoa 2
		Nome[3] = "Jessica Nunes"; /// *** Nome da Pessoa 3
		Nome[4] = "Lívia Bueno"; /// *** Nome da Pessoa 4
		
		int[] Idade = new int[5]; /// *** Vetor Idade da Pessoa
		Idade[1] = 20; /// *** Idade da Pessoa 1
		Idade[2] = 16; /// *** Idade da Pessoa 2
		Idade[3] = 16; /// *** Idade da Pessoa 3
		Idade[4] = 20; /// *** Idade da Pessoa 4
		
		boolean[] Sexo = new boolean[5]; /// *** Vetor Sexo da Pessoa
		Sexo[1] = true; /// *** Sexo da Pessoa 1
		Sexo[2] = true; /// *** Sexo da Pessoa 2
		Sexo[3] = false; /// *** Sexo da Pessoa 3
		Sexo[4] = false; /// *** Sexo da Pessoa 4

		Scanner teclado = new Scanner(System.in); /// *** Comando para digitar o valor pelo
		/// *** Teclado
		System.out.println(""); /// *** Pula 1 Linha
		System.out.println("Digite o código da pessoa:"); /// *** O Programa Pede Para Digitar 
		/// *** O Código da Pessoa
		int i = teclado.nextInt(); /// *** Comando Para Digitar o Código da Pessoa Pelo Teclado
		Pessoa pessoa = new Pessoa(); /// *** Instância da Entidade Pessoa
		
		if (i == Codigo[i])  /// *** Se variável Código da Pessoa for igual ao Vetor Código da Pessoa 
		{ 
			pessoa.setNome(Nome[i]); /// *** Atributo Nome da Pessoa Recebe o Vetor Nome da Pessoa
			pessoa.setIdade(Idade[i]); /// *** Atributo Idade da Pessoa Recebe o Vetor Idade da Pessoa
			pessoa.setSexo(Sexo[i]); /// *** Atributo Sexo da Pessoa Recebe o Vetor Sexo da Pessoa
			String sexo = pessoa.isSexo() == true? "Masculino": "Feminino"; /// *** Declaração da 
			/// *** Variável Sexo que define se é Masculino ou Feminino
			System.out.println(""); /// *** Pula 1 linha
			System.out.println("        Resultado da Consulta:"); /// *** Título do Resultado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nome: " + pessoa.getNome()); /// *** Atributo Nome da Pessoa
			System.out.println("Idade: " + pessoa.getIdade()); /// *** Atributo Idade da Pessoa
			System.out.println("Sexo:" + sexo); /// *** Atributo Sexo da Pessoa
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** Conceito de Perfumaria
			PessoaRepository rep = new PessoaRepository(); /// *** Declaração do Repositório Pessoa
			rep.Aniversario(pessoa); /// *** Método Aniversário Pessoa
		}else { /// *** Se na Busca não encontrar nada 
			System.out.println(""); /// *** Pula 1 linha
			System.out.println("        Resultado da Consulta:"); /// *** Título do Resultado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** Resultado da Busca
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumari
			System.out.println(""); /// Pula 1 linha
		} /// *** Fim do If
		
		} catch (Exception e) { /// *** Captura do Erro
			System.out.println(""); /// *** Pula 1 linha
			System.out.println("        Resultado da Consulta:"); /// *** Título do Resultado da Busca
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** Resultado da Busca
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** Pula 1 linha
		} /// *** Fecha a Captura
	} /// *** Fecha o Método
	
	public void EfetuarLeituraPessoa() { /// *** Método Efettuar Leitura da Pessoa
		try { /// *** Inicialização do Tratamento
			
			
			int[] Codigo = new int[5]; /// *** Vetor Código da Pessoa
			Codigo[1] = 1; /// *** Código 1
			Codigo[2] = 2; /// *** Código 2
			Codigo[3] = 3; /// *** Código 3
			Codigo[4] = 4; /// *** Código 4
			
			String[] Nome = new String[5]; /// *** Vetor Nome da Pessoa
			Nome[1] = "José Claudio da Silva Moraes"; /// *** Nome 1
			Nome[2] = "Armando Batista"; /// *** Nome 2
			Nome[3] = "Jessica Nunes"; /// *** Nome 3
			Nome[4] = "Lívia Bueno"; /// *** Nome 4
			
			int[] Idade = new int[5]; /// *** Vetor Idade da Pessoa
			Idade[1] = 20; /// *** Idade 1
			Idade[2] = 16; /// *** Idade 2
			Idade[3] = 16; /// *** Idade 3
			Idade[4] = 20; /// *** Idade 4
			
			boolean[] Sexo = new boolean[5]; /// *** Vetor Sexo da Pessoa
			Sexo[1] = true; /// *** Sexo 1
			Sexo[2] = true; /// *** Sexo 2
			Sexo[3] = false; /// *** Sexo 3
			Sexo[4] = false; /// *** Sexo 4
			

			int[] CodigoLivro = new int[5]; /// *** Vetor Código do Livro
			CodigoLivro[1] = 1; /// *** Código do Livro 1
			CodigoLivro[2] = 2; /// *** Código do Livro 2
			CodigoLivro[3] = 3; /// *** Código do Livro 3
			CodigoLivro[4] = 4; /// *** Código do Livro 4
			
			String[] Titulo = new String[5]; /// *** Vetor Título
			Titulo[1] = "O Pequeno Príncipe"; /// *** Título 1
			Titulo[2] = "Turma da Mônica"; /// *** Título 2
			Titulo[3] = "Harry Potter"; /// *** Título 3
			Titulo[4] = "Senhor dos Aneis"; /// *** Título 4
			
			String[] Autor = new String[5]; /// *** Vetor Autor
			Autor[1] = "Maurício de Souza"; /// *** Autor 1
			Autor[2] = "Maurício de Souza"; /// *** Autor 2
			Autor[3] = "Paulo Bandeira"; /// *** Autor 3
			Autor[4] = "Paulo Bandeira"; /// *** Autor 4
			
			int[] TotPaginas = new int[5]; /// *** Vetor Total de Páginas
			TotPaginas[1] = 20; /// *** Total de Páginas 1
			TotPaginas[2] = 20; /// *** Total de Páginas 2
			TotPaginas[3] = 200; /// *** Total de Páginas 3
			TotPaginas[4] = 200; /// *** Total de Páginas 4
			
			int[] PagAtual = new int[5]; /// *** Vetor Página Atual
			PagAtual[1] = 15; /// *** Página Atual 1
			PagAtual[2] = 15; /// *** Página Atual 2
			PagAtual[3] = 120; /// *** Página Atual 3
			PagAtual[4] = 120; /// *** Página Atual 4
			
			boolean[] Aberto = new boolean[5]; /// *** Vetor Aberto
			Aberto[1] = true; /// *** Aberto 1
			Aberto[2] = true; /// *** Aberto 2
			Aberto[3] = true; /// *** Aberto 3
			Aberto[4] = true; /// *** Aberto 4
			
			Scanner teclado = new Scanner(System.in); /// *** Comando Para Digitar o Valor Pelo
			/// *** Teclado
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Digite o código da pessoa:"); /// *** O Programa Pede Para Digitar
			/// *** O Código da Pessoa
			int i = teclado.nextInt(); /// *** Declaração da Variável que Você digita o Código da Pessoa
			Pessoa pessoa = new Pessoa(); /// *** Instância da Entidade Pessoa
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Digite o Código do Livro:"); /// *** O Programa Pede Para Digitar o Código
			/// *** Do Livro
			int j = teclado.nextInt(); /// *** Declaração da Variável que Você Digita o Código do Livro
			Livro livro = new Livro(); /// *** Instância da Entidade Livro
			
			if (i == Codigo[i] && j == CodigoLivro[j])  /// *** Se a Variável Código for Igual ao Vetor Código
				/// *** E Variável Código do Livro for igual ao Vetor Código do Livro
			{
				pessoa.setNome(Nome[i]); /// *** Atributo Nome da Pessoa Recebe o Vetor Nome da Pessoa
				pessoa.setIdade(Idade[i]); /// *** Atributo Idade da Pessoa Recebe o Vetor Idade da Pessoa
				pessoa.setSexo(Sexo[i]); /// *** Atributo Sexo da Pessoa Recebe o Vetor Sexo da Pessoa
				livro.setTitulo(Titulo[j]); /// *** Atributo Titulo Recebe o Vetor Titulo
				livro.setAutor(Autor[j]); /// *** Atributo Autor Recebe o Vetor Autor
				livro.setTotPaginas(TotPaginas[j]); /// *** Atributo Total de Páginas Recebe o Vetor Total de 
				/// *** Páginas
				livro.setPagAtual(PagAtual[j]); /// *** Atributo Página Atual Recebe o Vetor Página Atual
				livro.setAberto(Aberto[j]); /// *** Atributo Aberto Recebe o Vetor Aberto
				String sexo = pessoa.isSexo() == true? "Masculino": "Feminino"; /// *** Declaração da Variável Sexo 
				/// *** Que Define se é Masculino ou Feminino
				String aberto = livro.isAberto() == true? "Sim": "Não"; /// *** Declaração da Variável Aberto que define 
				/// *** Sim ou Não
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("   Resultado da Consulta da Pessoa:"); /// *** Título do Resultado da Consulta da Pessoa
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println("Nome: " + pessoa.getNome()); /// *** Atributo Nome da Pessoa
				System.out.println("Idade: " + pessoa.getIdade()); /// *** Atributo Idade da Pessoa
				System.out.println("Sexo:" + sexo); /// *** Atributo Sexo da Pessoa
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println(""); /// *** Pula mais 1 Linha
				System.out.println("	Resultado da Consulta do Livro"); /// *** Título do Resultado da Consulta do Livro
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println("Título: " + livro.getTitulo()); /// *** Atributo Título do Livro
				System.out.println("Autor: " + livro.getAutor()); /// *** Atributo Autor do Livro
				System.out.println("Total de Páginas: " + livro.getTotPaginas()); /// *** Atributo Total de Páginas
				System.out.println("Página Atual: " + livro.getPagAtual()); /// *** Atributo Página Atual
				System.out.println("Está Aberto? " + aberto); /// *** Atributo Aberto
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println(""); /// *** Pula mais 1 linha
				LeituraRepository rep = new LeituraRepository(); /// *** Declaração do Repositóirio
				Leitura leit = new Leitura(); /// *** Declaração da Entidade Leitura
				leit.setPessoa(pessoa); /// *** Leitura recebe o Atributo Pessoa
				leit.setLivro(livro); /// *** Leitutra Recebe o Atributo Livro
				rep.EfetuarLeitura(pessoa, livro, leit); /// *** Repoditório Efetua a Leitura
			}else { /// *** Caso na Consulta não tenha encontrado nada
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("        Resultado da Consulta:"); /// *** Título do Resultado da Consulta
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println("Nenhum resultado encontrado."); /// *** O Programa Informa que nenhum Resultado foi encontrado
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println(""); /// *** Pula 1 linha
			} /// *** Fim do If
			
			} catch (Exception e) { /// *** Inicialização do Tratamento
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("        Resultado da Consulta:"); /// *** Título do Resultado da consulta
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println("Nenhum resultado encontrado."); /// *** O Programa Informa o Resultado da Consulta
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println(""); /// *** Pula 1 Linha
			} /// *** Fecha o Tratamento
	} /// *** Fecha o Método
	
	public void MostrarDetalhesLivro() { /// *** Inicialização do Método Mostrar Detalhes do Livro
		try /// *** Inicialização do Tratamento
		{ /// *** Abre Chaves
		int[] CodigoLivro = new int[5]; /// *** Vetor Código do Livro
		CodigoLivro[1] = 1; /// *** Código do Livro 1
		CodigoLivro[2] = 2; /// *** Código do Livro 2
		CodigoLivro[3] = 3; /// *** Código do Livro 3
		CodigoLivro[4] = 4; /// *** Código do Livro 4
		
		String[] Titulo = new String[5]; /// *** Vetor Título
		Titulo[1] = "O Pequeno Príncipe"; /// *** Título 1
		Titulo[2] = "Turma da Mônica"; /// *** Título 2
		Titulo[3] = "Harry Potter"; /// *** Título 3
		Titulo[4] = "Senhor dos Aneis"; /// *** Título 4
		
		String[] Autor = new String[5]; /// *** Vetor Autor 
		Autor[1] = "Maurício de Souza"; /// *** Autor 1
		Autor[2] = "Maurício de Souza"; /// *** Autor 2
		Autor[3] = "Paulo Bandeira"; /// *** Autor 3
		Autor[4] = "Paulo Bandeira"; /// *** Autor 4
		
		int[] TotPaginas = new int[5]; /// *** Vetor Total de Páginas
		TotPaginas[1] = 20; /// *** Total de Páginas 1
		TotPaginas[2] = 20; /// *** Total de Páginas 2
		TotPaginas[3] = 200; /// *** Total de Páginas 3
		TotPaginas[4] = 200; /// *** Total de Páginas 4
		
		int[] PagAtual = new int[5]; /// *** Vetor Página Atual
		PagAtual[1] = 15; /// *** Página Atual 1
		PagAtual[2] = 15; /// *** Página Atual 2
		PagAtual[3] = 120; /// *** Página Atual 3
		PagAtual[4] = 120; /// *** Página Atual 4
		
		boolean[] Aberto = new boolean[5]; /// *** Vetor Aberto
		Aberto[1] = true; /// *** Aberto 1
		Aberto[2] = true; /// *** Aberto 2
		Aberto[3] = true; /// *** Aberto 3
		Aberto[4] = true; /// *** Aberto 4
		
		Scanner teclado = new Scanner(System.in);  /// *** Comando para Digitar o Valor do 
		/// *** Código do Livro Pelo Teclado
		System.out.println(""); /// *** Pula 1 Linha
		System.out.println("Digite o Código do Livro:"); /// *** O Programa Pede Para Digitar o 
		/// *** Código do Livro
		int j = teclado.nextInt(); /// *** Declaração da Variável que vai ser digitado pelo Teclado
		/// *** O Código do Livro
		Livro livro = new Livro(); /// *** Instância da Entidade Livro
		
		if (j == CodigoLivro[j])  /// *** Se a Variável Código do Livro For Igual ao Vetor Código do Livro
		{ /// *** Abre Chaves
			
			livro.setTitulo(Titulo[j]); /// *** Atributo Título Do Livro Vai Receber o Vetor Título do Livro
			livro.setAutor(Autor[j]); /// *** Atributo Autor Do Livro vai Receber o Vetor Autor do Livro
			livro.setTotPaginas(TotPaginas[j]); /// *** Atributo Total de Páginas do Livro vai Receber o Vetor Total de Págunas do
			/// *** Livro
			livro.setPagAtual(PagAtual[j]); /// *** Atributo Página Atual do Livro Vai Receber o Vetor Página Atual do Livro
			livro.setAberto(Aberto[j]); /// *** Atributo que define se o Livro está aberto ou não vai receber o vetor que define se 
			/// *** O Livro está aberto ou não
			String aberto = livro.isAberto() == true? "Sim": "Não"; /// *** Declaração da Variável aberto para definir se o Livro está aberto ou
			/// *** Não respondendo Sim ou Não
			System.out.println(""); /// *** Pula 1 Linha
			
			LivroRepository rep = new LivroRepository(); /// *** Declaração do Repositório Livro
			rep.Detalhes(livro); /// *** Repositório atua o Método Mostrar Detalhes do Livro
		}else { /// *** Caso na Consulta do Código do Livro não encontre nada
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("        Resultado da Consulta:"); /// *** Título do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Programa Mostra que o Resultado não foi encontrado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** Pula 1 linha
		} /// *** Fim do If
		
		} catch (Exception e) { /// *** Inicialização da Captura do Tratamento
			System.out.println(""); /// *** Pula 1 linha
			System.out.println("        Resultado da Consulta:"); /// *** Título do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Programa Mostra que nenhum Resultado foi encontrado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** Pula 1 linh
		} /// *** Finalização da Captura do Tratamento
	} /// *** Finalização do Método
	
	public void AbrirLivro() { /// *** Inicialização do Método Abrir Livro
		try /// *** Inicialização do Tratamento
		{ /// *** Abre Chaves
		int[] CodigoLivro = new int[5]; /// *** Vetor Código do Livro
		CodigoLivro[1] = 1; /// *** Código do Livro 1
		CodigoLivro[2] = 2; /// *** Código do Livro 2
		CodigoLivro[3] = 3; /// ** Código do Livro 3
		CodigoLivro[4] = 4; /// *** Código do Livro 4
		
		String[] Titulo = new String[5]; /// *** Vetor Título
		Titulo[1] = "O Pequeno Príncipe"; /// *** Título 1
		Titulo[2] = "Turma da Mônica"; /// *** Título 2
		Titulo[3] = "Harry Potter"; /// *** Título 3
		Titulo[4] = "Senhor dos Aneis"; /// *** Título 4
		
		String[] Autor = new String[5]; /// *** Vetor Autor
		Autor[1] = "Maurício de Souza"; /// *** Autor 1
		Autor[2] = "Maurício de Souza"; /// *** Autor 2
		Autor[3] = "Paulo Bandeira"; /// *** Autor 3
		Autor[4] = "Paulo Bandeira"; /// *** Autor 4
		
		int[] TotPaginas = new int[5]; /// *** Vetor Total de Páginas
		TotPaginas[1] = 20; /// *** Total de Página 1
		TotPaginas[2] = 20; /// *** Total de Página 2
		TotPaginas[3] = 200; /// *** Total de Página 3
		TotPaginas[4] = 200; /// *** Total de Página 4
		
		int[] PagAtual = new int[5]; /// *** Vetor Página Atual
		PagAtual[1] = 15; /// *** Página Atual 1
		PagAtual[2] = 15; /// *** Página Atual 2
		PagAtual[3] = 120; /// *** Página Atual 3
		PagAtual[4] = 120; /// *** Página Atual 4
		
		boolean[] Aberto = new boolean[5]; /// *** Vetor que Define se o Livro está Aberto ou Não
		Aberto[1] = true; /// *** Aberto 1
		Aberto[2] = true; /// *** Aberto 2
		Aberto[3] = true; /// *** Aberto 3
		Aberto[4] = true; /// *** Aberto 4
		
		Scanner teclado = new Scanner(System.in); /// *** Comando para mandar o Valor do Código do Livro
		/// *** Pelo Teclado
		System.out.println(""); /// *** Pula 1 Linha
		System.out.println("Digite o Código do Livro:"); /// *** O Programa Pede Para Digitar o Código do Livro
		int j = teclado.nextInt(); /// *** Declaração da Variável Para Digitar o Código do Livro Pelo Teclado
		Livro livro = new Livro(); /// *** Instância da Entidade Livro
		
		if (j == CodigoLivro[j]) 
		{
			
			livro.setTitulo(Titulo[j]);
			livro.setAutor(Autor[j]);
			livro.setTotPaginas(TotPaginas[j]);
			livro.setPagAtual(PagAtual[j]);
			livro.setAberto(Aberto[j]);
			String aberto = livro.isAberto() == true? "Sim": "Não";
			System.out.println("");
			
			LivroRepository rep = new LivroRepository();
			rep.abrir(livro);
		}else {
			System.out.println("");
			System.out.println("        Resultado da Consulta:");
			System.out.println("---------------------------------------");
			System.out.println("Nenhum resultado encontrado.");
			System.out.println("---------------------------------------");
			System.out.println("T");
		}
		
		} catch (Exception e) {
			System.out.println("");
			System.out.println("        Resultado da Consulta:");
			System.out.println("---------------------------------------");
			System.out.println("Nenhum resultado encontrado.");
			System.out.println("---------------------------------------");
			System.out.println("");
		}
	}
	
	public void FecharLivro() {
		try
		{
		int[] CodigoLivro = new int[5];
		CodigoLivro[1] = 1;
		CodigoLivro[2] = 2;
		CodigoLivro[3] = 3;
		CodigoLivro[4] = 4;
		
		String[] Titulo = new String[5];
		Titulo[1] = "O Pequeno Príncipe";
		Titulo[2] = "Turma da Mônica";
		Titulo[3] = "Harry Potter";
		Titulo[4] = "Senhor dos Aneis";
		
		String[] Autor = new String[5];
		Autor[1] = "Maurício de Souza";
		Autor[2] = "Maurício de Souza";
		Autor[3] = "Paulo Bandeira";
		Autor[4] = "Paulo Bandeira";
		
		int[] TotPaginas = new int[5];
		TotPaginas[1] = 20;
		TotPaginas[2] = 20;
		TotPaginas[3] = 200;
		TotPaginas[4] = 200;
		
		int[] PagAtual = new int[5];
		PagAtual[1] = 15;
		PagAtual[2] = 15;
		PagAtual[3] = 120;
		PagAtual[4] = 120;
		
		boolean[] Aberto = new boolean[5];
		Aberto[1] = true;
		Aberto[2] = true;
		Aberto[3] = true;
		Aberto[4] = true;
		
		Scanner teclado = new Scanner(System.in); 
		System.out.println("");
		System.out.println("Digite o Código do Livro:");
		int j = teclado.nextInt();
		Livro livro = new Livro();
		
		if (j == CodigoLivro[j]) 
		{
			
			livro.setTitulo(Titulo[j]);
			livro.setAutor(Autor[j]);
			livro.setTotPaginas(TotPaginas[j]);
			livro.setPagAtual(PagAtual[j]);
			livro.setAberto(Aberto[j]);
			String aberto = livro.isAberto() == true? "Sim": "Não";
			System.out.println("");
			
			LivroRepository rep = new LivroRepository();
			rep.fechar(livro);
		}else {
			System.out.println("");
			System.out.println("        Resultado da Consulta:");
			System.out.println("---------------------------------------");
			System.out.println("Nenhum resultado encontrado.");
			System.out.println("---------------------------------------");
			System.out.println("T");
		}
		
		} catch (Exception e) {
			System.out.println("");
			System.out.println("        Resultado da Consulta:");
			System.out.println("---------------------------------------");
			System.out.println("Nenhum resultado encontrado.");
			System.out.println("---------------------------------------");
			System.out.println("");
		}
	}
	
	public void VerPagParouLivro() {
		try
		{
		int[] CodigoLivro = new int[5];
		CodigoLivro[1] = 1;
		CodigoLivro[2] = 2;
		CodigoLivro[3] = 3;
		CodigoLivro[4] = 4;
		
		String[] Titulo = new String[5];
		Titulo[1] = "O Pequeno Príncipe";
		Titulo[2] = "Turma da Mônica";
		Titulo[3] = "Harry Potter";
		Titulo[4] = "Senhor dos Aneis";
		
		String[] Autor = new String[5];
		Autor[1] = "Maurício de Souza";
		Autor[2] = "Maurício de Souza";
		Autor[3] = "Paulo Bandeira";
		Autor[4] = "Paulo Bandeira";
		
		int[] TotPaginas = new int[5];
		TotPaginas[1] = 20;
		TotPaginas[2] = 20;
		TotPaginas[3] = 200;
		TotPaginas[4] = 200;
		
		int[] PagAtual = new int[5];
		PagAtual[1] = 15;
		PagAtual[2] = 15;
		PagAtual[3] = 120;
		PagAtual[4] = 120;
		
		boolean[] Aberto = new boolean[5];
		Aberto[1] = true;
		Aberto[2] = true;
		Aberto[3] = true;
		Aberto[4] = true;
		
		Scanner teclado = new Scanner(System.in); 
		System.out.println("");
		System.out.println("Digite o Código do Livro:");
		int j = teclado.nextInt();
		Livro livro = new Livro();
		
		if (j == CodigoLivro[j]) 
		{
			
			livro.setTitulo(Titulo[j]);
			livro.setAutor(Autor[j]);
			livro.setTotPaginas(TotPaginas[j]);
			livro.setPagAtual(PagAtual[j]);
			livro.setAberto(Aberto[j]);
			String aberto = livro.isAberto() == true? "Sim": "Não";
			System.out.println("");
			
			LivroRepository rep = new LivroRepository();
			rep.folhear(livro);
		}else {
			System.out.println("");
			System.out.println("        Resultado da Consulta:");
			System.out.println("---------------------------------------");
			System.out.println("Nenhum resultado encontrado.");
			System.out.println("---------------------------------------");
			System.out.println("T");
		}
		
		} catch (Exception e) {
			System.out.println("");
			System.out.println("        Resultado da Consulta:");
			System.out.println("---------------------------------------");
			System.out.println("Nenhum resultado encontrado.");
			System.out.println("---------------------------------------");
			System.out.println("");
		}
	}
	
	public void AvancPag() {
		try
		{
		int[] CodigoLivro = new int[5];
		CodigoLivro[1] = 1;
		CodigoLivro[2] = 2;
		CodigoLivro[3] = 3;
		CodigoLivro[4] = 4;
		
		String[] Titulo = new String[5];
		Titulo[1] = "O Pequeno Príncipe";
		Titulo[2] = "Turma da Mônica";
		Titulo[3] = "Harry Potter";
		Titulo[4] = "Senhor dos Aneis";
		
		String[] Autor = new String[5];
		Autor[1] = "Maurício de Souza";
		Autor[2] = "Maurício de Souza";
		Autor[3] = "Paulo Bandeira";
		Autor[4] = "Paulo Bandeira";
		
		int[] TotPaginas = new int[5];
		TotPaginas[1] = 20;
		TotPaginas[2] = 20;
		TotPaginas[3] = 200;
		TotPaginas[4] = 200;
		
		int[] PagAtual = new int[5];
		PagAtual[1] = 15;
		PagAtual[2] = 15;
		PagAtual[3] = 120;
		PagAtual[4] = 120;
		
		boolean[] Aberto = new boolean[5];
		Aberto[1] = true;
		Aberto[2] = true;
		Aberto[3] = true;
		Aberto[4] = true;
		
		Scanner teclado = new Scanner(System.in); 
		System.out.println("");
		System.out.println("Digite o Código do Livro:");
		int j = teclado.nextInt();
		Livro livro = new Livro();
		
		if (j == CodigoLivro[j]) 
		{
			
			livro.setTitulo(Titulo[j]);
			livro.setAutor(Autor[j]);
			livro.setTotPaginas(TotPaginas[j]);
			livro.setPagAtual(PagAtual[j]);
			livro.setAberto(Aberto[j]);
			String aberto = livro.isAberto() == true? "Sim": "Não";
			System.out.println("");
			
			LivroRepository rep = new LivroRepository();
			rep.avancarPag(livro);
		}else {
			System.out.println("");
			System.out.println("        Resultado da Consulta:");
			System.out.println("---------------------------------------");
			System.out.println("Nenhum resultado encontrado.");
			System.out.println("---------------------------------------");
			System.out.println("T");
		}
		
		} catch (Exception e) {
			System.out.println("");
			System.out.println("        Resultado da Consulta:");
			System.out.println("---------------------------------------");
			System.out.println("Nenhum resultado encontrado.");
			System.out.println("---------------------------------------");
			System.out.println("");
		}
	}
	
	public void ReturnPag() {
		try
		{
		int[] CodigoLivro = new int[5];
		CodigoLivro[1] = 1;
		CodigoLivro[2] = 2;
		CodigoLivro[3] = 3;
		CodigoLivro[4] = 4;
		
		String[] Titulo = new String[5];
		Titulo[1] = "O Pequeno Príncipe";
		Titulo[2] = "Turma da Mônica";
		Titulo[3] = "Harry Potter";
		Titulo[4] = "Senhor dos Aneis";
		
		String[] Autor = new String[5];
		Autor[1] = "Maurício de Souza";
		Autor[2] = "Maurício de Souza";
		Autor[3] = "Paulo Bandeira";
		Autor[4] = "Paulo Bandeira";
		
		int[] TotPaginas = new int[5];
		TotPaginas[1] = 20;
		TotPaginas[2] = 20;
		TotPaginas[3] = 200;
		TotPaginas[4] = 200;
		
		int[] PagAtual = new int[5];
		PagAtual[1] = 15;
		PagAtual[2] = 15;
		PagAtual[3] = 120;
		PagAtual[4] = 120;
		
		boolean[] Aberto = new boolean[5];
		Aberto[1] = true;
		Aberto[2] = true;
		Aberto[3] = true;
		Aberto[4] = true;
		
		Scanner teclado = new Scanner(System.in); 
		System.out.println("");
		System.out.println("Digite o Código do Livro:");
		int j = teclado.nextInt();
		Livro livro = new Livro();
		
		if (j == CodigoLivro[j]) 
		{
			
			livro.setTitulo(Titulo[j]);
			livro.setAutor(Autor[j]);
			livro.setTotPaginas(TotPaginas[j]);
			livro.setPagAtual(PagAtual[j]);
			livro.setAberto(Aberto[j]);
			String aberto = livro.isAberto() == true? "Sim": "Não";
			System.out.println("");
			
			LivroRepository rep = new LivroRepository();
			rep.voltarPag(livro);
		}else {
			System.out.println("");
			System.out.println("        Resultado da Consulta:");
			System.out.println("---------------------------------------");
			System.out.println("Nenhum resultado encontrado.");
			System.out.println("---------------------------------------");
			System.out.println("T");
		}
		
		} catch (Exception e) {
			System.out.println("");
			System.out.println("        Resultado da Consulta:");
			System.out.println("---------------------------------------");
			System.out.println("Nenhum resultado encontrado.");
			System.out.println("---------------------------------------");
			System.out.println("");
		}
	}
}
