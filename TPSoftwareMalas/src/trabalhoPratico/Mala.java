package trabalhoPratico;

public class Mala {

	// Declaração de variáveis
	private String nome;
	private int numItens = 0;
	private ItemCadastrado itemRecebido;
	private ItemCadastrado[] itensMala = new ItemCadastrado[50];

	// Método construtor de Mala
	public Mala(String nomeMala) {
		nome = nomeMala;
	}

	// Método para adicionar itens à mala
	public void adicionaItem(ItemCadastrado novoItem) {
		itemRecebido = novoItem;
		itensMala[numItens] = itemRecebido;
		numItens++;
	}

	// Adição do método toString
	public String toString() {
		return "Nome da mala: " + this.getNome() + "\nNúmero de itens presentes na mala: " + this.getNumItens();
	}

	// Método para retornar os itens que estão dentro da mala
	public String retornaArray() {
		String listaItens = "\nLista de itens adicionados: \n";
		for (int i = 0; i < numItens; i++) {
			listaItens = listaItens + "\n" + (i + 1) + ". " + itensMala[i].getNome();
		}
		return listaItens;
	}

	// Adição dos gets e sets
	public ItemCadastrado[] getItensMala() {
		return itensMala;
	}

	public void setItensMala(ItemCadastrado[] itensMala) {
		this.itensMala = itensMala;
	}

	public int getNumItens() {
		return numItens;
	}

	public void setNumItens(int numItens) {
		this.numItens = numItens;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ItemCadastrado getItemRecebido() {
		return itemRecebido;
	}

	public void setItemRecebido(ItemCadastrado itemRecebido) {
		this.itemRecebido = itemRecebido;
	}

}
