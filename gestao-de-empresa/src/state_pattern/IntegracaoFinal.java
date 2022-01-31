package state_pattern;

public class IntegracaoFinal implements IntegracaoEstado {
	
	@Override
	public void verificarStatus(IntegracaoStatus status) {
		
		System.out.println("Video da apresentacao da empresa esta pausado.");
		status.setIntegracao(this);
	}

}
