package implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.beans.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();
		
		do {
			lista.add(new Cargo(
					JOptionPane.showInputDialog("Nome"),
					JOptionPane.showInputDialog("N�vel"),
					Float.parseFloat(JOptionPane.showInputDialog("Sal�rio"))
					
					));
		}while(JOptionPane.showConfirmDialog(null,  "Continuar?" , "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println("Ordenada : " + lista);
		
		
		
		
		float total = 0;
		float totalJr=0;
		for (Cargo cargo : lista) {
			total+=cargo.getSalario();
			if (cargo.getNivel().equals("JR")) {
				totalJr+=cargo.getSalario();
			}
		}
		
		
		System.out.println("Total : " + total);
		System.out.println("M�dia: " + (total/lista.size()));
		
		
		/*
		 * Total do sal�rio de quem tem o n�vel JR
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
