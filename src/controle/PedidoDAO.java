package controle;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.IPedidoDAO;
import modelo.Pedido;

public class PedidoDAO implements IPedidoDAO {

	private static ArrayList<Pedido> tabelaPedidos;
	private static PedidoDAO instancia;
	ArrayList<Cliente> tabelaClientes;

	private PedidoDAO() {

	}

	public static PedidoDAO getInstancia() {

		if (instancia == null) {
			instancia = new PedidoDAO();
			tabelaPedidos = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Pedido p) {
		if (p != null) {
			tabelaPedidos.add(p);
			return true;
		}

		return false;
	}

	@Override
	public boolean alterar(Pedido p, int id) {
		for (Pedido pedido : tabelaPedidos) {

			if (pedido.getId() == id) {
				pedido.setEndereco(p.getEndereco());
				pedido.setValor(p.getValor());
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean excluir(Pedido p, int id) {
		for (Pedido pedido : tabelaPedidos) {

			if (pedido.getId() == id) {
				tabelaPedidos.remove(pedido);
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Pedido> listarPedidos() {
		return tabelaPedidos;

	}

	
}
