package modelo;

import java.util.ArrayList;

public interface ISaborBD {
	
	public boolean incluir(Sabor s);

	public ArrayList<Sabor> lista();

	public boolean atualizar(Sabor s, int id);

	public boolean remover(Sabor s, int id);

}
