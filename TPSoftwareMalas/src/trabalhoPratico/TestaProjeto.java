package trabalhoPratico;

public class TestaProjeto {

	static Local localViagem;
	static Mala mala1;
	static ItemCadastrado item;
	static ItemSugerido itemSug;

	public static void main(String[] args) {

		// Escolha do local da viagem
		localViagem = new Local("Praia");
		// Escolha do nome da mala
		mala1 = new Mala("Mala Pequena p/ Praia");

		// Construção do objeto itemSug (sugestão de itens)
		itemSug = new ItemSugerido();
		// Opção por "SIM" ou "NÃO" para a adição dos itens sugeridos ofertados
		itemSug.setEscolhaItem("SIM");
		itemSug.adicionaItemSug(mala1, localViagem);

		// Adição dos itens à mala
		item = new ItemCadastrado("Carteira");
		mala1.adicionaItem(item);
		item = new ItemCadastrado("Livro");
		mala1.adicionaItem(item);
		item = new ItemCadastrado("Shorts");
		mala1.adicionaItem(item);
		item = new ItemCadastrado("Blusas");
		mala1.adicionaItem(item);
		item = new ItemCadastrado("Sandália");
		mala1.adicionaItem(item);
		item = new ItemCadastrado("Boia de banho");
		mala1.adicionaItem(item);

		// Saída contendo a lista de informações em relação à mala criada
		System.out.println("----------Informações sobre a mala adicionada----------\n");
		System.out.println(mala1.toString());
		System.out.println(localViagem.toString());
		System.out.println(mala1.retornaArray());

	}

}
