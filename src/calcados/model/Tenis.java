package calcados.model;

public class Tenis extends Calcados {
	
	private int modalidade;

	public Tenis(int codigo, int tamanho, int tipo, float preco, int modalidade) {
		super(codigo, tamanho, tipo, preco);
		this.modalidade = modalidade;
		
	}

	public int getModalidade() {
		return modalidade;
	}

	public void setModalidade(int modalidade) {
		this.modalidade = modalidade;
	}
	
	

}
