package br.com.elevador.testes;

import br.com.elevador.modelo.elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		elevador objeto = new elevador();
		
		
	objeto.definirValores("Torre1",(short) 10, (short) -3, (byte) 20);
	
	
	
	
	System.out.println(objeto.exibirDados());
	objeto.entrar((byte) 15);
	objeto.subir((byte) 20);
	objeto.descer((byte) 10);
	System.out.println(objeto.exibirDados());	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
