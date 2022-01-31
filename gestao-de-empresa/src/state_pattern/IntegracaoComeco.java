package state_pattern;

public class IntegracaoComeco implements IntegracaoEstado {
	
	@Override
	public void verificarStatus(IntegracaoStatus status) {
		
		System.out.println("Video da apresentacao da empresa esta iniciando.");
		status.setIntegracao(this);
	}

}
