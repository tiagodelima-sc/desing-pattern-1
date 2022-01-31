package hook_method;

public class OrdemComida extends OrdemDeCompra {
	
	//Vai pegar o preco da comida

	public OrdemComida(double precoComidaDia, double precoLimpezaDia, String nomeProdut) {
		super(precoLimpezaDia, precoComidaDia, nomeProdut);
	}
	
	@Override
	protected double calcularOrdem() {
		return this.getPrecoComidaDia();
	}
	
}
