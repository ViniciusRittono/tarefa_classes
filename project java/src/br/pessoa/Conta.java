package br.pessoa;

public class Conta {

	double saldo;
	int numero;
	String titular;
	/**
	 * 
	 * Caulcula o valor de desposito com o extrato bancario ja existente
	 * 
	 * 
	 * @param valor
	 */
	void Deposito(Double valor) {
		saldo += valor;
	}
	
}
