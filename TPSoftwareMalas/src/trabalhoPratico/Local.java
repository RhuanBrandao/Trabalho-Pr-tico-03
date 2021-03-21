package trabalhoPratico;

public class Local {

	// Declara��o de vari�veis
	private String tipoLocal;

	// M�todo construtor de Local
	public Local(String tipoEscolhido) {
		tipoLocal = tipoEscolhido;
	}

	// Adi��o do m�todo toString
	public String toString() {
		return "Local da viagem: " + this.getTipoLocal();
	}

	// Adi��o dos gets e sets
	public String getTipoLocal() {
		return tipoLocal;
	}

	public void setTipoLocal(String tipoLocal) {
		this.tipoLocal = tipoLocal;
	}

}
