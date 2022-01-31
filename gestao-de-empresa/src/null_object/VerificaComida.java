package null_object;

public class VerificaComida extends CardapioAbstract {
	
	public VerificaComida(String nomeComida) {
		this.nomeComida = nomeComida;
	}
	
	@Override
	public String getNomeComida() {
		return "Disponivel: " + nomeComida;
	}

}
