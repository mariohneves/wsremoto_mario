package br.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Curso;

public class ImplementacaoCurso {

	public static void main(String[] args) {

		
		
		Curso curso = new Curso();
		
		curso.setAll(
				JOptionPane.showInputDialog("Descri��o"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor")),
				Short.parseShort(JOptionPane.showInputDialog("Carga Hor�ria")),
				JOptionPane.showInputDialog("Sigla"),
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				Integer.parseInt(JOptionPane.showInputDialog("Dura��o")))
				;
		
		System.out.println(curso.getAll());
		
		System.out.println(curso.getPromocao(20));
		System.out.println(curso.ajustarValor(10));
		
		
		
		
		
		
		
		
	}

}
