package implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<String>();
		
		lista.add("DBA");
		lista.add("Analista");
		lista.add("PMO");
		lista.add("DEV");
		lista.add("DBA");
		
		System.out.println(lista);

		/*
		 * For each -> quando você não quer ou não pode utilizar um indice
		 * 
		 * 
		 * Tipo generics exige uma classe (Integer, Short, Double), não aceita dados primitivos
		 */
		
		for (String cargo : lista) {
		 	System.out.println("Cargo: " + cargo);
			
		}
		
	}
	
	

}
