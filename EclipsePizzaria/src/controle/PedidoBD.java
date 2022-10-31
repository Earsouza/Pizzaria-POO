package controle;

import java.util.ArrayList;

import modelo.IPedidoBD;
import modelo.Pedido;

public class PedidoBD implements IPedidoBD {

	private ArrayList<Pedido> bdPedidos;

	public PedidoBD() {
		this.bdPedidos = new ArrayList<>();
	}

	@Override
	public boolean incluir(Pedido p) {
		this.bdPedidos.add(p);
		return false;
	}

	@Override
	public ArrayList<Pedido> lista() {
		// TODO Auto-generated method stub
		return this.bdPedidos;
	}

	@Override
	public boolean atualizar(Pedido p, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Pedido p, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
