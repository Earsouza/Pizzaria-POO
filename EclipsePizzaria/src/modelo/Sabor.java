package modelo;

public class Sabor {

	private String nomeSabor;
	private String ingredientes;

	Sabor() {

	}

	public Sabor(String nomeSabor, String ingredientes) {
		super();
		this.nomeSabor = nomeSabor;
		this.ingredientes = ingredientes;
	}

	public String getNomeSabor() {
		return nomeSabor;
	}

	public void setNomeSabor(String nomeSabor) {
		this.nomeSabor = nomeSabor;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

}
