package controle;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.IClienteBD;

public class ClienteBD implements IClienteBD {
	
	private ArrayList<Cliente> bdCliente;

	public ClienteBD() {
		this.bdCliente = new ArrayList<>();
	}

	@Override
	public boolean incluir(Cliente c) {
		this.bdCliente.add(c);
		return false;
	}

	@Override
	public ArrayList<Cliente> lista() {
		// TODO Auto-generated method stub
		return this.bdCliente;
	}

	@Override
	public boolean atualizar(Cliente c, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Cliente p, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
