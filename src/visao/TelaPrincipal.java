package visao;

import controle.ClienteDAO;
import java.util.ArrayList;
import java.util.Scanner;

import controle.PedidoDAO;
import controle.SaborDAO;
import modelo.Cliente;
import modelo.Pedido;
import modelo.Sabor;

public class TelaPrincipal {

	public void iniciarSistema() {

		int idSabor = 0;
		int idPedido = 0;
		Integer opcaoSelecionada = Integer.MAX_VALUE;
		SaborDAO bancoSabor = SaborDAO.getInstancia();
		PedidoDAO bancoPedido = PedidoDAO.getInstancia();
		ClienteDAO bancoCliente = ClienteDAO.getInstancia();

		// PedidoDAO bancoPedido = PedidoDAO.getInstancia();
		while (opcaoSelecionada != 0) {
			// Reiniciar scanner para não ficar "lixo"
			Scanner scan = new Scanner(System.in);
			System.out.println("------PIZZARIA-------");
			System.out.println("0 SAIR");
			System.out.println("1 CADASTRAR SABOR");
			System.out.println("2 EXCLUIR SABOR");
			System.out.println("3 ALTERAR SABOR");
			System.out.println("4 LISTAR SABORES");

			System.out.println("\n5 CADASTRAR PEDIDO");
			System.out.println("6 EXCLUIR PEDIDO");
			System.out.println("7 ALTERAR PEDIDO");
			System.out.println("8 LISTAR PEDIDOS");

			System.out.print("\nOpção: ");
			opcaoSelecionada = Integer.valueOf(scan.nextLine());

			switch (opcaoSelecionada) {
			case 0:
				break;

			case 1: {
				idSabor++;
				cadastrarSabor(idSabor, scan, bancoSabor);
				break;
			}
			case 2: {
				excluirSabor(scan, bancoSabor);
				break;
			}
			case 3: {
				alterarSabor(scan, bancoSabor);
				break;
			}
			case 4: {
				ArrayList<Sabor> tabelaSabores = bancoSabor.listarSabores();
				System.out.println(tabelaSabores.toString());
				break;
			}
			case 5: {
				idPedido++;
				cadastroPedido(idPedido, bancoCliente, scan, bancoPedido, bancoSabor);
				break;
			}
			case 6: {
				excluirPedido(scan, bancoPedido);
				break;
			}
			case 7: {
				alterarPedido(scan, bancoPedido);
				break;
			}
			case 8: {
				ArrayList<Pedido> tabelaPedidos = bancoPedido.listarPedidos();
				System.out.println(tabelaPedidos.toString());
				break;
			}

			}

		}
	}

	private void cadastroPedido(int idPedido, ClienteDAO bancoCliente, Scanner scan, PedidoDAO bancoPedido,
			SaborDAO bancoSabor) {
		Pedido p = new Pedido();

		System.out.println("Cadastro de Pedido");
		p.setId(idPedido);

		ArrayList<Sabor> tabelaSabores = bancoSabor.listarSabores();
		System.out.println(tabelaSabores.toString());
		System.out.println("Informe o código do sabor desejado: ");
		int saborSelecionado = scan.nextInt();
		bancoSabor.verificaSabor(saborSelecionado);
		
		ArrayList<Cliente> tabelaCliente = bancoCliente.listarClientes();
		System.out.println(tabelaCliente.toString());
		System.out.println("Selecione um cliente: ");
		int clienteSelecionado = scan.nextInt();
		bancoCliente.verificaCliente(clienteSelecionado);
		scan = new Scanner(System.in);

		System.out.println("Informe o endereço: ");
		String endereco = scan.nextLine();

		System.out.println("Informe o valor total: ");
		Float vTotal = scan.nextFloat();

		p.setValor(vTotal);
		p.setEndereco(endereco);
		bancoPedido.inserir(p);
		System.out.println(idPedido);
	}

	private void excluirPedido(Scanner scan, PedidoDAO bancoPedido) {
		Pedido p = new Pedido();
		System.out.println("Digite o codigo do pedido que deseja excluir:");
		int codigo = scan.nextInt();
		bancoPedido.excluir(p, codigo);

		// printar sabor excluido
		ArrayList<Pedido> tabelaPedido = bancoPedido.listarPedidos();
		System.out.println(tabelaPedido.toString());
	}

	private void alterarPedido(Scanner scan, PedidoDAO bancoPedido) {
		Pedido p = new Pedido();
		System.out.println("Digite o codigo do pedido que deseja alterar:");
		int codigo = scan.nextInt();
		
		scan = new Scanner(System.in);
		System.out.println("Informe o novo valor: ");
		float valor = scan.nextFloat();
		
		scan = new Scanner(System.in);
		System.out.println("Endereço novo: ");
		String endereco = scan.nextLine();
		
		p.setValor(valor);
		p.setEndereco(endereco);

		bancoPedido.alterar(p, codigo);

		// printar pedido alterado
		ArrayList<Pedido> tabelaSabores = bancoPedido.listarPedidos();

		System.out.println(tabelaSabores.toString());
	}

	private void alterarSabor(Scanner scan, SaborDAO bancoSabor) {
		Sabor s = new Sabor();
		System.out.println("Digite o codigo do sabor que deseja alterar:");
		int codigo = scan.nextInt();
		scan = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = scan.nextLine();
		scan = new Scanner(System.in);
		System.out.println("Ingredientes utilizados: ");
		String ingredientes = scan.nextLine();
		s.setNome(nome);
		s.setIngredientes(ingredientes);

		bancoSabor.alterar(s, codigo);

		// printar sabor alterado
		ArrayList<Sabor> tabelaSabores = bancoSabor.listarSabores();

		System.out.println(tabelaSabores.toString());
	}

	private void excluirSabor(Scanner scan, SaborDAO bancoSabor) {
		Sabor s = new Sabor();
		System.out.println("Digite o codigo do pedido que deseja excluir:");
		int codigo = scan.nextInt();
		bancoSabor.excluir(s, codigo);

		// printar sabor excluido
		ArrayList<Sabor> tabelaSabores = bancoSabor.listarSabores();

		System.out.println(tabelaSabores.toString());
	}

	private void cadastrarSabor(int idSabor, Scanner scan, SaborDAO bancoSabor) {
		Sabor s = new Sabor();
		System.out.println("Cadastro de Sabor");
		s.setId(idSabor);
		System.out.println("Nome: ");
		String nome = scan.nextLine();
		System.out.println("Ingredientes utilizados: ");
		String ingredientes = scan.nextLine();
		s.setNome(nome);
		s.setIngredientes(ingredientes);

		System.out.println("id - " + idSabor);
		bancoSabor.inserir(s);

	}
}
