package decisao;

import javax.swing.JOptionPane;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cliente = JOptionPane.showInputDialog("Cliente");
		
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Quantidade de Di�rias"));
		if (diarias<15) {
			int conta = ((80 + 8) * (short) diarias) ;
			System.out.println(cliente + " Sua conta � R$" + conta);
		}else if (diarias==15) {
			int conta = ((80 + 6) * (short)  diarias) ;
			System.out.println(cliente + " Sua conta � R$" + conta);
			
		}else if (diarias>15) {
			double conta = ((80 + 5.5) * (double) diarias);
			System.out.println(cliente + " Sua conta � R$" + conta);
			
		}
		
		
		
		
		
		
		
		

				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
