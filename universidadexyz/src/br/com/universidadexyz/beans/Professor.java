package br.com.universidadexyz.beans;

public class Professor {
	
	
	private int id;
	private String apelido;
	private String formacao;
	private float valorHora;
	private Endereco endereço;
	
	
	
	
	public void setAll(int id, String apelido, String formacao, float valorHora, Endereco endereço) {
		this.id = id;
		this.apelido = apelido;
		this.formacao = formacao;
		this.valorHora = valorHora;
		this.endereço = endereço;
	}



	public String toString() {
		return "Professor [id=" + id + ", apelido=" + apelido + ", formacao=" + formacao + ", valorHora=" + valorHora
				+ ", endereço=" + endereço.toString() + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getApelido() {
		return apelido;
	}



	public void setApelido(String apelido) {
		this.apelido = apelido;
	}



	public String getFormacao() {
		return formacao;
	}



	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}



	public float getValorHora() {
		return valorHora;
	}



	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}



	public Endereco getEndereço() {
		return endereço;
	}



	public void setEndereço(Endereco endereço) {
		this.endereço = endereço;
	}



	public Professor(int id, String apelido, String formacao, float valorHora, Endereco endereço) {
		super();
		this.id = id;
		this.apelido = apelido;
		this.formacao = formacao;
		this.valorHora = valorHora;
		this.endereço = endereço;
	}



	public Professor() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
