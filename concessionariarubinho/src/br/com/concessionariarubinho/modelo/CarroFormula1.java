package br.com.concessionariarubinho.modelo;

public class CarroFormula1 {

	private String cor;
	private float valor;
	private String escuderia;
	private float velocidade;
	private boolean status;
	
	//Sintaxe método:
	// <modificador>  <tipo do retorno>  <nomeDoMetodo> (<tipoParametro> <nome do parametro>) {
	
	
	public float retornarVelocidade() {
		return velocidade;
	}
	
	public void acelerar(float param) {
		if (param>0 && status==true) {
			velocidade += param;
		}
	}
	
	public void desacelerar(float param) {
		if (param>0 && status==true) {
			velocidade -= param;
		}
	}
	
	public void brecar() {
		if (status==true) {
			velocidade=0;
		}
	}
	
	public String ligar() {
		if (status==true) {
		return "Carro estava ligado";
	 }
		status = true;
		return "Carro ligado agora";
	}
	
	public String desligar() {
		if (status==false) {
			return "Carro estava desligado";
		}
		status = false;
		velocidade=0;
		return "Carro desligado";
	}

	
	public void preencherEscuderia(String param) {
		escuderia = param.toUpperCase();
		}
	
	public void preencherValor(Float param) {
		if (param>0) {
			valor = param;	
		}
	}
	
	public void preencherCor(String param) {
		cor = param.toUpperCase();
		}
	public String retornarEscuderia() {
		return escuderia;
	}
	
	public String retornarCor () {
		return cor;
	}
	public float retornarValor () {
		return valor;
	}
	
	
	
	
	
}
