package Hitss.Treinamento.Classes;

public class Pessoa { /// *** Declaração da Entidade Pessoa

	private String nome; /// *** Atributo Nome
	private int idade; /// *** Atributo Idade
	private boolean sexo; /// *** Atributo Sexo

	public String getNome() { /// *** Método GetNome
		return nome;
	}
	public void setNome(String nome) { /// *** Método SetNome
		this.nome = nome;
	}
	public int getIdade() { /// *** Método GetIdade
		return idade;
	}
	public void setIdade(int idade) { /// *** Método SetIdade
		this.idade = idade;
	}
	public boolean isSexo() { /// *** Método IsSexo
		return sexo;
	}
	public void setSexo(boolean sexo) { /// *** Método SetSexo
		this.sexo = sexo;
	}
	
}
