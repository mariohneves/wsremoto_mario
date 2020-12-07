package repeticao;

import javax.swing.JOptionPane;

public class ExemploDuo {

	public static void main(String[] args) {
		
		
		String cargo = "";
		float salario = 0;
		do {
			cargo = JOptionPane.showInputDialog("Cargo");
			salario = Float.parseFloat(JOptionPane.showInputDialog("Salário"));
			JOptionPane.showMessageDialog(null,  "Valor Hora: " + (salario/160));
		} while(JOptionPane.showConfirmDialog(
				null, 
				"Deseja Continuar?",
				"Pergunta",
				JOptionPane.YES_NO_OPTION)==0);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
