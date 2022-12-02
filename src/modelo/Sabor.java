package modelo;

public class Sabor {

	private String nome;
	private String ingredientes;
	private int id;

	public Sabor(String nome, String ingredientes, int id) {
		super();
		this.nome = nome;
		this.ingredientes = ingredientes;
		this.id = id;
	}

	public Sabor() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "\nCodigo: " + this.id + "\nSabor: " + this.nome + " \nIngredientes: " + this.ingredientes;
	}
}
