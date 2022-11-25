package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.PedidoDAO;
import controle.SaborDAO;
import modelo.Cliente;
import modelo.Pedido;
import modelo.Sabor;

public class Main {

	public static void main(String[] args) {

		int idSabor = 0;
		int idPedido = 0;
		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		SaborDAO bancoSabor = SaborDAO.getInstancia();
		PedidoDAO bancoPedido = PedidoDAO.getInstancia();

		ArrayList<Cliente> tabelaClientes = new ArrayList<>();
		Cliente c1 = new Cliente("Carlos", "0999221", "123123");
		Cliente c2 = new Cliente("Luisa", "65146584", "5765756");
		Cliente c3 = new Cliente("Vitoria", "542468", "3435365");
		tabelaClientes.add(c1);
		tabelaClientes.add(c2);
		tabelaClientes.add(c3);

		// PedidoDAO bancoPedido = PedidoDAO.getInstancia();

		while (opcaoSelecionada != 0) {

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
				Sabor s = new Sabor();
				System.out.println("Cadastro de Sabor");
				idSabor++;
				s.setId(idSabor);
				System.out.println("Nome: ");
				String nome = scan.nextLine();
				System.out.println("Ingredientes utilizados: ");
				String ingredientes = scan.nextLine();
				s.setNome(nome);
				s.setIngredientes(ingredientes);

				System.out.println("id - " + idSabor);
				bancoSabor.inserir(s);
				break;
			}
			case 2: {
				Sabor s = new Sabor();
				System.out.println("Digite o codigo do pedido que deseja excluir:");
				int codigo = scan.nextInt();
				bancoSabor.excluir(s, codigo);

				// printar sabor excluido
				ArrayList<Sabor> tabelaSabores = bancoSabor.listarSabores();

				System.out.println(tabelaSabores.toString());
				break;
			}
			case 3: {
				Sabor s = new Sabor();
				System.out.println("Digite o codigo do pedido que deseja excluir:");
				int codigo = scan.nextInt();

				System.out.println("Nome: ");
				String nome = scan.nextLine();
				System.out.println("Ingredientes utilizados: ");
				String ingredientes = scan.nextLine();
				s.setNome(nome);
				s.setIngredientes(ingredientes);

				bancoSabor.alterar(null, codigo);

				// printar sabor alterado
				ArrayList<Sabor> tabelaSabores = bancoSabor.listarSabores();

				System.out.println(tabelaSabores.toString());
				break;
			}
			case 4: {
				ArrayList<Sabor> tabelaSabores = bancoSabor.listarSabores();
				System.out.println(tabelaSabores.toString());
				break;
			}
			case 5: {
				Pedido p = new Pedido();
				System.out.println("Cadastro de Pedido");
				idPedido++;
				p.setId(idPedido);
				System.out.println("1 - " + c1.getNome() + " - " + "2 - " +  
				c2.getNome() + " - " + "3 - " + c3.getNome());
				System.out.println("Selecione um cliente: ");
				String clienteSelecionado = scan.nextLine();
				System.out.println("Informe o endereço: ");
				String endereco = scan.nextLine();
				System.out.println("Informe o valor total: ");
				Float vTotal = scan.nextFloat();
				p.setValor(vTotal);
				p.setEndereco(endereco);
				bancoPedido.inserir(p);
				System.out.println(clienteSelecionado);
				break;
			}
			case 6: {
				break;
			}
			case 7: {
				break;
			}
			case 8: {
				ArrayList<Pedido> tabelaPedidos = bancoPedido.listarPedidos();
				System.out.println(tabelaPedidos.toString());
				break;
			}

			}

		}
		scan.close();
	}
}
