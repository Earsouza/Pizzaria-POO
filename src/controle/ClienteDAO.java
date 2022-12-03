package controle;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.IClienteDAO;

public class ClienteDAO implements IClienteDAO
{

	ArrayList<Cliente> tabelaClientes;
	private static ClienteDAO instancia;

	private ClienteDAO() {
		criarDados();
	}

	public static ClienteDAO getInstancia() {

		if (instancia == null) {
			instancia = new ClienteDAO();
		}

		return instancia;
	}

	private void criarDados() {
		tabelaClientes = new ArrayList<>();
		Cliente c1 = new Cliente(1, "Carlos", "0999221", "123123");
		Cliente c2 = new Cliente(2, "Luisa", "65146584", "5765756");
		Cliente c3 = new Cliente(3, "Vitoria", "542468", "3435365");
		tabelaClientes.add(c1);
		tabelaClientes.add(c2);
		tabelaClientes.add(c3);
	}
	
	public void verificaCliente(int clienteSelecionado) {
		Boolean retorno = null;
		for (Cliente cliente : tabelaClientes) {

			if (cliente.getId() == clienteSelecionado) {
				retorno = true;
				break;
			}
			else {
				retorno = false;
			}
		}
		if(retorno == true) {
			System.out.println("Cadastrado no pedido");
		}
		else {
			System.out.println("Usuario ainda não cadastrado");
		}
	}

	@Override
	public ArrayList<Cliente> listarClientes() {
		return tabelaClientes;
	}

}
