package modelo;

import java.util.ArrayList;

public interface IFuncionarioBD {

	public boolean incluir(Funcionario f);

	public ArrayList<Funcionario> lista();

	public boolean atualizar(Funcionario f, int id);

	public boolean remover(Funcionario f, int id);

}
