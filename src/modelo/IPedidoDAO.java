package modelo;

import java.util.ArrayList;

public interface IPedidoDAO {

	public boolean inserir(Pedido p);

	public boolean alterar(Pedido p, int id);

	public boolean excluir(Pedido p, int id);

	public ArrayList<Pedido> listarPedidos();


}
