package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		// 
		/*
		 * Solicita o nome e a idade de uma pessoa.
		 * sua aplica��o deve informar se:
		 * Ela � obrigada a votar
		 * ela est� proibida de voltar
		 * o voto � facultativo
		 */


		String eleitor = JOptionPane.showInputDialog("Eleitor").toUpperCase();
		short idade= Short.parseShort(JOptionPane.showInputDialog("Idade"));
		
		if (idade>=18 && idade<70) {
			System.out.println(eleitor + " Voc� � obrigado a votar");
		}else if (idade<16) {
			System.out.println(eleitor + " Voc� ainda n�o pode votar");
	
		}else if (idade>70 || (idade>=16 && idade<18)) {
			System.out.println(eleitor + " Seu voto � facultativo");
		
		
		}
		
		
		
		
		
		
		
	}

}
