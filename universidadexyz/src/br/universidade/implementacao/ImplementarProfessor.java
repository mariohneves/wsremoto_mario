package br.universidade.implementacao;

import br.com.universidadexyz.beans.Endereco;
import br.com.universidadexyz.beans.Professor;

public class ImplementarProfessor {

	public static void main(String[] args) {

		
		Professor p = new Professor();
		
		p.setApelido("Mario");
		p.setId(1020);
		p.setValorHora(30);
		p.setFormacao("Ms");
		
		Endereco e = new Endereco();
	
		p.setEndereço(e);
		e.setLogradouro("Rua Lisboa");
		e.setNumero("104");
		e.setComplemento("Ap 12 A");
		e.setBairro("Cerqueira Cesar");
		e.setCidade("São Paulo");
		e.setUf("SP");
		e.setCep("05413-000");
		
		System.out.println(p.getApelido());
		System.out.println(p.getEndereço().getCidade());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
