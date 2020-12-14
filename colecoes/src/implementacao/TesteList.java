package implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {

		
		List <String> lista = new ArrayList<String>();
		
		lista.add("DBA");
		lista.add("Analista");
		lista.add("Estagiário");
		lista.add("Especialista");
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		System.out.println("Segundo elemento: " + lista.get(1));
		lista.remove(1);
		System.out.println("Remover : " + lista);

		for (int cont=0;cont<lista.size();cont++) {
			System.out.println("Cargo " + cont + " é " + lista.get(cont));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
