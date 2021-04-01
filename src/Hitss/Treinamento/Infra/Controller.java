package Hitss.Treinamento.Infra;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import Hitss.Treinamento.Repositories.*;
import Hitss.Treinamento.Classes.*;

public class Controller {
	
	public void BuscarAniversario() {
		try {
			
		
		int[] Codigo = new int[5];
		Codigo[1] = 1;
		Codigo[2] = 2;
		Codigo[3] = 3;
		Codigo[4] = 4;
		
		String[] Nome = new String[5];
		Nome[1] = "Jos� Claudio da Silva Moraes";
		Nome[2] = "Armando Batista";
		Nome[3] = "Jessica Nunes";
		Nome[4] = "L�via Bueno";
		
		int[] Idade = new int[5];
		Idade[1] = 20;
		Idade[2] = 16;
		Idade[3] = 16;
		Idade[4] = 20;
		
		boolean[] Sexo = new boolean[5];
		Sexo[1] = true;
		Sexo[2] = true;
		Sexo[3] = false;
		Sexo[4] = false;

		Scanner teclado = new Scanner(System.in); 
		System.out.println("");
		System.out.println("Digite o c�digo da pessoa:");
		int i = teclado.nextInt();
		Pessoa pessoa = new Pessoa();
		
		if (i == Codigo[i]) 
		{
			pessoa.setNome(Nome[i]);
			pessoa.setIdade(Idade[i]);
			pessoa.setSexo(Sexo[i]);
			String sexo = pessoa.isSexo() == true? "Masculino": "Feminino";  
			System.out.println("");
			System.out.println("        Resultado da Consulta:");
			System.out.println("---------------------------------------");
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Sexo:" + sexo);
			System.out.println("---------------------------------------");
			System.out.println("");
			PessoaRepository rep = new PessoaRepository();
			rep.Aniversario(pessoa);
		}else {
			System.out.println("");
			System.out.println("        Resultado da Consulta:");
			System.out.println("---------------------------------------");
			System.out.println("Nenhum resultado encontrado.");
			System.out.println("---------------------------------------");
			System.out.println("");
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
	
	public void EfetuarLeituraPessoa() {
		try {
			
			
			int[] Codigo = new int[5];
			Codigo[1] = 1;
			Codigo[2] = 2;
			Codigo[3] = 3;
			Codigo[4] = 4;
			
			String[] Nome = new String[5];
			Nome[1] = "Jos� Claudio da Silva Moraes";
			Nome[2] = "Armando Batista";
			Nome[3] = "Jessica Nunes";
			Nome[4] = "L�via Bueno";
			
			int[] Idade = new int[5];
			Idade[1] = 20;
			Idade[2] = 16;
			Idade[3] = 16;
			Idade[4] = 20;
			
			boolean[] Sexo = new boolean[5];
			Sexo[1] = true;
			Sexo[2] = true;
			Sexo[3] = false;
			Sexo[4] = false;
			

			int[] CodigoLivro = new int[5];
			CodigoLivro[1] = 1;
			CodigoLivro[2] = 2;
			CodigoLivro[3] = 3;
			CodigoLivro[4] = 4;
			
			String[] Titulo = new String[5];
			Titulo[1] = "O Pequeno Pr�ncipe";
			Titulo[2] = "Turma da M�nica";
			Titulo[3] = "Harry Potter";
			Titulo[4] = "Senhor dos Aneis";
			
			String[] Autor = new String[5];
			Autor[1] = "Maur�cio de Souza";
			Autor[2] = "Maur�cio de Souza";
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
			System.out.println("Digite o c�digo da pessoa:");
			int i = teclado.nextInt();
			Pessoa pessoa = new Pessoa();
			System.out.println("");
			System.out.println("Digite o C�digo do Livro:");
			int j = teclado.nextInt();
			Livro livro = new Livro();
			
			if (i == Codigo[i] && j == CodigoLivro[j]) 
			{
				pessoa.setNome(Nome[i]);
				pessoa.setIdade(Idade[i]);
				pessoa.setSexo(Sexo[i]);
				livro.setTitulo(Titulo[j]);
				livro.setAutor(Autor[j]);
				livro.setTotPaginas(TotPaginas[j]);
				livro.setPagAtual(PagAtual[j]);
				livro.setAberto(Aberto[j]);
				String sexo = pessoa.isSexo() == true? "Masculino": "Feminino";
				String aberto = livro.isAberto() == true? "Sim": "N�o";
				System.out.println("");
				System.out.println("   Resultado da Consulta da Pessoa:");
				System.out.println("---------------------------------------");
				System.out.println("Nome: " + pessoa.getNome());
				System.out.println("Idade: " + pessoa.getIdade());
				System.out.println("Sexo:" + sexo);
				System.out.println("---------------------------------------");
				System.out.println("");
				System.out.println("	Resultado da Consulta do Livro");
				System.out.println("---------------------------------------");
				System.out.println("T�tulo: " + livro.getTitulo());
				System.out.println("Autor: " + livro.getAutor());
				System.out.println("Total de P�ginas: " + livro.getTotPaginas());
				System.out.println("P�gina Atual: " + livro.getPagAtual());
				System.out.println("Est� Aberto? " + aberto);
				System.out.println("---------------------------------------");
				System.out.println("");
				LeituraRepository rep = new LeituraRepository();
				Leitura leit = new Leitura();
				leit.setPessoa(pessoa);
				leit.setLivro(livro);
				rep.EfetuarLeitura(pessoa, livro, leit);
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
	
	public void MostrarDetalhesLivro() {
		try
		{
		int[] CodigoLivro = new int[5];
		CodigoLivro[1] = 1;
		CodigoLivro[2] = 2;
		CodigoLivro[3] = 3;
		CodigoLivro[4] = 4;
		
		String[] Titulo = new String[5];
		Titulo[1] = "O Pequeno Pr�ncipe";
		Titulo[2] = "Turma da M�nica";
		Titulo[3] = "Harry Potter";
		Titulo[4] = "Senhor dos Aneis";
		
		String[] Autor = new String[5];
		Autor[1] = "Maur�cio de Souza";
		Autor[2] = "Maur�cio de Souza";
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
		System.out.println("Digite o C�digo do Livro:");
		int j = teclado.nextInt();
		Livro livro = new Livro();
		
		if (j == CodigoLivro[j]) 
		{
			
			livro.setTitulo(Titulo[j]);
			livro.setAutor(Autor[j]);
			livro.setTotPaginas(TotPaginas[j]);
			livro.setPagAtual(PagAtual[j]);
			livro.setAberto(Aberto[j]);
			String aberto = livro.isAberto() == true? "Sim": "N�o";
			System.out.println("");
			
			LivroRepository rep = new LivroRepository();
			rep.Detalhes(livro);
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
	
	public void AbrirLivro() {
		try
		{
		int[] CodigoLivro = new int[5];
		CodigoLivro[1] = 1;
		CodigoLivro[2] = 2;
		CodigoLivro[3] = 3;
		CodigoLivro[4] = 4;
		
		String[] Titulo = new String[5];
		Titulo[1] = "O Pequeno Pr�ncipe";
		Titulo[2] = "Turma da M�nica";
		Titulo[3] = "Harry Potter";
		Titulo[4] = "Senhor dos Aneis";
		
		String[] Autor = new String[5];
		Autor[1] = "Maur�cio de Souza";
		Autor[2] = "Maur�cio de Souza";
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
		System.out.println("Digite o C�digo do Livro:");
		int j = teclado.nextInt();
		Livro livro = new Livro();
		
		if (j == CodigoLivro[j]) 
		{
			
			livro.setTitulo(Titulo[j]);
			livro.setAutor(Autor[j]);
			livro.setTotPaginas(TotPaginas[j]);
			livro.setPagAtual(PagAtual[j]);
			livro.setAberto(Aberto[j]);
			String aberto = livro.isAberto() == true? "Sim": "N�o";
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
		Titulo[1] = "O Pequeno Pr�ncipe";
		Titulo[2] = "Turma da M�nica";
		Titulo[3] = "Harry Potter";
		Titulo[4] = "Senhor dos Aneis";
		
		String[] Autor = new String[5];
		Autor[1] = "Maur�cio de Souza";
		Autor[2] = "Maur�cio de Souza";
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
		System.out.println("Digite o C�digo do Livro:");
		int j = teclado.nextInt();
		Livro livro = new Livro();
		
		if (j == CodigoLivro[j]) 
		{
			
			livro.setTitulo(Titulo[j]);
			livro.setAutor(Autor[j]);
			livro.setTotPaginas(TotPaginas[j]);
			livro.setPagAtual(PagAtual[j]);
			livro.setAberto(Aberto[j]);
			String aberto = livro.isAberto() == true? "Sim": "N�o";
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
		Titulo[1] = "O Pequeno Pr�ncipe";
		Titulo[2] = "Turma da M�nica";
		Titulo[3] = "Harry Potter";
		Titulo[4] = "Senhor dos Aneis";
		
		String[] Autor = new String[5];
		Autor[1] = "Maur�cio de Souza";
		Autor[2] = "Maur�cio de Souza";
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
		System.out.println("Digite o C�digo do Livro:");
		int j = teclado.nextInt();
		Livro livro = new Livro();
		
		if (j == CodigoLivro[j]) 
		{
			
			livro.setTitulo(Titulo[j]);
			livro.setAutor(Autor[j]);
			livro.setTotPaginas(TotPaginas[j]);
			livro.setPagAtual(PagAtual[j]);
			livro.setAberto(Aberto[j]);
			String aberto = livro.isAberto() == true? "Sim": "N�o";
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
		Titulo[1] = "O Pequeno Pr�ncipe";
		Titulo[2] = "Turma da M�nica";
		Titulo[3] = "Harry Potter";
		Titulo[4] = "Senhor dos Aneis";
		
		String[] Autor = new String[5];
		Autor[1] = "Maur�cio de Souza";
		Autor[2] = "Maur�cio de Souza";
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
		System.out.println("Digite o C�digo do Livro:");
		int j = teclado.nextInt();
		Livro livro = new Livro();
		
		if (j == CodigoLivro[j]) 
		{
			
			livro.setTitulo(Titulo[j]);
			livro.setAutor(Autor[j]);
			livro.setTotPaginas(TotPaginas[j]);
			livro.setPagAtual(PagAtual[j]);
			livro.setAberto(Aberto[j]);
			String aberto = livro.isAberto() == true? "Sim": "N�o";
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
		Titulo[1] = "O Pequeno Pr�ncipe";
		Titulo[2] = "Turma da M�nica";
		Titulo[3] = "Harry Potter";
		Titulo[4] = "Senhor dos Aneis";
		
		String[] Autor = new String[5];
		Autor[1] = "Maur�cio de Souza";
		Autor[2] = "Maur�cio de Souza";
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
		System.out.println("Digite o C�digo do Livro:");
		int j = teclado.nextInt();
		Livro livro = new Livro();
		
		if (j == CodigoLivro[j]) 
		{
			
			livro.setTitulo(Titulo[j]);
			livro.setAutor(Autor[j]);
			livro.setTotPaginas(TotPaginas[j]);
			livro.setPagAtual(PagAtual[j]);
			livro.setAberto(Aberto[j]);
			String aberto = livro.isAberto() == true? "Sim": "N�o";
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
