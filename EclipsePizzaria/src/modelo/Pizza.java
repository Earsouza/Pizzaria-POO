package modelo;

public class Pizza {

	private int tamanho;
	private int qtdSabores;
	private int qtdPizza;

	Pizza() {

	}

	public Pizza(int tamanho, int qtdSabores, int qtdPizza) {
		super();
		this.tamanho = tamanho;
		this.qtdSabores = qtdSabores;
		this.qtdPizza = qtdPizza;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getQtdSabores() {
		return qtdSabores;
	}

	public void setQtdSabores(int qtdSabores) {
		this.qtdSabores = qtdSabores;
	}

	public int getQtdPizza() {
		return qtdPizza;
	}

	public void setQtdPizza(int qtdPizza) {
		this.qtdPizza = qtdPizza;
	}

}
