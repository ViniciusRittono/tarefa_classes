/**
 * @author vini.dev
 */

package br.pessoa;

public class Main {

	
	
	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa();
		p1.idade = 19;
		p1.nome = "fulano";
		p1.cpf = "112233445566";
		
		Conta c1 = new Conta();
		c1.numero = 1;
		c1.saldo = 1000;
		c1.titular = "fulano2";

	}

}
