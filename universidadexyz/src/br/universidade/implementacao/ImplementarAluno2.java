package br.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Aluno;

public class ImplementarAluno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Aluno aluno = new Aluno();
		
		
		aluno.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("Nome").toUpperCase(),
				JOptionPane.showInputDialog("CPF")
				);
		
		
		System.out.println(aluno.getAll());
		
		
		
		
		
		
		
		
		
		
		
	}

}
