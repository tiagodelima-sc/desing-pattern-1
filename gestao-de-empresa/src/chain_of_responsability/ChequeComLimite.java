package chain_of_responsability;

public class ChequeComLimite implements Cheque {
	
		private Cheque next;
		
		@Override
		public void calcularCompra(CompraMaquinas compramaquinas) {
			
			if(compramaquinas.getValorMaquina() > 150000 || compramaquinas.getValorMaquina() == 0 || compramaquinas.getValorMaquina() < 0) {
				System.out.println("Pagamento Nao foi Aprovado: o Valor do Pagamento passou o Saldo disponivel da Conta");
				next.calcularCompra(compramaquinas);
			} else {
				System.out.println("Aprovado: Pagamento foi descontado do Saldo Disponivel da Empresa");
				next.calcularCompra(compramaquinas);
				
			}
			
		}
			
			
		@Override
		public void setNext(Cheque next) {
			this.next = next;
		}

}
