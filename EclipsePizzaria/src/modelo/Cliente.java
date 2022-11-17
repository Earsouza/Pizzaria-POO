package modelo;

public class Cliente extends Pessoa {

	private String formaPagamento;
	private String telefone;

	public Cliente() {
	}
	 
	public Cliente(String nome, String cpf, String formaPagamento, String telefone) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.formaPagamento = formaPagamento;
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

}
