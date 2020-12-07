package variaveis;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		/* Crie uma aplicação que receba: (Nome da disciplina, notas dos 1º, 2º semestres, calcula e exiba a média
		 * 
		 * 
		 */

		String nomedadisciplina = JOptionPane.showInputDialog("Nome da Disciplina:");
		Double Nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota do 1º Semestre"));
		Double Nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota do 2º Semestre"));
		Double Media = (Nota1 + Nota2) / 2;
		
		
				
		System.out.println("Disciplina:" + nomedadisciplina);
		System.out.println("1º Semestre:" + Nota1);
		System.out.println("2º Semestre:" + Nota2);
		System.out.println("Média Aluno:" + (Media));
		
		
		
		
		/*
		 * Regras para identificadores: 
		 *  1ª - Não começar com números
		 *  2ª - Não usar palavras reservadas da linguagem (double, int, class, etc...)
		 *  3ª - Não usar caracteres especiais
		 *  
		 *  Padrões para identificadores:
		 *  CamelCase: cada palavra de um nome deve começar com letra maiscula (exceto variaveis que começam com letra miniscula)
		 *  Utilizar _ no local dos espaços data_de_nascimento
		 *  Utilize nomes significativos, evite criar variavéis sem sentido (X,y,Z e etc,,,)
		 *  Padrão UML (POO) criado para qualquer linguagem com paradigma ligado a objeto
		 *  	-> Toda Classe deve iniciar com letra maiscula
		 *  	-> Toda variavel deve iniciar com letra miniscula
		 *  	-> Todo método pertence a uma classe e deve vir seguido de " "
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
