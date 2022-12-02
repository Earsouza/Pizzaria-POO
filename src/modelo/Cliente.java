package modelo;

public class Cliente extends Pessoa {

	private String telefone;
	private int id;

	public Cliente() {
	}

	public Cliente(int id, String nome, String cpf, String telefone) {
		this.id = id;
		this.setNome(nome);
		this.setCpf(cpf);
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {

		return this.getId() + "-" + this.getNome();
	}

}
