package controle;

import java.util.ArrayList;

import modelo.ISaborDAO;
import modelo.Sabor;

public class SaborDAO implements ISaborDAO {

	private static ArrayList<Sabor> tabelaSabores;
	private static SaborDAO instancia;

	private SaborDAO() {

	}

	public static SaborDAO getInstancia() {

		if (instancia == null) {
			instancia = new SaborDAO();
			tabelaSabores = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Sabor s) {
		if (s != null) {
			tabelaSabores.add(s);
			return true;
		}

		return false;
	}

	@Override
	public boolean alterar(Sabor s, int id) {
		for (Sabor sabor : tabelaSabores) {

			if (sabor.getId() == id) {
				sabor.setNome(s.getNome());
				sabor.setIngredientes(s.getIngredientes());
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean excluir(Sabor s, int id) {
		for (Sabor sabor : tabelaSabores) {
			if (sabor.getId() == id) {
				tabelaSabores.remove(sabor);
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Sabor> listarSabores() {
		return tabelaSabores;
	}
	
	public ArrayList<Sabor> listarNomeSabores(){
		tabelaSabores
		
		return tabelaSabores;
	}

}
