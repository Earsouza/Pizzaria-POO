package modelo;

public class Funcionario extends Pessoa {
	private String funcao;
	private String email;

	Funcionario() {

	}

	public Funcionario(String nome, String cpf, String funcao, String email) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.funcao = funcao;
		this.email = email;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
