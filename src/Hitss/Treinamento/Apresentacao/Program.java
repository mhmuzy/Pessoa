package Hitss.Treinamento.Apresentacao;

import java.util.Scanner; /// *** Assembly

import Hitss.Treinamento.Infra.*; /// *** Camada de Infra

public class Program {
	public static void main(String[] args) {
		try {
			/// *** Inicializa??o do Tratamento
		
		System.out.println(""); /// *** Pula 1 Linha para o Enunciado do Programa N?o Ficar muito Colado em Cima
		System.out.println("Programa da Livraria:"); /// *** Enunciado do Programa
		System.out.println(""); /// *** Pula mais 1 Linha Para o Aviso ao Usu?rio n?o ficar colado com o Enunciado do Programa
		System.out.println("Selecione a op??o desejada."); /// *** Aviso de Orienta??o ao Usu?rio Para Poder Manusear o Programa
		System.out.println(""); /// *** Pula mais 1 Linha Para a Lista de Op??es de Manuseio do Programa N?o ficar colado com a Orienta??o de 
		/// *** Manuseio Para o(a) Usu?rio(a)
		System.out.println("--------------------------------------------------------------------"); /// *** Conceito de Perfumaria
		System.out.println("(1) - Ver se o(a) Cliente Faz Anivers?rio Hoje"); /// *** Op??o 1 => Para  ver se o(a) Cliente Faz Anivers?rio Hoje
		System.out.println("(2) - Registrar a Leitura da Pessoa"); /// *** Op??o 2 => Para Registrar o Registro da Leitura do(a) Cliente
		System.out.println("(3) - Mostrar Detalhes do Livro"); /// *** Op??o 3 => Mostrar os Detalhes do Livro
		System.out.println("(4) - Abrir Livro"); /// *** Op??o 4 => Abrir o Livro
		System.out.println("(5) - Fechar Livro"); /// *** Op??o 5 => Fechar o Livro
		System.out.println("(6) - Ver aonde Parou na P?gina do Livro"); /// *** Op??o 6 => Ver aonde Parou na P?gina do Livro
		System.out.println("(7) - Avan?ar P?gina do Livro"); /// *** Op??o 7 => Avan?ar a P?gina do Livro
		System.out.println("(8) - Retornar P?gina do Livro"); /// *** Op??o 8 => Retroceder a P?gina do Livro
		System.out.println("--------------------------------------------------------------------"); /// *** Conceito de Perfumaria
		System.out.println(""); /// *** Pula 1 Linha Para o Cursor de op??o n?o ficar colado com o Menu de Op??o
		Scanner teclado = new Scanner(System.in); /// *** Comando para digitar a Op??o no Teclado
		
		int opcao = teclado.nextInt(); /// *** Declara??o da Vari?vel Op??o
		Controller control = new Controller(); /// *** Inst?ncia do Objeto Controller
		switch (opcao) { /// *** O In?cio do Switch Case para Iniciar o Funcionamento do Programa e Coloca a vari?vel op??o como Par?metro
		case 1: /// *** Caso a Op??o seja 1
			
			control.BuscarAniversario(); /// *** A Controller efetuar? a Fun??o de Anivers?rio
			break; /// *** Para a Execu??o do Programa
		case 2: /// *** Caso a Op??o Seja 2
			control.EfetuarLeituraPessoa(); /// *** A Controller vai Efetuar a Fun??o de Efetutar a Leitura da Pessoa Com o Livro
			break; /// *** Para a Execu??o do Programa
		case 3: /// *** Caso a Op??o Seja 3
			control.MostrarDetalhesLivro(); /// *** A Controller vai Efetuar a Fun??o de Mostrar os Detalhes do Livro
			break; /// *** Para a Execu??o do Programa
		case 4: /// *** Caso a Op??o Seja 4
			control.AbrirLivro(); /// *** A Controller vai Efetuar a Fun??o de Abrir o Livro
			break; /// *** Para a Execu??o do Programa
		case 5: /// *** Caso a Op??o Seja 5
			control.FecharLivro(); /// *** Controller vai fechar o Livro 
			break; /// *** Para a Execu??o do Programa
		case 6: /// *** Caso a Op??o Seja 6
			control.VerPagParouLivro(); /// *** O Programa vai ver a P?gina que parou o Livro
			break; /// *** Para a Execu??o do Programa
		case 7: /// *** Caso a Op??o Seja 7
			control.AvancPag(); /// *** A Controller vai avan?ar a P?gina do Livro
			break; /// *** Para a Execu??o do Programa
		case 8: /// *** Caso a Op??o Seja 8
			control.ReturnPag(); /// *** A Controller retorna a P?gina
			break; /// *** Para a Execu??o do Programa
		default: /// *** Padr?o
			System.out.println(""); /// *** Pula 1 Linha
			System.out.println("Por favor, digite a op??o informada."); /// *** O Programa Pede Para 
			/// *** Digitar a Op??o Informada
			break; /// *** Para a Execu??o do Programa
		} /// *** Finaliza o Switch Case
		} catch (Exception e) { /// *** Faz a Captura do Erro
			System.out.println(""); /// *** Pula 1 linha
			System.out.println("Erro: " + e.getMessage()); /// *** O Programa mostra o erro capturado
		} /// *** Finaliza??o do Tratamento
	}
}
