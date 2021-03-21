package trabalhoPratico;

public class Local {

	// Declaração de variáveis
	private String tipoLocal;

	// Método construtor de Local
	public Local(String tipoEscolhido) {
		tipoLocal = tipoEscolhido;
	}

	// Adição do método toString
	public String toString() {
		return "Local da viagem: " + this.getTipoLocal();
	}

	// Adição dos gets e sets
	public String getTipoLocal() {
		return tipoLocal;
	}

	public void setTipoLocal(String tipoLocal) {
		this.tipoLocal = tipoLocal;
	}

}
