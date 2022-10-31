package modelo;

import java.util.ArrayList;

public interface IPizzaBD {
	
	public boolean incluir(Pizza p);

	public ArrayList<Pizza> lista();

	public boolean atualizar(Pizza p, int id);

	public boolean remover(Pizza p, int id);

}
