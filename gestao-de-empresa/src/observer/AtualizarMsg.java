package observer;

import java.util.ArrayList;

public class AtualizarMsg {
	
public ArrayList<ObserverAviso> listaMensagens = new ArrayList<ObserverAviso>();
	
	//esse metodo quando for chamado vai disparar uma notificacao para que esses observadores possam estar atualizando seu status
	public void setNotification() {
		notificarMensagem();
	}
	
	//esse metodo vai adicionar observadores na nossa lista de observadores
	//esse metodo tem como parametro, um objeto de obeservador
	//e adiicona esse observador a essa arraylist
	public void addMsg(ObserverAviso observadores) {
		this.listaMensagens.add(observadores);
	}
	
	//ese metodo vai de fato percorrer a lista de observador cadastardos e pedir para que eles possam atualizar os dados
	//ou seja, realizar a atualizacao do seu estado interno.
	public void notificarMensagem() {
		
		for(ObserverAviso observadores : listaMensagens) {
			observadores.atualizarMsg();
		}
	}

}
