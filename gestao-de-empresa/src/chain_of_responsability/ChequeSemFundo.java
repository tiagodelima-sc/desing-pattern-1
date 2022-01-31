package chain_of_responsability;

public class ChequeSemFundo implements Cheque {
	
	//CARTAO == CHEQUE
	//COMPRA == CompraMaquinas

	private Cheque next;
	
	@Override
	public void calcularCompra(CompraMaquinas compramaquinas) {
		
		if(compramaquinas.getValorMaquina() < 0 || compramaquinas.getValorMaquina() == 0 || compramaquinas.getValorMaquina() > 100000) {
			System.out.println("Pagamento Nao foi Aprovado: Cheque nao tem saldo suficiente na conta");
			next.calcularCompra(compramaquinas);
		} else {
			System.out.println("Aprovado: Tem saldo Suficiente na Conta");
			next.calcularCompra(compramaquinas);
			
		}
		
	}
		
		
	@Override
	public void setNext(Cheque next) {
		this.next = next;
	}
	
	
}
