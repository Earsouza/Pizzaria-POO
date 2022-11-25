package modelo;

public class Pizza {

	private int id;
	private String tamanhoPizza;

	public Pizza(int id, String tamanhoPizza) {
		this.id = id;
		this.tamanhoPizza = tamanhoPizza;
	}

	public Pizza() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTamanhoPizza() {
		return tamanhoPizza;
	}

	public void setTamanhoPizza(String tamanhoPizza) {
		this.tamanhoPizza = tamanhoPizza;
	}
}
