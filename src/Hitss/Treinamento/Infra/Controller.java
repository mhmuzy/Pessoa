package Hitss.Treinamento.Infra;

import java.util.Scanner; /// *** Assembly

import javax.sound.midi.Soundbank; /// *** Assembly

import Hitss.Treinamento.Repositories.*; /// *** Reposit?rios
import Hitss.Treinamento.Classes.*; /// *** Entidades

public class Controller { /// *** Controllers
	
	public void BuscarAniversario() { /// *** M?todo Buscar Pessoa que faz Anivers?rio
		try { /// *** Inicializa??o do Tratamento
			
		
		int[] Codigo = new int[5]; /// *** Vetor C?digo da Pessoa
		Codigo[1] = 1; /// *** C?digo da Pessoa 1
		Codigo[2] = 2; /// *** C?digo da Pessoa 2
		Codigo[3] = 3; /// *** C?digo da Pessoa 3
		Codigo[4] = 4; /// *** C?digo da Pessoa 4
		
		String[] Nome = new String[5]; /// *** Vetor Nome da Pessoa
		Nome[1] = "Jos? Claudio da Silva Moraes"; /// *** Nome da Pessoa 1
		Nome[2] = "Armando Batista"; /// *** Nome da Pessoa 2
		Nome[3] = "Jessica Nunes"; /// *** Nome da Pessoa 3
		Nome[4] = "L?via Bueno"; /// *** Nome da Pessoa 4
		
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
		System.out.println("Digite o c?digo da pessoa:"); /// *** O Programa Pede Para Digitar 
		/// *** O C?digo da Pessoa
		int i = teclado.nextInt(); /// *** Comando Para Digitar o C?digo da Pessoa Pelo Teclado
		Pessoa pessoa = new Pessoa(); /// *** Inst?ncia da Entidade Pessoa
		
		if (i == Codigo[i])  /// *** Se vari?vel C?digo da Pessoa for igual ao Vetor C?digo da Pessoa 
		{ 
			pessoa.setNome(Nome[i]); /// *** Atributo Nome da Pessoa Recebe o Vetor Nome da Pessoa
			pessoa.setIdade(Idade[i]); /// *** Atributo Idade da Pessoa Recebe o Vetor Idade da Pessoa
			pessoa.setSexo(Sexo[i]); /// *** Atributo Sexo da Pessoa Recebe o Vetor Sexo da Pessoa
			String sexo = pessoa.isSexo() == true? "Masculino": "Feminino"; /// *** Declara??o da 
			/// *** Vari?vel Sexo que define se ? Masculino ou Feminino
			System.out.println(""); /// *** Pula 1 linha
			System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nome: " + pessoa.getNome()); /// *** Atributo Nome da Pessoa
			System.out.println("Idade: " + pessoa.getIdade()); /// *** Atributo Idade da Pessoa
			System.out.println("Sexo:" + sexo); /// *** Atributo Sexo da Pessoa
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** Conceito de Perfumaria
			PessoaRepository rep = new PessoaRepository(); /// *** Declara??o do Reposit?rio Pessoa
			rep.Aniversario(pessoa); /// *** M?todo Anivers?rio Pessoa
		}else { /// *** Se na Busca n?o encontrar nada 
			System.out.println(""); /// *** Pula 1 linha
			System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** Resultado da Busca
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumari
			System.out.println(""); /// Pula 1 linha
		} /// *** Fim do If
		
		} catch (Exception e) { /// *** Captura do Erro
			System.out.println(""); /// *** Pula 1 linha
			System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado da Busca
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** Resultado da Busca
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** Pula 1 linha
		} /// *** Fecha a Captura
	} /// *** Fecha o M?todo
	
	public void EfetuarLeituraPessoa() { /// *** M?todo Efettuar Leitura da Pessoa
		try { /// *** Inicializa??o do Tratamento
			
			
			int[] Codigo = new int[5]; /// *** Vetor C?digo da Pessoa
			Codigo[1] = 1; /// *** C?digo 1
			Codigo[2] = 2; /// *** C?digo 2
			Codigo[3] = 3; /// *** C?digo 3
			Codigo[4] = 4; /// *** C?digo 4
			
			String[] Nome = new String[5]; /// *** Vetor Nome da Pessoa
			Nome[1] = "Jos? Claudio da Silva Moraes"; /// *** Nome 1
			Nome[2] = "Armando Batista"; /// *** Nome 2
			Nome[3] = "Jessica Nunes"; /// *** Nome 3
			Nome[4] = "L?via Bueno"; /// *** Nome 4
			
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
			

			int[] CodigoLivro = new int[5]; /// *** Vetor C?digo do Livro
			CodigoLivro[1] = 1; /// *** C?digo do Livro 1
			CodigoLivro[2] = 2; /// *** C?digo do Livro 2
			CodigoLivro[3] = 3; /// *** C?digo do Livro 3
			CodigoLivro[4] = 4; /// *** C?digo do Livro 4
			
			String[] Titulo = new String[5]; /// *** Vetor T?tulo
			Titulo[1] = "O Pequeno Pr?ncipe"; /// *** T?tulo 1
			Titulo[2] = "Turma da M?nica"; /// *** T?tulo 2
			Titulo[3] = "Harry Potter"; /// *** T?tulo 3
			Titulo[4] = "Senhor dos Aneis"; /// *** T?tulo 4
			
			String[] Autor = new String[5]; /// *** Vetor Autor
			Autor[1] = "Maur?cio de Souza"; /// *** Autor 1
			Autor[2] = "Maur?cio de Souza"; /// *** Autor 2
			Autor[3] = "Paulo Bandeira"; /// *** Autor 3
			Autor[4] = "Paulo Bandeira"; /// *** Autor 4
			
			int[] TotPaginas = new int[5]; /// *** Vetor Total de P?ginas
			TotPaginas[1] = 20; /// *** Total de P?ginas 1
			TotPaginas[2] = 20; /// *** Total de P?ginas 2
			TotPaginas[3] = 200; /// *** Total de P?ginas 3
			TotPaginas[4] = 200; /// *** Total de P?ginas 4
			
			int[] PagAtual = new int[5]; /// *** Vetor P?gina Atual
			PagAtual[1] = 15; /// *** P?gina Atual 1
			PagAtual[2] = 15; /// *** P?gina Atual 2
			PagAtual[3] = 120; /// *** P?gina Atual 3
			PagAtual[4] = 120; /// *** P?gina Atual 4
			
			boolean[] Aberto = new boolean[5]; /// *** Vetor Aberto
			Aberto[1] = true; /// *** Aberto 1
			Aberto[2] = true; /// *** Aberto 2
			Aberto[3] = true; /// *** Aberto 3
			Aberto[4] = true; /// *** Aberto 4
			
			Scanner teclado = new Scanner(System.in); /// *** Comando Para Digitar o Valor Pelo
			/// *** Teclado
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Digite o c?digo da pessoa:"); /// *** O Programa Pede Para Digitar
			/// *** O C?digo da Pessoa
			int i = teclado.nextInt(); /// *** Declara??o da Vari?vel que Voc? digita o C?digo da Pessoa
			Pessoa pessoa = new Pessoa(); /// *** Inst?ncia da Entidade Pessoa
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Digite o C?digo do Livro:"); /// *** O Programa Pede Para Digitar o C?digo
			/// *** Do Livro
			int j = teclado.nextInt(); /// *** Declara??o da Vari?vel que Voc? Digita o C?digo do Livro
			Livro livro = new Livro(); /// *** Inst?ncia da Entidade Livro
			
			if (i == Codigo[i] && j == CodigoLivro[j])  /// *** Se a Vari?vel C?digo for Igual ao Vetor C?digo
				/// *** E Vari?vel C?digo do Livro for igual ao Vetor C?digo do Livro
			{
				pessoa.setNome(Nome[i]); /// *** Atributo Nome da Pessoa Recebe o Vetor Nome da Pessoa
				pessoa.setIdade(Idade[i]); /// *** Atributo Idade da Pessoa Recebe o Vetor Idade da Pessoa
				pessoa.setSexo(Sexo[i]); /// *** Atributo Sexo da Pessoa Recebe o Vetor Sexo da Pessoa
				livro.setTitulo(Titulo[j]); /// *** Atributo Titulo Recebe o Vetor Titulo
				livro.setAutor(Autor[j]); /// *** Atributo Autor Recebe o Vetor Autor
				livro.setTotPaginas(TotPaginas[j]); /// *** Atributo Total de P?ginas Recebe o Vetor Total de 
				/// *** P?ginas
				livro.setPagAtual(PagAtual[j]); /// *** Atributo P?gina Atual Recebe o Vetor P?gina Atual
				livro.setAberto(Aberto[j]); /// *** Atributo Aberto Recebe o Vetor Aberto
				String sexo = pessoa.isSexo() == true? "Masculino": "Feminino"; /// *** Declara??o da Vari?vel Sexo 
				/// *** Que Define se ? Masculino ou Feminino
				String aberto = livro.isAberto() == true? "Sim": "N?o"; /// *** Declara??o da Vari?vel Aberto que define 
				/// *** Sim ou N?o
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("   Resultado da Consulta da Pessoa:"); /// *** T?tulo do Resultado da Consulta da Pessoa
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println("Nome: " + pessoa.getNome()); /// *** Atributo Nome da Pessoa
				System.out.println("Idade: " + pessoa.getIdade()); /// *** Atributo Idade da Pessoa
				System.out.println("Sexo:" + sexo); /// *** Atributo Sexo da Pessoa
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println(""); /// *** Pula mais 1 Linha
				System.out.println("	Resultado da Consulta do Livro"); /// *** T?tulo do Resultado da Consulta do Livro
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println("T?tulo: " + livro.getTitulo()); /// *** Atributo T?tulo do Livro
				System.out.println("Autor: " + livro.getAutor()); /// *** Atributo Autor do Livro
				System.out.println("Total de P?ginas: " + livro.getTotPaginas()); /// *** Atributo Total de P?ginas
				System.out.println("P?gina Atual: " + livro.getPagAtual()); /// *** Atributo P?gina Atual
				System.out.println("Est? Aberto? " + aberto); /// *** Atributo Aberto
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println(""); /// *** Pula mais 1 linha
				LeituraRepository rep = new LeituraRepository(); /// *** Declara??o do Reposit?irio
				Leitura leit = new Leitura(); /// *** Declara??o da Entidade Leitura
				leit.setPessoa(pessoa); /// *** Leitura recebe o Atributo Pessoa
				leit.setLivro(livro); /// *** Leitutra Recebe o Atributo Livro
				rep.EfetuarLeitura(pessoa, livro, leit); /// *** Repodit?rio Efetua a Leitura
			}else { /// *** Caso na Consulta n?o tenha encontrado nada
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado da Consulta
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println("Nenhum resultado encontrado."); /// *** O Programa Informa que nenhum Resultado foi encontrado
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println(""); /// *** Pula 1 linha
			} /// *** Fim do If
			
			} catch (Exception e) { /// *** Inicializa??o do Tratamento
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado da consulta
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println("Nenhum resultado encontrado."); /// *** O Programa Informa o Resultado da Consulta
				System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
				System.out.println(""); /// *** Pula 1 Linha
			} /// *** Fecha o Tratamento
	} /// *** Fecha o M?todo
	
	public void MostrarDetalhesLivro() { /// *** Inicializa??o do M?todo Mostrar Detalhes do Livro
		try /// *** Inicializa??o do Tratamento
		{ /// *** Abre Chaves
		int[] CodigoLivro = new int[5]; /// *** Vetor C?digo do Livro
		CodigoLivro[1] = 1; /// *** C?digo do Livro 1
		CodigoLivro[2] = 2; /// *** C?digo do Livro 2
		CodigoLivro[3] = 3; /// *** C?digo do Livro 3
		CodigoLivro[4] = 4; /// *** C?digo do Livro 4
		
		String[] Titulo = new String[5]; /// *** Vetor T?tulo
		Titulo[1] = "O Pequeno Pr?ncipe"; /// *** T?tulo 1
		Titulo[2] = "Turma da M?nica"; /// *** T?tulo 2
		Titulo[3] = "Harry Potter"; /// *** T?tulo 3
		Titulo[4] = "Senhor dos Aneis"; /// *** T?tulo 4
		
		String[] Autor = new String[5]; /// *** Vetor Autor 
		Autor[1] = "Maur?cio de Souza"; /// *** Autor 1
		Autor[2] = "Maur?cio de Souza"; /// *** Autor 2
		Autor[3] = "Paulo Bandeira"; /// *** Autor 3
		Autor[4] = "Paulo Bandeira"; /// *** Autor 4
		
		int[] TotPaginas = new int[5]; /// *** Vetor Total de P?ginas
		TotPaginas[1] = 20; /// *** Total de P?ginas 1
		TotPaginas[2] = 20; /// *** Total de P?ginas 2
		TotPaginas[3] = 200; /// *** Total de P?ginas 3
		TotPaginas[4] = 200; /// *** Total de P?ginas 4
		
		int[] PagAtual = new int[5]; /// *** Vetor P?gina Atual
		PagAtual[1] = 15; /// *** P?gina Atual 1
		PagAtual[2] = 15; /// *** P?gina Atual 2
		PagAtual[3] = 120; /// *** P?gina Atual 3
		PagAtual[4] = 120; /// *** P?gina Atual 4
		
		boolean[] Aberto = new boolean[5]; /// *** Vetor Aberto
		Aberto[1] = true; /// *** Aberto 1
		Aberto[2] = true; /// *** Aberto 2
		Aberto[3] = true; /// *** Aberto 3
		Aberto[4] = true; /// *** Aberto 4
		
		Scanner teclado = new Scanner(System.in);  /// *** Comando para Digitar o Valor do 
		/// *** C?digo do Livro Pelo Teclado
		System.out.println(""); /// *** Pula 1 Linha
		System.out.println("Digite o C?digo do Livro:"); /// *** O Programa Pede Para Digitar o 
		/// *** C?digo do Livro
		int j = teclado.nextInt(); /// *** Declara??o da Vari?vel que vai ser digitado pelo Teclado
		/// *** O C?digo do Livro
		Livro livro = new Livro(); /// *** Inst?ncia da Entidade Livro
		
		if (j == CodigoLivro[j])  /// *** Se a Vari?vel C?digo do Livro For Igual ao Vetor C?digo do Livro
		{ /// *** Abre Chaves
			
			livro.setTitulo(Titulo[j]); /// *** Atributo T?tulo Do Livro Vai Receber o Vetor T?tulo do Livro
			livro.setAutor(Autor[j]); /// *** Atributo Autor Do Livro vai Receber o Vetor Autor do Livro
			livro.setTotPaginas(TotPaginas[j]); /// *** Atributo Total de P?ginas do Livro vai Receber o Vetor Total de P?gunas do
			/// *** Livro
			livro.setPagAtual(PagAtual[j]); /// *** Atributo P?gina Atual do Livro Vai Receber o Vetor P?gina Atual do Livro
			livro.setAberto(Aberto[j]); /// *** Atributo que define se o Livro est? aberto ou n?o vai receber o vetor que define se 
			/// *** O Livro est? aberto ou n?o
			String aberto = livro.isAberto() == true? "Sim": "N?o"; /// *** Declara??o da Vari?vel aberto para definir se o Livro est? aberto ou
			/// *** N?o respondendo Sim ou N?o
			System.out.println(""); /// *** Pula 1 Linha
			
			LivroRepository rep = new LivroRepository(); /// *** Declara??o do Reposit?rio Livro
			rep.Detalhes(livro); /// *** Reposit?rio atua o M?todo Mostrar Detalhes do Livro
		}else { /// *** Caso na Consulta do C?digo do Livro n?o encontre nada
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Programa Mostra que o Resultado n?o foi encontrado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** Pula 1 linha
		} /// *** Fim do If
		
		} catch (Exception e) { /// *** Inicializa??o da Captura do Tratamento
			System.out.println(""); /// *** Pula 1 linha
			System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Programa Mostra que nenhum Resultado foi encontrado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** Pula 1 linh
		} /// *** Finaliza??o da Captura do Tratamento
	} /// *** Finaliza??o do M?todo
	
	public void AbrirLivro() { /// *** Inicializa??o do M?todo Abrir Livro
		try /// *** Inicializa??o do Tratamento
		{ /// *** Abre Chaves
		int[] CodigoLivro = new int[5]; /// *** Vetor C?digo do Livro
		CodigoLivro[1] = 1; /// *** C?digo do Livro 1
		CodigoLivro[2] = 2; /// *** C?digo do Livro 2
		CodigoLivro[3] = 3; /// ** C?digo do Livro 3
		CodigoLivro[4] = 4; /// *** C?digo do Livro 4
		
		String[] Titulo = new String[5]; /// *** Vetor T?tulo
		Titulo[1] = "O Pequeno Pr?ncipe"; /// *** T?tulo 1
		Titulo[2] = "Turma da M?nica"; /// *** T?tulo 2
		Titulo[3] = "Harry Potter"; /// *** T?tulo 3
		Titulo[4] = "Senhor dos Aneis"; /// *** T?tulo 4
		
		String[] Autor = new String[5]; /// *** Vetor Autor
		Autor[1] = "Maur?cio de Souza"; /// *** Autor 1
		Autor[2] = "Maur?cio de Souza"; /// *** Autor 2
		Autor[3] = "Paulo Bandeira"; /// *** Autor 3
		Autor[4] = "Paulo Bandeira"; /// *** Autor 4
		
		int[] TotPaginas = new int[5]; /// *** Vetor Total de P?ginas
		TotPaginas[1] = 20; /// *** Total de P?gina 1
		TotPaginas[2] = 20; /// *** Total de P?gina 2
		TotPaginas[3] = 200; /// *** Total de P?gina 3
		TotPaginas[4] = 200; /// *** Total de P?gina 4
		
		int[] PagAtual = new int[5]; /// *** Vetor P?gina Atual
		PagAtual[1] = 15; /// *** P?gina Atual 1
		PagAtual[2] = 15; /// *** P?gina Atual 2
		PagAtual[3] = 120; /// *** P?gina Atual 3
		PagAtual[4] = 120; /// *** P?gina Atual 4
		
		boolean[] Aberto = new boolean[5]; /// *** Vetor que Define se o Livro est? Aberto ou N?o
		Aberto[1] = true; /// *** Aberto 1
		Aberto[2] = true; /// *** Aberto 2
		Aberto[3] = true; /// *** Aberto 3
		Aberto[4] = true; /// *** Aberto 4
		
		Scanner teclado = new Scanner(System.in); /// *** Comando para mandar o Valor do C?digo do Livro
		/// *** Pelo Teclado
		System.out.println(""); /// *** Pula 1 Linha
		System.out.println("Digite o C?digo do Livro:"); /// *** O Programa Pede Para Digitar o C?digo do Livro
		int j = teclado.nextInt(); /// *** Declara??o da Vari?vel Para Digitar o C?digo do Livro Pelo Teclado
		Livro livro = new Livro(); /// *** Inst?ncia da Entidade Livro
		
		if (j == CodigoLivro[j]) /// *** Se a Vari?vel C?digo do Livro For igual ao Vetor C?digo do Livro
		{ /// *** Abre Chaves
			
			livro.setTitulo(Titulo[j]); /// *** O Atributo T?tulo Recebe o Vetor T?tulo
			livro.setAutor(Autor[j]); /// *** O Atributo Vetor Recebe o Vetor Autor
			livro.setTotPaginas(TotPaginas[j]); /// *** O Atributo Total de P?ginas Recebe o Vetor Total de P?ginas
			livro.setPagAtual(PagAtual[j]); /// *** O Atributo P?gina Atual Recebe o Vetor P?gina Atual 
			livro.setAberto(Aberto[j]); /// *** O Atributo que Define se o Livro est? Aberto ou N?o Recebe o Vetor que Define 
			/// *** Se o Livro est? aberto ou N?o
			String aberto = livro.isAberto() == true? "Sim": "N?o"; /// *** Declara??o da Vari?bvel que Define se o Livro est? 
			/// *** Aberto ou N?o se Estiver vai aparecer Sim, Caso o Contr?rio vai aparecer N?o
			System.out.println(""); /// *** D? uma Quebrada de Linha
			
			LivroRepository rep = new LivroRepository(); /// *** Declara??o do Reposit?rio Livro
			rep.abrir(livro); /// *** Fun??o de Abrir Livro do Reposit?rio
		}else { /// *** Caso n?o encontre nenhum Livro
			System.out.println(""); /// *** D? uma quebrada de linha
			System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Aviso de que nehum resultado foi encontrado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** D? uma Quebrada de Linha
		} /// *** Fim do If
		
		} catch (Exception e) { /// *** Captura do Tratamento
			System.out.println(""); /// *** Da uma Quebrada de Linha
			System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado da Busca
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Aviso de que nenhum resultado foi encontrado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** Da uma quebrada de linha
		} /// *** Fim Da Captura do Erro
	} /// *** Fim do M?todo
	
	public void FecharLivro() { /// *** Inicializa??o do M?todo Fechar Livro
		try /// *** Inicializa??o do Tratamento
		{ /// *** Abre Chaves
		int[] CodigoLivro = new int[5]; /// *** Vetor C?digo do Livro
		CodigoLivro[1] = 1; /// *** C?digo do Livro 1
		CodigoLivro[2] = 2; /// *** C?digo do Livro 2
		CodigoLivro[3] = 3; /// *** C?digo do Livro 3
		CodigoLivro[4] = 4; /// *** C?digo do Livro 4
		
		String[] Titulo = new String[5]; /// *** Vetor T?tulo
		Titulo[1] = "O Pequeno Pr?ncipe"; /// *** T?tulo 1
		Titulo[2] = "Turma da M?nica"; /// *** T?tulo 2
		Titulo[3] = "Harry Potter"; /// *** T?tulo 3
		Titulo[4] = "Senhor dos Aneis"; /// *** T?tulo 4
		
		String[] Autor = new String[5]; /// *** Vetor Autor 
		Autor[1] = "Maur?cio de Souza"; /// *** Autor 1
		Autor[2] = "Maur?cio de Souza"; /// *** Autor 2
		Autor[3] = "Paulo Bandeira"; /// *** Autor 3
		Autor[4] = "Paulo Bandeira"; /// *** Autor 4
		
		int[] TotPaginas = new int[5]; /// *** Vetor Total de P?ginas
		TotPaginas[1] = 20; /// *** Total de P?ginas 1
		TotPaginas[2] = 20; /// *** Total de P?ginas 2
		TotPaginas[3] = 200; /// *** Total de P?ginas 3
		TotPaginas[4] = 200; /// *** Total de Paginas 4
		
		int[] PagAtual = new int[5]; /// *** Vetor P?gina Atual
		PagAtual[1] = 15; /// *** P?gina Atual 1
		PagAtual[2] = 15; /// *** P?gina Atual 2
		PagAtual[3] = 120; /// *** P?gina Atual 3
		PagAtual[4] = 120; /// *** P?gina Atual 4
		
		boolean[] Aberto = new boolean[5]; /// *** Vetor Aberto
		Aberto[1] = true; /// *** Aberto 1
		Aberto[2] = true; /// *** Aberto 2
		Aberto[3] = true; /// *** Aberto 3
		Aberto[4] = true; /// *** Aberto 4
		
		Scanner teclado = new Scanner(System.in);  /// *** Comando Para Digitar o 
		/// *** C?digo do Livro Pelo Teclado
		System.out.println(""); /// *** D? uma quebrada de linha
		System.out.println("Digite o C?digo do Livro:"); /// *** O Programa Pede Para digitar 
		/// *** O C?digo do Livro
		int j = teclado.nextInt(); /// *** Declara??o da Vari?vel Para Digutar o C?digo do Livro 
		/// *** Pelo Teclado
		Livro livro = new Livro(); /// *** Inst?ncia da Entidade Livro
		
		if (j == CodigoLivro[j]) /// *** Se a Vari?vel C?digo do Livro For igual ao Vetor C?digo do 
			/// *** Livro
		{ /// *** Abre Chaves
			livro.setTitulo(Titulo[j]); /// *** Atributo T?tulo Recebe o Vetor T?tulo
			livro.setAutor(Autor[j]); /// *** Atributo Autor Recebe o Vetor Autor
			livro.setTotPaginas(TotPaginas[j]); /// *** Atributo Total de P?ginas Recebe o Vetor 
			/// *** Total de P?ginas
			livro.setPagAtual(PagAtual[j]); /// *** Atributo P?gina Atual Recebe o Vetor P?gina Atual
			livro.setAberto(Aberto[j]); /// *** Atributo que Define se o Livro est? aberto ou N?o Recebe 
			/// *** O Vetor que Define se o Livro est? aberto ou N?o
			String aberto = livro.isAberto() == true? "Sim": "N?o"; /// *** Declara??o da Vari?vel Aberto que 
			/// *** Define se o Livro est? ou n?o aberto se estiver vai estar Sim, caso contr?rio vai estar N?o
			System.out.println(""); /// *** Da uma Quebrada de Linha
			
			LivroRepository rep = new LivroRepository(); /// *** Declara??o do Reposit?rio Livro
			rep.fechar(livro); /// *** Reposit?rio Atua o M?todo de Fechar Livro
		}else { /// *** Caso na Consulta do Livro N?o Encontre nenhum Resultado
			System.out.println(""); /// *** Da uma Quebrada de Linha
			System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Aviso de que Nenhum Resultado foi 
			/// *** Encontrado
			System.out.println("---------------------------------------"); /// *** Conecito de Perfumaria
			System.out.println(""); /// *** Da uma quebrada de linha
		} /// *** Fim do If
		
		} catch (Exception e) { /// *** In?cio da Captura do Erro
			System.out.println(""); /// *** Da uma Quebrada de Linha
			System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Aviso de que Nenhum resultado foi encontrado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** D? uma Quebrada de Linha
		} /// *** Fim da Captura do Erro
	} /// *** Fim do M?todo
	
	public void VerPagParouLivro() { /// *** Inicializa??o do M?todo de Ver a P?gina aonde Parou no Livri
		try /// *** Inicializa??o do Tratamento
		{ /// *** Abre Chaves
		int[] CodigoLivro = new int[5]; /// *** Vetor C?digo do Livro
		CodigoLivro[1] = 1; /// *** C?digo do Livro 1
		CodigoLivro[2] = 2; /// *** C?digo do Livro 2
		CodigoLivro[3] = 3; /// *** C?digo do Livro 3
		CodigoLivro[4] = 4; /// *** C?digo do Livro 4
		
		String[] Titulo = new String[5]; /// *** Vetor T?tulo
		Titulo[1] = "O Pequeno Pr?ncipe"; /// *** T?tulo 1
		Titulo[2] = "Turma da M?nica"; /// *** T?tulo 2
		Titulo[3] = "Harry Potter"; /// *** T?tulo 3
		Titulo[4] = "Senhor dos Aneis"; /// *** T?tulo 4
		
		String[] Autor = new String[5]; /// *** Vetor Autor 
		Autor[1] = "Maur?cio de Souza"; /// *** Autor 1
		Autor[2] = "Maur?cio de Souza"; /// *** Autor 2
		Autor[3] = "Paulo Bandeira"; /// *** Autor 3
		Autor[4] = "Paulo Bandeira"; /// *** Autor 4
		
		int[] TotPaginas = new int[5]; /// *** Vetor Total de P?ginas
		TotPaginas[1] = 20; /// *** Total de P?ginas 1
		TotPaginas[2] = 20; /// *** Total de P?ginas 2
		TotPaginas[3] = 200; /// *** Total de P?ginas 3
		TotPaginas[4] = 200; /// *** Total de P?ginas 4
		
		int[] PagAtual = new int[5]; /// *** Vetor P?gina Atual
		PagAtual[1] = 15; /// *** P?gina Atual 1
		PagAtual[2] = 15; /// *** P?gina Atual 2
		PagAtual[3] = 120; /// *** P?gina Atual 3
		PagAtual[4] = 120; /// *** P?gina Atual 4
		
		boolean[] Aberto = new boolean[5]; /// *** Vetor que Define se o Livro est? Aberto ou N?o
		Aberto[1] = true; /// *** Aberto 1
		Aberto[2] = true; /// *** Aberto 2
		Aberto[3] = true; /// *** Aberto 3
		Aberto[4] = true; /// *** Aberto 4
		
		Scanner teclado = new Scanner(System.in); /// *** Comando para digitar o valor do C?digo do Livro 
		/// *** Pelo Teclado
		System.out.println(""); /// *** D? uma Quebrada de Linha
		System.out.println("Digite o C?digo do Livro:"); /// *** O Programa Pede Para digitar o C?digo do Livro
		int j = teclado.nextInt(); /// *** Declara??o da Vari?vel para poder Digitar o C?digo do Livro
		Livro livro = new Livro(); /// *** A Inst?ncia da Entidade Livro
		
		if (j == CodigoLivro[j]) /// *** Se a Vari?vel C?digo do Livro for Igual ao Vetor C?digo do Livro
		{ /// *** Abre Chaves
			
			livro.setTitulo(Titulo[j]); /// *** Atributo T?tulo Recebe o Vetor T?tulo
			livro.setAutor(Autor[j]); /// *** Atributo Autor Recebe o Vetor Autor
			livro.setTotPaginas(TotPaginas[j]); /// *** Atributo Total de P?ginas Recebe o Vetor Total de 
			/// *** P?ginas
			livro.setPagAtual(PagAtual[j]); /// *** Atributo P?gina Atual Recebe o Vetor P?gina Atual
			livro.setAberto(Aberto[j]); /// *** Atributo que Define se o Livro est? aberto ou N?o Recebe o Vetor Que 
			/// *** Define se o Livro est? aberto ou n?o 
			String aberto = livro.isAberto() == true? "Sim": "N?o"; /// *** Declara??o da Vari?vel que define se o Livro est? 
			/// *** Aberto ou n?o se estiver ele vai receber a Resposta como Sim caso ao contr?rio vai receber N?o
			System.out.println(""); /// *** Da uma quebrada de Linha
			
			LivroRepository rep = new LivroRepository(); /// *** Declara??o do Reposit?rio Livro
			rep.folhear(livro); /// *** Reposit?rio Vai Atuar o M?todo de Folhear Livro
		}else { /// *** Caso Nenhuma Busca do Livro Foi efetuada
			System.out.println(""); /// *** Da uma quebrada de Linha
			System.out.println("        Resultado da Consulta:"); /// *** O T?tulo do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Aviso de que o Resultado n?o foi encontrado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** Da uma quebrada de linha
		} /// *** Fim do If
		
		} catch (Exception e) { /// *** Inicializa??o da Captura do Erro
			System.out.println(""); /// *** D? uma quebrada de Linha
			System.out.println("        Resultado da Consulta:"); /// *** O T?tulo do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Aviso de que nehum Resultado foi encontrado 
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** D? uma quebrada de linha
		} /// *** Finaliza??o da Captura do Erro
	} /// *** Finaliza??o do M?todo
	
	public void AvancPag() { /// *** Inicializa??o do M?todo de Avan?ar P?ginas do Livro
		try /// *** Inicializa??o do Tratamento
		{ /// *** Abre Chaves
		int[] CodigoLivro = new int[5]; /// *** Vetor C?digo do Livro
		CodigoLivro[1] = 1; /// *** C?digo do Livro 1
		CodigoLivro[2] = 2; /// *** C?digo do Livro 2
		CodigoLivro[3] = 3; /// *** C?digo do Livro 3
		CodigoLivro[4] = 4; /// *** C?digo do Livro 4
		
		String[] Titulo = new String[5]; /// *** Vetor T?tulo 
		Titulo[1] = "O Pequeno Pr?ncipe"; /// *** T?tulo 1
		Titulo[2] = "Turma da M?nica"; /// *** T?tulo 2
		Titulo[3] = "Harry Potter"; /// *** T?tulo 3
		Titulo[4] = "Senhor dos Aneis"; /// *** T?tulo 4
		
		String[] Autor = new String[5]; /// *** Vetor Autor 
		Autor[1] = "Maur?cio de Souza"; /// *** Autor 1
		Autor[2] = "Maur?cio de Souza"; /// *** Autor 2
		Autor[3] = "Paulo Bandeira"; /// *** Autor 3
		Autor[4] = "Paulo Bandeira"; /// *** Autor 4
		
		int[] TotPaginas = new int[5]; /// *** Vetor Total de P?ginas
		TotPaginas[1] = 20; /// *** Total de P?ginas 1
		TotPaginas[2] = 20; /// *** Total de P?ginas 2
		TotPaginas[3] = 200; /// *** Total de P?ginas 3
		TotPaginas[4] = 200; /// *** Total de P?ginas 4
		
		int[] PagAtual = new int[5]; /// *** Vetor P?gina Atual
		PagAtual[1] = 15; /// *** P?gina Atual 1
		PagAtual[2] = 15; /// *** P?gina Atual 2
		PagAtual[3] = 120; /// *** P?gina Atual 3
		PagAtual[4] = 120; /// *** P?gina Atual 4
		
		boolean[] Aberto = new boolean[5]; /// *** Vetor que Define se o Livro est? aberto ou N?o
		Aberto[1] = true; /// *** Aberto 1
		Aberto[2] = true; /// *** Aberto 2
		Aberto[3] = true; /// *** Aberto 3
		Aberto[4] = true; /// *** Aberto 4
		
		Scanner teclado = new Scanner(System.in); /// *** Comando que vai digitar o c?digo do livro pelo 
		/// *** Teclado
		System.out.println(""); /// *** D? uma quebrada de linha
		System.out.println("Digite o C?digo do Livro:"); /// *** O Programa Pede Para Digitar o C?digo do 
		/// *** Livro
		int j = teclado.nextInt(); /// *** Declara??o da Vari?vel Para Digitar o C?digo do Livro Pelo Teclado
		Livro livro = new Livro(); /// *** A Inst?ncia da Entidade Livro
		
		if (j == CodigoLivro[j]) /// *** Se a Vari?vel C?digo do Livro For Igual ao Vetor C?digo do Livro
		{ /// *** Abre Chaves
			
			livro.setTitulo(Titulo[j]); /// *** Atributo T?tulo Recebe o Vetor T?tulo
			livro.setAutor(Autor[j]); /// *** Atributo Autor Recebe o Vetor Autor
			livro.setTotPaginas(TotPaginas[j]); /// *** Atributo Total de P?ginas Vai Receber o Vetor Total 
			/// *** De P?ginas  
			livro.setPagAtual(PagAtual[j]); /// *** Atributo P?gina Atual Vai Receber o vetor P?gina Atual
			livro.setAberto(Aberto[j]); /// *** Atributo Que Definse se o Livro est? aberto ou N?o Vai Receber
			/// *** O Vetor que Define se o Livro est? aberto ou N?o
			String aberto = livro.isAberto() == true? "Sim": "N?o"; /// *** Declara??o da Vari?vel que Determina se o 
			/// *** Livro est? aberto ou N?o se Estiver vai estar como Sim, casocontr?rio vai estar como N?o
			System.out.println(""); /// *** D? uma quebrada de linha
			
			LivroRepository rep = new LivroRepository(); /// *** Declara??o do Reposit?rio do Livro
			rep.avancarPag(livro); /// *** Reposit?rio Vai atuar a Fun??o de Avan?ar P?gina
		}else { /// *** Caso na Consulta n?o encontre nenhuma Informa??o
			System.out.println(""); /// *** D? uma quebrada de linha
			System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Aviso que nenhum resultado foi encontrado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** Da uma quebrada de Linha
		} /// *** Fim do If
		
		} catch (Exception e) { /// *** In?cio da Captura do Erro
			System.out.println(""); /// *** Da uma quebrada de linha
			System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Aviso do Programa de que nenhum resultado
			/// *** Foi encontrado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** Quebra de linha
		} /// *** Fim da Captura do Erro
	} /// *** Fim do M?todo
	
	public void ReturnPag() { /// *** Inicializa??o do M?todo Retornar P?gina
		try /// *** Inicializa??o do Tratamento
		{ /// *** Abre Chaves
		int[] CodigoLivro = new int[5]; /// *** Vetor C?digo do Livro
		CodigoLivro[1] = 1; /// *** C?digo do Livro 1
		CodigoLivro[2] = 2; /// *** C?digo do Livro 2
		CodigoLivro[3] = 3; /// *** C?digo do Livro 3
		CodigoLivro[4] = 4; /// *** C?digo do Livro 4
		
		String[] Titulo = new String[5]; /// *** Vetor T?tulo
		Titulo[1] = "O Pequeno Pr?ncipe"; /// *** T?tulo 1
		Titulo[2] = "Turma da M?nica"; /// *** T?tulo 2
		Titulo[3] = "Harry Potter"; /// *** T?tulo 3
		Titulo[4] = "Senhor dos Aneis"; /// *** T?tulo 4
		
		String[] Autor = new String[5]; /// *** Vetor Autor
		Autor[1] = "Maur?cio de Souza"; /// *** Autor 1
		Autor[2] = "Maur?cio de Souza"; /// *** Autor 2
		Autor[3] = "Paulo Bandeira"; /// *** Autor 3
		Autor[4] = "Paulo Bandeira"; /// *** Autor 4
		
		int[] TotPaginas = new int[5]; /// *** Vetor Total de P?ginas
		TotPaginas[1] = 20; /// *** Total de P?ginas 1
		TotPaginas[2] = 20; /// *** Total de P?ginas 2
		TotPaginas[3] = 200; /// *** Total de P?ginas 3
		TotPaginas[4] = 200; /// *** Total de P?ginas 4
		
		int[] PagAtual = new int[5]; /// *** Vetor P?gina Atual
		PagAtual[1] = 15; /// *** P?gina Atual 1
		PagAtual[2] = 15; /// *** P?gina Atual 2
		PagAtual[3] = 120; /// *** P?gina Atual 3
		PagAtual[4] = 120; /// *** P?gina Atual 4
		
		boolean[] Aberto = new boolean[5]; /// *** Vetor que Define se o Livro est? aberto ou n?o
		Aberto[1] = true; /// *** Aberto 1
		Aberto[2] = true; /// *** Aberto 2
		Aberto[3] = true; /// *** Aberto 3
		Aberto[4] = true; /// *** Aberto 4
		
		Scanner teclado = new Scanner(System.in); /// *** Comando Para digitar o C?digo do Livro pelo Teclado
		System.out.println(""); /// *** D? uma quebrada de linha
		System.out.println("Digite o C?digo do Livro:"); /// *** O Programa Pede Para Digitar o C?digo do 
		/// *** Livro
		int j = teclado.nextInt(); /// *** Declara??o da Vari?vel que Digita o C?digo do Livro Pelo Teclado
		Livro livro = new Livro(); /// *** Inst?ncia da Entidade Livro
		
		if (j == CodigoLivro[j]) /// *** Se a Vari?vel C?digo do Livro For Igual ao Vetor C?digo do Livro 
		{ /// *** Abre Parenteses
			
			livro.setTitulo(Titulo[j]); /// *** Atributo T?tulo do Livro Recebe o Vetor C?digo do Livro
			livro.setAutor(Autor[j]); /// *** Atributo Autor do Livro Recebe o Vetor Autor do Livro
			livro.setTotPaginas(TotPaginas[j]); /// *** Atributo Total de P?gnas Recebe o Vetor Total de 
			/// *** P?ginas
			livro.setPagAtual(PagAtual[j]); /// *** Atributo P?gina Atual Recebe o Vetor P?gina Atual
			livro.setAberto(Aberto[j]); /// *** Atributo Que Define se o Livro est? aberto ou n?o Recebe o 
			/// *** Vetor Que Define se o Livro est? aberto ou N?o
			String aberto = livro.isAberto() == true? "Sim": "N?o"; /// *** Declara??o da Vari?vel que Define 
			/// *** Se o Livro est? aberto ou N?o se estiver vai estar como Sim, caso contr?rio vai estar como N?o
			System.out.println(""); /// *** D? uma quebrada de Linha
			
			LivroRepository rep = new LivroRepository(); /// *** Declara??o do Repoit?rio Livro
			rep.voltarPag(livro); /// *** Reposit?rio Vai Atuar a Fun??o Retornar P?gina do Livro
		}else { /// *** Caso Nenhuma Consulta Fosse Encontrada
			System.out.println(""); /// *** D? uma Quebrada de Linha
			System.out.println("        Resultado da Consulta:"); /// *** T?tulo do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Aviso de que nenhum Resultado Foi Encontrado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** D? uma Quebra de Linha
		} /// *** Fim do If
		
		} catch (Exception e) { /// *** Inicializa??o da Captura do Erro
			System.out.println(""); /// *** Da uma quebrada de linha
			System.out.println("        Resultado da Consulta:"); /// *** O T?tulo do Resultado da Consulta
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println("Nenhum resultado encontrado."); /// *** O Sviso de que nenhum resultado foi 
			/// *** Encontrado
			System.out.println("---------------------------------------"); /// *** Conceito de Perfumaria
			System.out.println(""); /// *** D? uma Quebrada de Linha
		} /// *** Fim Da Captura do Erro
	} /// *** Fim do M?todo
} /// *** Fim da Controller
