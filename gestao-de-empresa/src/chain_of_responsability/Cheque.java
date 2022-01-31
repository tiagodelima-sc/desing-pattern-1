package chain_of_responsability;

public interface Cheque {
	
	//Nessa classe ele vai calcular a compra da maquina
	public void calcularCompra(CompraMaquinas compramaquinas);
	//quando ele passa a funcao calcular, ele vai para o proximo metodo, ou seja, ele vai funcionar como se fosse uma fila
	//vai jogar sempre para o proximo
	void setNext(Cheque next);

}
