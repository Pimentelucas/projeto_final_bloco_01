package calcados.model;

public class Tenis extends Calcados {
	
	private String modalidade;

	public Tenis(int codigo, int tamanho, int tipo, float preco, String modalidade) {
		super(codigo, tamanho, tipo, preco);
		this.modalidade = modalidade;
		
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	

}
