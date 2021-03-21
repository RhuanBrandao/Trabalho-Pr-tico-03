package trabalhoPratico;

public class ItemSugerido {

	// Declaração de variáveis
	private Local localEscolhido;
	private ItemCadastrado itemEnviado;
	private Mala malaAtual;
	private String escolhaItem;

	// Método construtor de ItemSugerido
	public ItemSugerido() {

	}

	public ItemSugerido(String resposta) {
		escolhaItem = resposta;
	}

	// Método para adicionar itens sugeridos à mala
	public void adicionaItemSug(Mala mala1, Local local1) {
		malaAtual = mala1;
		localEscolhido = local1;

		// Condicional para decidir o tipo de local da viagem
		switch (localEscolhido.getTipoLocal()) {
		case "Chalé nas montanhas":
			if (escolhaItem == "SIM") {
				itemEnviado = new ItemCadastrado("Repelente");
				malaAtual.adicionaItem(itemEnviado);
				itemEnviado = new ItemCadastrado("Casaco");
				malaAtual.adicionaItem(itemEnviado);
				itemEnviado = new ItemCadastrado("Cachecol");
				malaAtual.adicionaItem(itemEnviado);
			}
			break;
		case "Praia":
			if (escolhaItem == "SIM") {
				itemEnviado = new ItemCadastrado("Oculos de sol");
				malaAtual.adicionaItem(itemEnviado);
				itemEnviado = new ItemCadastrado("Protetor solar");
				malaAtual.adicionaItem(itemEnviado);
				itemEnviado = new ItemCadastrado("Toalha de banho");
				malaAtual.adicionaItem(itemEnviado);
				break;
			}
		case "Fazenda":
			if (escolhaItem == "SIM") {
				itemEnviado = new ItemCadastrado("Repelente");
				malaAtual.adicionaItem(itemEnviado);
				itemEnviado = new ItemCadastrado("Bota");
				malaAtual.adicionaItem(itemEnviado);
				itemEnviado = new ItemCadastrado("Garrafinha de água");
				malaAtual.adicionaItem(itemEnviado);
			}
			break;
		}
	}

	// Adição dos gets e sets
	public String getEscolhaItem() {
		return escolhaItem;
	}

	public void setEscolhaItem(String escolhaItem) {
		this.escolhaItem = escolhaItem;
	}

	public Local getLocalEscolhido() {
		return localEscolhido;
	}

	public void setLocalEscolhido(Local localEscolhido) {
		this.localEscolhido = localEscolhido;
	}

	public ItemCadastrado getItemEnviado() {
		return itemEnviado;
	}

	public void setItemEnviado(ItemCadastrado itemEnviado) {
		this.itemEnviado = itemEnviado;
	}

	public Mala getMalaAtual() {
		return malaAtual;
	}

	public void setMalaAtual(Mala malaAtual) {
		this.malaAtual = malaAtual;
	}

}
