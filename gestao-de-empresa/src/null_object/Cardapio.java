package null_object;

public class Cardapio {
	
	public static final String[] comidas = {"Arroz", "Feijao", "Carne", "Salada", "Sobremesa"};
	
	public static CardapioAbstract getComida(String nomeComida) {
		
		for(String comida : comidas) {
			if(comida.equalsIgnoreCase(nomeComida)) return new VerificaComida(nomeComida);
		}
		
		return new NullCardapio();
	}
	

}
