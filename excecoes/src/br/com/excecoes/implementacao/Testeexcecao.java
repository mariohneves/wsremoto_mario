package br.com.excecoes.implementacao;

import tratarexcecao.Minhaexcecao;

public class Testeexcecao {

	public static void main(String[] args) {

		try {
			int numero = Integer.parseInt("7");
			System.out.println("N�mero : " + numero);
			
			String palavra = "";
			System.out.println("Qtde Caracteres: " + palavra.length());
			
			int[] valores = new int[2];
			valores[0] = 541;
			valores[1]= 82;
			valores[2]= 10;
		
	
		
		}catch(Exception e) {
			System.out.println(Minhaexcecao.tratar(e));
			
				
			}finally {
				System.out.println("Encerrar conex�es abertas com bancos de dados");
				try {
					//encerrar conex�es, liberar arquivos
				}catch(Exception e) {
					System.out.println(Minhaexcecao.tratar(e));
				}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
