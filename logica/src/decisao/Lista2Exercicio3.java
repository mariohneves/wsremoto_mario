package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 int num1 = Integer.parseInt(JOptionPane.showInputDialog("num1"));
	 int num2 = Integer.parseInt(JOptionPane.showInputDialog("num2"));
	 char operador = JOptionPane.showInputDialog("Digite um operador").charAt(0);
	  if (operador =='+') {
		 System.out.println("Adi��o");
		 System.out.println("Total: " + (num1 + num2));
	 }else if (operador == '-') {
		 System.out.println("Subtra��o");
		 System.out.println("Total: " + (num1 - num2));
	 }else if (operador == '*') {
		 System.out.println("Multipli��o");
		 System.out.println("Total: " + (num1 * num2));
	 }else if (operador == '/') {
		 if (num2!=0) {
		 System.out.println("Divis�o");
		 System.out.println("Total: " + (num1 / num2));
	 }else {
		 System.out.println("Op��o Invalida");
	 }
	  
	 }
	 
			 
	  
	  /*
	   * Resposta do professor
	   * char operador = JOptionPane.showInputDialog(Digite:\n+ Somar \n- Subtrair \n/ Dividir \n* Multiplicar).charAt(0);
	   */
			 
	 
	 
	 
		
		
		
		
		
		
		
		

				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
