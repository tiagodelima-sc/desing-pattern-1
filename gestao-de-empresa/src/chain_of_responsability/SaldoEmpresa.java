package chain_of_responsability;

public class SaldoEmpresa implements Cheque {
	
	//Saldo da empresa E a ultima etapa, ele vai calcular sua requisicao e vai jogar para o proximo, mas ele E o ultimo
	//Entao, nao joga.

		@Override
		public void calcularCompra(CompraMaquinas compramaquinas) {
			
			if(compramaquinas.getValorMaquina() <= 0) {
				System.out.println("Pagamento Nao foi Aprovado: Infelizmente o Saldo da Empresa esta Negativo");
				
			} else {
				System.out.println("Aprovado: O pagamento foi aprovado e Descontado do Saldo da Empresa");
			
			}
			
		}	
			
		@Override
		public void setNext(Cheque next) {}

}
