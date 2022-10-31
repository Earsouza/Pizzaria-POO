package controle;

import java.util.ArrayList;

import modelo.Funcionario;
import modelo.IFuncionarioBD;

public class FuncionarioBD implements IFuncionarioBD {
	
	private ArrayList<Funcionario> bdFuncionarios;
	
	public FuncionarioBD() {
		this.bdFuncionarios = new ArrayList<>();
	}

	@Override
	public boolean incluir(Funcionario f) {
		this.bdFuncionarios.add(f);
		return false;
	}

	@Override
	public ArrayList<Funcionario> lista() {
		// TODO Auto-generated method stub
		return this.bdFuncionarios;
	}

	@Override
	public boolean atualizar(Funcionario f, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(Funcionario f, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
