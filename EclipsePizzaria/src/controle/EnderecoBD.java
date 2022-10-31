package controle;

import java.util.ArrayList;

import modelo.Endereco;
import modelo.IEnderecoBD;

public class EnderecoBD implements IEnderecoBD {
	
	private ArrayList<Endereco> bdEndereco;

	public EnderecoBD() {
		this.bdEndereco = new ArrayList<>();
	}

	@Override
	public boolean incluir(Endereco e) {
		this.bdEndereco.add(e);
		return false;
	}

	@Override
	public ArrayList<Endereco> lista() {
		// TODO Auto-generated method stub
		return this.bdEndereco;
	}

	@Override
	public boolean atualizar(Endereco e, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Endereco e, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
