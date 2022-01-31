package observer;

public class DadosMsg extends ObserverAviso {
	
	
	public DadosMsg (AtualizarMsg mensagem) {
		this.msg = mensagem;
		this.msg.addMsg(this);
	}
	
	@Override
	public void atualizarMsg() {
		System.out.println("De: CEO Company:");
		System.out.println("ATENCAO: Comparecer urgentemente!");
	}
	


}
