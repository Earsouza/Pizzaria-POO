package modelo;

import java.util.ArrayList;

public interface IClienteBD {

	public boolean incluir(Cliente c);

	public ArrayList<Cliente> lista();

	public boolean atualizar(Cliente c, int id);

	public boolean remover(Cliente p, int id);

}
