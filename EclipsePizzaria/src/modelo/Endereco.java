package modelo;

public class Endereco {
	private Integer cep;
	private String cidade;
	private String estado;
	private String rua;
	private Integer numero;

	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Rua: " + this.rua + ", Número: " + this.numero +
			   ", Cidade: " + this.cidade + ", Estado: " + this.estado +
			   ", CEP: " + this.cep;
	}

}
