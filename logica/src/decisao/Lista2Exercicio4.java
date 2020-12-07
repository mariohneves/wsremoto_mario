package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("num1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("num2"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("num3"));
		
		if (num1!=num2 && num1!=num3 && num2!=num2) {
			
		}else {
			System.out.println("Existem valores iguais");
		}
		
		if (num1 > num2 && num1 > num3)  {
			System.out.println(num1);
			if (num2>num3) {
				System.out.println(num2);
				System.out.println(num3);
			}else
				System.out.println(num3);
			    System.out.println(num2);
		if (num2 > num1 && num2 > num3) {
			System.out.println(num2);
		}if (num1 > num3) {
			System.out.println(num1);
			System.out.println(num3);			
		}else {
			System.out.println(num3);
			System.out.println(num1);
		} if (num1>num2) {
			System.out.println(num1);
			System.out.println(num2);
		}else {
			System.out.println(num2);
			System.out.println(num1);
		}
		
		
		 
				
			}
				
		}
		
		

}
