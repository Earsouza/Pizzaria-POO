package controle;

import java.util.ArrayList;

import modelo.IPizzaBD;
import modelo.Pizza;

public class PizzaBD implements IPizzaBD {

	private ArrayList<Pizza> bdPizzas;

	public PizzaBD() {
		this.bdPizzas = new ArrayList<>();
	}

	@Override
	public boolean incluir(Pizza p) {
		this.bdPizzas.add(p);
		return false;
	}

	@Override
	public ArrayList<Pizza> lista() {
		// TODO Auto-generated method stub
		return this.bdPizzas;
	}

	@Override
	public boolean atualizar(Pizza p, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Pizza p, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
