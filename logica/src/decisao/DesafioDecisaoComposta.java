package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		// 
		/*
		 * 
		 */

		String produto = JOptionPane.showInputDialog("Produto").toUpperCase();
	
		short quantidade = Short.parseShort(JOptionPane.showInputDialog("Quantidade"));
		float pre�o = Float.parseFloat(JOptionPane.showInputDialog("Valor Unit�rio"));
		
		
		if (quantidade>=10 && quantidade<=20) {
			System.out.println(produto + " Com Estoque Normal");
		}else if (quantidade>20) {
			System.out.println(produto + " Com Estoque Alto");
		} else {
			System.out.println(produto + " Com Estoque Baixo");
		}
		if (pre�o>1000) {
			System.out.println("Valor Alto");
		}
		
		
			
			/* && = and
			 * || = or
			 * != not equal
			 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
