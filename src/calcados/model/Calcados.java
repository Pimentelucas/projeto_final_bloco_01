package calcados.model;

public abstract class Calcados {
	private int codigo;
	private int tamanho;
	private int tipo;
	private float preco;
	
	public Calcados(int codigo, int tamanho, int tipo, float preco) {
		this.codigo = codigo;
		this.tamanho = tamanho;
		this.tipo = tipo;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
