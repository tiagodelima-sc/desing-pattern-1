package hook_method;

public abstract class OrdemDeCompra {
	
	private double precoLimpezaDia;
	private double precoComidaDia;
	private String nomeProdut;
	
	public OrdemDeCompra(double precoLimpezaDia, double precoComidaDia, String nomeProdut) {
		super();
		this.precoLimpezaDia = precoLimpezaDia;
		this.precoComidaDia = precoComidaDia;
		this.nomeProdut = nomeProdut;
	}
	
	public double calcularMes(int dias) {
		return calcularOrdem() * dias;
	}
	
	protected abstract double calcularOrdem();
	

	public double getPrecoLimpezaDia() {
		return precoLimpezaDia;
	}

	public void setPrecoLimpezaDia(double precoLimpezaDia) {
		this.precoLimpezaDia = precoLimpezaDia;
	}

	public double getPrecoComidaDia() {
		return precoComidaDia;
	}

	public void setPrecoComidaDia(double precoComidaDia) {
		this.precoComidaDia = precoComidaDia;
	}

	public String getNomeProdut() {
		return nomeProdut;
	}

	public void setNomeProdut(String nomeProdut) {
		this.nomeProdut = nomeProdut;
	}
	
	
	
	
	

}
