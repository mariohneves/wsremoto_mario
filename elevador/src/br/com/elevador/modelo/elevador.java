package br.com.elevador.modelo;

import javax.swing.JOptionPane;

public class elevador {

	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private byte capacidadePessoas;
	private byte qtdeAtual;
	private short andarAtual;
	
	
	public void descer(short andar) {
		if (andar >= andarMinimo) {
			andarAtual=andar;
		}
		
		}
	
	public void subir(short andar) {
		if (andar <= andarMaximo) {
			andarAtual=andar;
		}
	}
	
	
	
	public String exibirDados() {
		return
		" Elevador ....: " + nome + "\n" +
	    " Andar .......: " + andarAtual + "\n" +
		" Qtde Pessoas : " + qtdeAtual;
		
	}
	
	public void definirValores (String pNome, short pAndarMax, short pAndarMin, byte pCapacidade) {
		nome = pNome;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = pCapacidade;
	}
	
	public void subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++; 
		}
	}
	 
	public void descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
				}
	}
	
	public void pNome(String param) {
		nome = param.toUpperCase();
		}
	public void pAndarMax(short param) {
		if (param>0) {
		andarMaximo = param;
		}
	}
	public void pAndarMin(short param) {
		andarMinimo = param;
	}
	
	
	public void entrar(byte param) {
		if ((qtdeAtual+param) < capacidadePessoas) {
			qtdeAtual+=param;
		}
	}
	
	public void sair(byte param) {
		if ((qtdeAtual - param) > 0) {
			qtdeAtual-=param;		
			
		}
	}
	
	
	
	
	
	
	
	
	
		
	
	}


