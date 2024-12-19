package calcados.controller;

import java.util.ArrayList;

import calcados.model.Calcados;
import calcados.repository.CalcadoRepository;

public class CalcadosController implements CalcadoRepository {
	
	private ArrayList<Calcados> listaCalcados = new ArrayList<Calcados>();
	
	int codigo;

	@Override
	public void procurarPorCodigo(int codigo) {
		var calcados = buscarNaCollection(codigo);

		if (calcados != null)
			calcados.visualizar();
		else
			System.out.println("\nA item com o código " + codigo + " não foi encontrado!");
	}
		

	@Override
	public void listarTodas() {
		for (var calcados : listaCalcados) {
			calcados.visualizar();
		}	
	}

	@Override
	public void cadastrar(Calcados calcado) {
		listaCalcados.add(calcado);
		System.out.println("\nA Item do código " + calcado.getCodigo() + " foi criada!");
	}

	@Override
	public void atualizar(Calcados calcado) {
		var buscaConta = buscarNaCollection(calcado.getCodigo());
		
		if(buscaConta != null) {
			listaCalcados.set(listaCalcados.indexOf(buscaConta), calcado);
			System.out.println("\nO item do código " + calcado.getCodigo() + " foi atualizado com sucesso!");
		}else
			System.out.println("\nO item do código " + calcado.getCodigo() + " não foi encontrado!");
		
	}

	@Override
	public void deletar(int codigo) {
		var calcados = buscarNaCollection(codigo);
		
		if(calcados != null) {
			if(listaCalcados.remove(calcados)== true)
				System.out.println("\n O item número: " + codigo + "foi deletado com sucesso!!");
		}else
			System.out.println("\nO item número: " + codigo + "não foi encontrado");
	}
	
	public int gerarCodigo() {
		return ++ codigo;
	}
	
	public Calcados buscarNaCollection(int codigo) {
		for (var calcado : listaCalcados) {
			if(calcado.getCodigo() == codigo) {
				return calcado;
			}
		}
		return null;
	}

}
