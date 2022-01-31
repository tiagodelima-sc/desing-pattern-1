package state_pattern;

public class IntegracaoStatus {
	
	//vai ter um atributo privado, do tipo da interface. Um construtor vai inicializar como null e vou ter dois metodos, set e o get.
	//essa classe que faz a troca dos estados ao longa da aplicacao.
	
	private IntegracaoEstado integracao;
	
	public IntegracaoStatus() {
	integracao = null;
	}
	
	
	public void setIntegracao(IntegracaoEstado integracao) {
		this.integracao = integracao;
	}
	

	public IntegracaoEstado getIntegracao() {
		return integracao;
	}

	
	

}
