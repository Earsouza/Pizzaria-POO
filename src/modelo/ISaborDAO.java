package modelo;

import java.util.ArrayList;

public interface ISaborDAO {
	
	public boolean inserir(Sabor s);

	public boolean alterar(Sabor s, int id);

	public boolean excluir(Sabor s, int id);

	public ArrayList<Sabor> listarSabores();

}
