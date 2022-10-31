package controle;

import java.util.ArrayList;

import modelo.ISaborBD;
import modelo.Sabor;

public class SaborBD implements ISaborBD {

	private ArrayList<Sabor> bdSabores;

	public SaborBD() {
		this.bdSabores = new ArrayList<>();
	}

	@Override
	public boolean incluir(Sabor s) {
		this.bdSabores.add(s);
		return false;
	}

	@Override
	public ArrayList<Sabor> lista() {
		// TODO Auto-generated method stub
		return this.bdSabores;
	}

	@Override
	public boolean atualizar(Sabor s, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Sabor s, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
