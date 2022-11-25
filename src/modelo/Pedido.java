package modelo;

public class Pedido {

	private int id;
	private float valor;
	private String endereco;

	public Pedido(int id, float valor, String endereco) {
		this.id = id;
		this.valor = valor;
		this.endereco = endereco;
	}

	public Pedido() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "\nCódigo: " + this.id + " \nValor: " + this.valor + "\nEndereço:" + this.endereco;
	}
}