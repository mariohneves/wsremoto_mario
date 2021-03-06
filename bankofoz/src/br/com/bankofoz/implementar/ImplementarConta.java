package br.com.bankofoz.implementar;

import br.com.bankofoz.magic.Magic;
import br.com.bankofoz.modelo.Conta;
import br.com.bankofoz.modelo.Endereco;
import br.com.bankofoz.modelo.Cliente;
import br.com.bankofoz.modelo.Corrente;
import br.com.bankofoz.modelo.Poupanca;

public class ImplementarConta {

	public static void main(String[] args) {
		int opcao = Magic.i(("Digite <1> para conta corrente ou qualquer outro valor para Poupan�a"));
		
	
	
		Conta conta = new Conta(
				Magic.sho("N�mero"),
				Magic.by("Digito"),
				Magic.sho("Ag�ncia"),
				Magic.f("Saldo"),
				new Cliente(
						Magic.i("ID"),
						Magic.s("Nome"),
						Magic.s("Email"),
						Magic.b("Especial"),
						Magic.s("CPF"),	
						new Endereco(
								Magic.s("Logradouro"),
								Magic.s("N�mero"),
								Magic.s("Complemento"),
								Magic.s("Bairro"),
								Magic.s("Cidade"),
								Magic.s("UF")
								))
				);
	
		
		
		
		conta.depositar(2000);		
		conta.sacar(400);
			
		System.out.println(conta.toString());
	
		
		
		
	}
}
