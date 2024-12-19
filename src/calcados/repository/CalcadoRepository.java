package calcados.repository;

import calcados.model.Calcados;

public interface CalcadoRepository {
	public void procurarPorCodigo(int codigo);
	public void listarTodas();
	public void cadastrar(Calcados calcado);
	public void atualizar(Calcados calcado);
	public void deletar(int codigo);
}
