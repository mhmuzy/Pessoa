package Hitss.Treinamento.Classes;

public class Pessoa { /// *** Declara��o da Entidade Pessoa

	private String nome; /// *** Atributo Nome
	private int idade; /// *** Atributo Idade
	private boolean sexo; /// *** Atributo Sexo

	public String getNome() { /// *** M�todo GetNome
		return nome;
	}
	public void setNome(String nome) { /// *** M�todo SetNome
		this.nome = nome;
	}
	public int getIdade() { /// *** M�todo GetIdade
		return idade;
	}
	public void setIdade(int idade) { /// *** M�todo SetIdade
		this.idade = idade;
	}
	public boolean isSexo() { /// *** M�todo IsSexo
		return sexo;
	}
	public void setSexo(boolean sexo) { /// *** M�todo SetSexo
		this.sexo = sexo;
	}
	
}
