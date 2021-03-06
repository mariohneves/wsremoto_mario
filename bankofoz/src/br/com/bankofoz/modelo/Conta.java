package br.com.bankofoz.modelo;

/*
 * Polimorfismo: � o quarto pilar da OO. Que permite deixarmos m�todos com o mesmo nome, realizando
 * opera��es distintas.
 * Dois tipos:
 * - Overload (sobrecarga) => os m�todos est�o na mesma classe
 * - Override (sobrescrita) => os m�todos se encontram em classes diferentes
 * 
 * 
 * classe abstract --> n�o representa um objeto e n�o pode ser instanciada
 */



public class Conta {

	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;

	
	
	public Conta() {
		super();
	}
	
	public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	
	
	public boolean sacar(float valor) {
		if (valor <= saldo && valor>0) {
			saldo = (saldo - valor);
			return true;
		}else 
			return false;
		
	}
	
	
	public boolean depositar(float valor) {
		if (valor>0) {
		saldo = (saldo + valor);
		return true;
		}					
		return false;
	}
		
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public String toString() {
		return "Conta [numero=" + numero + ", digito=" + digito + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", cliente=" + cliente + "]";
	}

	public short getNumero() {
		return numero;
	}

	public void setNumero(short numero) {
		this.numero = numero;
	}

	public byte getDigito() {
		return digito;
	}

	public void setDigito(byte digito) {
		this.digito = digito;
	}

	public short getAgencia() {
		return agencia;
	}

	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Conta(String string, boolean b, short s, float f, Cliente cliente2, Endereco endereco) {
		super();
	}

}
