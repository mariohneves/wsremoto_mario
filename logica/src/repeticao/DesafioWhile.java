package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		// 
		/*
		 * Sua aplica��o ira pedir: Ano, m�s e dia, em variav�is inteiras separadamente.
		 * 
		 * Ano = deve ser maior que 1900
		 * Dia: entre 1 e 31
		 * m�s : entre 1 e 12
		 * 
		 * 
		 * No final, exibe a data dia/m�s/ano
		 */

		short ano = Short.parseShort(JOptionPane.showInputDialog("Ano"));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("M�s"));
		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Dia"));
		
		while (ano<=1900) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Ano precisa ser maior que 1900"));
		}
		
		
		while (mes>12 && mes==0 ==false) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("M�s deve estar entre 1 e 12"));
		}
		if (mes==2) {
			while (dia<1 || dia>29 ) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Fevereiro s� tem 29 dias"));
			}
		}else if (mes==4 ||  mes == 6 || mes == 9 || mes == 11) {
			while (dia<1 || dia>30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("DIA"));			
			}
		}else {
				while (dia<1 || dia<31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia"));	
				}
				}
				
			System.out.println("Data: " + dia + "/" + mes + "/" + ano);
		
		
	}
	}
	

