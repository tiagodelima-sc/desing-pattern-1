package hook_method;

public class OrdemLimpeza extends OrdemDeCompra {
	
	//Orcamento E de 150 reais por dia sobre limpeza na empresa
	
	public OrdemLimpeza(double precoComidaDia, double precoLimpezaDia, String nomeProdut) {
		super(precoLimpezaDia, precoComidaDia, nomeProdut);
	}
	
	@Override
	protected double calcularOrdem() {
		return this.getPrecoLimpezaDia() + 150.00;
	}
	
}
