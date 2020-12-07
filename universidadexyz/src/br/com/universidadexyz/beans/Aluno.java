package br.com.universidadexyz.beans;

/*
 * Design Patterns -> Compilação de padrões para projetos (boas práticas)
 * Um dos padrões : DTO (Data Transfer Object)
 * 1 º Todos os atributos devem ser privados.
 * 2º Cada atributo tem que possuir um método de input (set) e um método de output(get)
 * 3º Deve possuir no minimo 2 construtores (um vazio e outro com todos os atributos)
 * 
 * 
 * Construtor é a forma de instanciar os objetos Aluno(), sempre tem o nome da classe.
 * 
 * Package -> Representa organização para as camadas
 */
 
public class Aluno {

	private int rm;
	private String nome;
	private String cpf;
	
	
	
	public Aluno () {
		
	}
	
	public Aluno (int rm, String nome, String cpf) {
		this.rm=rm;
		this.nome=nome;
		this.cpf=cpf;
	}
	
	
	public String getAll() {
		return 
				"RM: " + rm + "\n" +
				"Nome: " + nome + "\n" +
				"CPF: " + cpf;
		
	}
	
	public void setAll(int rm, String nome, String cpf) {
		this.rm = rm;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	
	
	
}
