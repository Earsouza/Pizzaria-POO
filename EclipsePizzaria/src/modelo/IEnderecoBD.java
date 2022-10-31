package modelo;

import java.util.ArrayList;

public interface IEnderecoBD {
	
	public boolean incluir(Endereco e);

	public ArrayList<Endereco> lista();

	public boolean atualizar(Endereco e, int id);

	public boolean remover(Endereco e, int id);

}
