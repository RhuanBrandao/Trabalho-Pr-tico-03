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

		// Constru��o do objeto itemSug (sugest�o de itens)
		itemSug = new ItemSugerido();
		// Op��o por "SIM" ou "N�O" para a adi��o dos itens sugeridos ofertados
		itemSug.setEscolhaItem("SIM");
		itemSug.adicionaItemSug(mala1, localViagem);

		// Adi��o dos itens � mala
		item = new ItemCadastrado("Carteira");
		mala1.adicionaItem(item);
		item = new ItemCadastrado("Livro");
		mala1.adicionaItem(item);
		item = new ItemCadastrado("Shorts");
		mala1.adicionaItem(item);
		item = new ItemCadastrado("Blusas");
		mala1.adicionaItem(item);
		item = new ItemCadastrado("Sand�lia");
		mala1.adicionaItem(item);
		item = new ItemCadastrado("Boia de banho");
		mala1.adicionaItem(item);

		// Sa�da contendo a lista de informa��es em rela��o � mala criada
		System.out.println("----------Informa��es sobre a mala adicionada----------\n");
		System.out.println(mala1.toString());
		System.out.println(localViagem.toString());
		System.out.println(mala1.retornaArray());

	}

}
