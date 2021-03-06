package br.com.lojaabc.implementacao;

import br.com.lojaabc.beans.Fabricante;
import br.com.lojaabc.beans.Venda;
import br.com.lojaabc.beans.Produto;
import br.com.lojaabc.beans.Cliente;
import br.com.lojabac.util.Magic;

public class ImplementaVendas {

	public static void main(String[] args) {
		
		Venda venda = new Venda(
				 Magic.i("Nota Fiscal"),   
				 new Produto(
						 Magic.i("C�digo"),
						 Magic.s("Descri��o"),
						 Magic.f("Valor Compra"),
						 Magic.f("Valor Venda"),
						 Magic.i("Qtde"),
						 new Fabricante(
								 Magic.s("CNPJ"),
								 Magic.s("Raz�o Social"),
								 Magic.s("Fone")
								 )
						 ),
			     new Cliente(
			    		 Magic.i("Codigo do Cliente"),
			    		 Magic.s("Nome do cliente"),
			    		 Magic.s("Email"),
			    		 Magic.b("� Especial?")
			    		 ),
			     Magic.i("Qtde"),
			     Magic.f("Total")
						
				
				
				);
		
		
		System.out.println(venda.toString());
		
		
		
	}

}
