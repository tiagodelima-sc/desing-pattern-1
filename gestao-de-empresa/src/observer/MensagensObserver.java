package observer;

public class MensagensObserver extends ObserverAviso {
	
	//no seu construtor vai receber um objeto de sujeitoatualizar para que ela possa adicionar esse esse objeto na lista de objetos
		//a serem atualizar e poder receber o metodo de receber notificacao
		public MensagensObserver(AtualizarMsg mensagem) {
			this.msg = mensagem;
			this.msg.addMsg(this);
		}
		
		
		@Override
		public void atualizarMsg() {
			System.out.println("De: CEO Company:");
			System.out.println("Por favor, Comparecer no saguao da Fabrica em 10 minutos.");
		}
		


}
