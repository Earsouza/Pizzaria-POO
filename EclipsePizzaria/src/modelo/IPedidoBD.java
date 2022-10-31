package modelo;

import java.util.ArrayList;

public interface IPedidoBD {

	public boolean incluir(Pedido p);

	public ArrayList<Pedido> lista();

	public boolean atualizar(Pedido p, int id);

	public boolean remover(Pedido p, int id);
	
}
